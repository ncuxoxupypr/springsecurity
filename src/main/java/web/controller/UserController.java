package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.UserService;

import java.security.Principal;


@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getHomePage() {
        return "home_page";
    }

    @GetMapping("/user")
    public String clickMe(Model model, Principal principal) {
        model.addAttribute("oneUser", userService.getUserByName(principal.getName()));
        return "show_user";
    }
}



