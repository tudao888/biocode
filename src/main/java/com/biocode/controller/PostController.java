package com.biocode.controller;

import com.biocode.model.Post;
import com.biocode.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> getAllPost() {
        return new ResponseEntity<>(postService.getAllPost(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        String DateOfPost= new Date().toString();
        post.setDateOfPost(DateOfPost);
        return new ResponseEntity<>(postService.save(post), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Post> findPostById(@PathVariable int id) {
        return new ResponseEntity<>(postService.findPostById(id), HttpStatus.OK);
    }

    @GetMapping("/search/{stringSearch}")
    public ResponseEntity<List<Post>> searchPostByTitle(@PathVariable String stringSearch) {
        return new ResponseEntity<>(postService.findPostsByTitle(stringSearch), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deletePostById(@PathVariable int id) {
        postService.deleteById(id);
    }


}
