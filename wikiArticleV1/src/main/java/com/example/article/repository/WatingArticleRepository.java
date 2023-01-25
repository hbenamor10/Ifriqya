
package com.example.article.repository;

import com.example.article.entities.WaitingArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatingArticleRepository extends JpaRepository<WaitingArticle,Long> {
}

