package packeges.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import packeges.entity.Message;
import packeges.entity.User;
import packeges.repo.MessageRepository;
import packeges.repo.UserRepository;
import packeges.service.MessageService;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Vlad on 06.09.2016.
 */
@Service
public class MessagaServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;


    @Override
    public void send(String theme, String text, User sender, User recipient) {
        Message message = new Message();
        message.setTheme(theme);
        message.setMessage(text);
        message.setSender(sender);
        message.setRecipient(recipient);
        message.setStatus(1);
        message.setDate(Calendar.getInstance().getTime());

        messageRepository.save(message);
    }


    @Override
    public void save(Message message) {
        messageRepository.save(message);
    }

    @Override
    public void delete(int id) {
        messageRepository.delete(id);
    }

    @Override
    public Message findById(int id) {
        return messageRepository.findOne(id);
    }

    @Override
    public List<Message> findAllInputMessage(int UserId) {
        List<Message> messages = messageRepository.findAllInputMessage(UserId);
        return messages;
    }

    @Override
    public List<Message> findAllOutputMessage(int UserId) {
        List<Message> messages = messageRepository.findAllOutnputMessage(UserId);
        return messages;
    }
}
