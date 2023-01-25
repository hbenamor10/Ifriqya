package com.example.article.web;

import com.example.article.entities.Article;
import com.example.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
@Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/")
    public String viewHomePage(Model model,
                               @RequestParam(name = "page",defaultValue = "0") int page,
                               @RequestParam(name="size",defaultValue = "5")  int size){
        Page<Article> pageArticles = articleRepository.findAll(PageRequest.of(page,size));

        // List<Article> articles = articleRepository.findAll();
        model.addAttribute("listeArticles", pageArticles.getContent()
                //model.addAttribute()
        );
        return "index";
    }
    @GetMapping(path = "/index")
    public  String index(Model model,
                         @RequestParam(name = "page",defaultValue = "0") int page,
                         @RequestParam(name="size",defaultValue = "5")  int size){
       /*
        Page<Article> pageArticles = articleRepository.findAll(PageRequest.of(page,size));
        List<Article> articles = articleRepository.findAll();
       */
        Page<Article> articles = articleRepository.findAll(PageRequest.of(page, size));
        model.addAttribute("listeArticles", articles.getContent()

        );
        return "index";
    }

    @GetMapping(path = "/test2")
    public  String test2(){

        return "test2";
    }

    @GetMapping(path = "/choosenArticle")
    public  String choosenArticle(Model model,
                                  @RequestParam(name = "articleNbre" ) String articleNbre){

        Long articleId = Long.parseLong(articleNbre);
        //< Article> chosenarticle = articleRepository.findById(articleId);
        /*String titre = chosenarticle.getTitle();
        String auteur = chosenarticle.getAuthor();
        model.addAttribute("titre");
        model.addAttribute("auteur");

       System.out.println(auteur);
       System.out.println(titre);*/
        return "choosenArticle";
    }

    @GetMapping(path = "/test3")
    public  String test3(){

        return "listeDesUsers";
    }

    @GetMapping(path = "/test4")
    public  String test4(){

        return "test4";
    }
}
