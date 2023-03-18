package com.biocode.service;

import com.biocode.model.Post;
import com.biocode.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    List<Post> getAllPost() {
        return (List<Post>) postRepository.findAll();
    }

    Post save(Post post) {
        return postRepository.save(post);
    }

    void deleteById(int id) {
        postRepository.deleteById(id);
    }

    Post findPostById(int id) {
       return postRepository.findById(id).get();
    }

    Post findPostByTitle(String title) {
        return postRepository.findPostByTitle(title);
    }
}
