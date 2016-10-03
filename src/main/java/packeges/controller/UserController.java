package packeges.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import packeges.entity.User;
import packeges.service.UserService;
import packeges.validator.UserValidator;

import java.security.Principal;

/**
 * Created by Vlad on 06.09.2016.
 */
@Controller
public class UserController {
    @Autowired
    private UserValidator userValidator;

    @Autowired
    private UserService userService;

    /**
     * Обробка запиту для отримання даних користувача під час реєстрації
     * @param user користувач, який проходить реєстрацію
     * @param bindingResult клас де записується помилки реєстрації
     * @return домашня сторінка
     */
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String reistration(@ModelAttribute User user, BindingResult bindingResult){
        userValidator.validate(user,bindingResult);
        if(bindingResult.hasErrors()){
            return "views-home-home";
        }
        else{
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            user.setPassword(encoder.encode(user.getPassword()));
            userService.add(user);
            return "redirect:/";
        }

    }

    /**
     * Обробка запиту для одержання даних профіля
     * @param principal користувач
     * @param model записуєм дані користувача
     * @return
     */
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(Principal principal, Model model){
        User user = userService.findById(Integer.parseInt(principal.getName()));
        model.addAttribute("user", user);
        return "views-user-page";
    }

}
