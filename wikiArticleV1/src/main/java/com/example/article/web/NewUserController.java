package com.example.article.web;

import com.example.article.entities.SimpleUser;
import com.example.article.repository.SimpleUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class NewUserController {
    @Autowired
    private SimpleUserRepository simpleUserRepository;

    @GetMapping(path = "/SignUp")
    public  String signUp(Model model){
        model.addAttribute("simpleUser", new SimpleUser("","","","",""));
        return "registreForm";
    }

    @PostMapping(path = "/saveUser")
    public String saveUser(Model model , SimpleUser simpleUser){
        simpleUserRepository.save(simpleUser);
        return "listeDesUsers";
    }
    @GetMapping(path = "/listeDesUsers")
    public String listeDesUsers(Model model){


        List<SimpleUser> users = simpleUserRepository.findAll();
        model.addAttribute("listusers",users );
        return "listeDesUsers";
    }
}

