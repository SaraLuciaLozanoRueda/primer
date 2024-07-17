package com.intento.primer.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intento.primer.models.User;

@Controller
@RequestMapping("/registros")
public class UserRestController {
    public ArrayList <User> users = new ArrayList<>();
    @PostMapping("/create")
    public String create(@ModelAttribute User user){
        user.setNombre(user.getNombre());
        user.setApellido(user.getApellido());
        user.setProfesion(user.getProfesion());
        users.add(user);
        return "redirect:/details";
    }
}
