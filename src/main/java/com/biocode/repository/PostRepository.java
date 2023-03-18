package com.biocode.repository;

import com.biocode.model.Post;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface PostRepository extends CrudRepository<Post, Integer> {
    Post findPostByTitle(String title);
}
