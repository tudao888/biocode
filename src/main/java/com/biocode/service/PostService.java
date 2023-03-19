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

    public List<Post> getAllPost() {
        return (List<Post>) postRepository.findAll();
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }

    public void deleteById(int id) {
        postRepository.deleteById(id);
    }

    public Post findPostById(int id) {
       return postRepository.findById(id).get();
    }

    public List<Post> findPostsByTitle(String title) {
        return postRepository.findPostsByTitle(title);
    }

}
