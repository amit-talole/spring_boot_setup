package com.staxrt.tutorial.controller;

import com.staxrt.tutorial.model.User;
import com.staxrt.tutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class index {
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/")
    public String index (@ModelAttribute User user) {
       System.out.println(userRepository.findAll());
        return "index";
    }
}
