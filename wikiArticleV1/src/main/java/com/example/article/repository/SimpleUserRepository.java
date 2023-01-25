package com.example.article.repository;

import com.example.article.entities.SimpleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleUserRepository extends JpaRepository<SimpleUser,Long> {
}
