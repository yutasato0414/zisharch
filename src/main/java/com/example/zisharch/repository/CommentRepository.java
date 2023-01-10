package com.example.zisharch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zisharch.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}