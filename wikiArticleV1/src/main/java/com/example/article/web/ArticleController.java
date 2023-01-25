
package com.example.article.web;

import com.example.article.entities.Article;

import com.example.article.repository.ArticleRepository;
//import com.example.article.repository.WatingArticleRepository;
import com.example.article.repository.WatingArticleRepository;
import lombok.AllArgsConstructor;
import org.hibernate.query.results.ResultsHelper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class ArticleController {

    private ArticleRepository articleRepository;
   private WatingArticleRepository watingArticleRepository;





    @GetMapping(path = "/articles")
    public  String articles(Model model){
        List<Article> articles = articleRepository.findAll();
        model.addAttribute("listeArticles", articles);
        return "articles";
    }



}

