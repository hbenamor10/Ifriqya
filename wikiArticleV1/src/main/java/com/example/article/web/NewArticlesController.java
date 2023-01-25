package com.example.article.web;

import com.example.article.entities.ArticleV1;
import com.example.article.entities.WaitingArticle;
import com.example.article.repository.WatingArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewArticlesController {
   @Autowired
   private WatingArticleRepository watingArticleRepository;

    @GetMapping(path = "/newArticle")
    public  String newArticle(Model model){
        model.addAttribute("watingArticle",new WaitingArticle());

        return "newArticle";
    }
    @PostMapping(path = "/saveArticle")
    public  String newArticle(Model model, WaitingArticle waitingArticle){
       watingArticleRepository.save(waitingArticle);
        return "index";
    }
}
