package com.example.article;

import com.example.article.entities.*;
import com.example.article.repository.SimpleUserRepository;
import com.example.article.repository.WatingArticleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;

//import com.example.article.repository.ArticleRepository;



@SpringBootApplication
public class WikiArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WikiArticleApplication.class, args);
	}
	

	/* @Bean public CommandLineRunner commandLineRunner(SimpleUserRepository simpleUserRepository) {

		 SimpleUser u1 = new SimpleUser("Mohamed","Mahmod","07/11/1994","med@rmail.com","123") ;
		 SimpleUser u2 = new SimpleUser("Mahmoud","Mahmod","07/11/1994","mahmoud@rmail.com","123") ;
		 SimpleUser u3 = new SimpleUser("Adam","Mahmod","07/11/1994","adam@rmail.com","123") ;
		 SimpleUser u4 = new SimpleUser("Omar","Mahmod","07/11/1994","Omar@rmail.com","123") ;

		 return args ->{
				simpleUserRepository.save(u1);
			 simpleUserRepository.save(u2);
			 simpleUserRepository.save(u3);
			 simpleUserRepository.save(u4);

		 };
	}
	*/

}

