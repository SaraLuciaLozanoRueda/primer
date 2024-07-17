package com.intento.primer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.intento.primer.models.User;

@Controller
public class UserController {
@Autowired
UserRestController usr;
    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("users", usr.users);
        System.out.println(usr.users);
        return "details";
    }
}
