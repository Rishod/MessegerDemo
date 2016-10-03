package packeges.service;

import packeges.entity.Message;
import packeges.entity.User;

import java.util.List;

/**
 * Created by Vlad on 06.09.2016.
 */
public interface MessageService {
    void send(String theme, String massage, User sender, User recipient);
    void save(Message message);
    void delete(int id);
    Message findById(int id);
    List<Message> findAllInputMessage(int idUser);
    List<Message> findAllOutputMessage(int idUser);
}
