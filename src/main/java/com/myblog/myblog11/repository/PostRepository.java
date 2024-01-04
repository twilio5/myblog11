package com.myblog.myblog11.repository;

import com.myblog.myblog11.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
