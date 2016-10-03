package packeges.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import packeges.entity.Message;
import packeges.entity.User;
import packeges.service.MessageService;
import packeges.service.UserService;

import java.security.Principal;
import java.util.List;

/**
 * Created by Vlad on 06.09.2016.
 */
@Controller
public class MessageController {
    @Autowired
    private MessageService messageService;

    @Autowired
    private UserService userService;

    /**
     * Обробка запиту для отримання вхідних повідомлень
     * @param principal юзер
     * @param model для передачі повідомлень користувачу
     * @return сторінка з вхідними повідомленнями
     */
    @RequestMapping(value = "/message/input", method = RequestMethod.GET)
    public String inputMessage(Principal principal, Model model){
        List<Message> messages = messageService.findAllInputMessage(Integer.parseInt(principal.getName()));
        model.addAttribute("messages", messages);
        return "views-message-allInput";
    }

    /**
     * Обробка запиту для отримання вихідних повідомлень
     * @param principal юзер
     * @param model для передачі повідомлень користувачу
     * @return сторінка з вхідними повідомленнями
     */
    @RequestMapping(value = "/message/output", method = RequestMethod.GET)
    public String outputMessage(Principal principal, Model model){
        List<Message> messages = messageService.findAllOutputMessage(Integer.parseInt(principal.getName()));
        model.addAttribute("messages", messages);
        return "views-message-allOutput";
    }

    /**
     * Обробка запиту для отримання тексту певного повідомлення
     * @param id ідентифікатор повідомлення
     * @param model для передачі повідомленя користувачу
     * @param principal юзер
     * @return сторінка з текстом повідомлення
     */
    @RequestMapping(value ="/message/text/{id}", method = RequestMethod.GET)
    public String getText(@PathVariable String id, Model model, Principal principal){
        Message message = messageService.findById(Integer.parseInt(id));

        if(message.getStatus() == 1 && message.getRecipient().getId() == Integer.parseInt(principal.getName()))
            message.setStatus(2);
        messageService.save(message);

        model.addAttribute("message", message);
        System.out.print(message.getId());
        return "views-message-text";
    }

    /**
     * Обробка запиту на відправку повідомлення
     * @param name ім'я отримувача
     * @param theme тема повідомлення
     * @param text текст повідомлення
     * @param principal юзер
     * @return сторінка з відправленими повідомленнями
     */
    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String send(@RequestParam("name") String name,@RequestParam("theme") String theme, @RequestParam("text") String text, Principal principal){

        if(name.equals("")
                ||theme.equals("")
                || text.equals(""))
            return "redirect:/message/output";
        else {
            User recipient = userService.findByUserName(name);

            if(recipient == null)
                return "redirect:/message/output";
            System.out.print(recipient);

            User sender = userService.findById(Integer.parseInt(principal.getName()));
            messageService.send(theme, text, sender, recipient);
        }
        return "redirect:/message/output";
    }



}
