package packeges.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import packeges.entity.User;
import packeges.service.MessageService;

/**
 * Created by Vlad on 06.09.2016.
 */
@Controller
public class HomeController {

    @Autowired
    private MessageService messageService;

    /**
     * Домашня сторінка
     * @param model передається формі для заповнення реєстрації
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("u", new User());
        return "views-home-home";
    }

}
