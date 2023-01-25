package com.example.article.web;

import com.example.article.entities.Article;
import com.example.article.entities.SimpleUser;
import com.example.article.entities.User;
import com.example.article.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    /*@GetMapping(path = "/listeDesUsers")
    public String listeDesUsers(Model model){


        List<SimpleUser> users = s.findAll();
        model.addAttribute("listusers",users );
        return "listeDesUsers";
    }*/
    }

