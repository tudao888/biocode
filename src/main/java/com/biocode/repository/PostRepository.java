package com.biocode.repository;

import com.biocode.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PostRepository extends CrudRepository<Post, Integer> {
    List<Post> findPostsByTitle(String title);
}
