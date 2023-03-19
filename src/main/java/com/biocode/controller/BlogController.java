package com.biocode.controller;

import com.biocode.model.Blog;
import com.biocode.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("blogs")
@CrossOrigin("*")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @PostMapping
    public ResponseEntity<Blog> save(@RequestBody Blog blog){
        return new ResponseEntity<>(blogService.saveBlog(blog), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Blog> findBlogById(@PathVariable Integer blogId){
        return new ResponseEntity<>(blogService.findBlogById(blogId), HttpStatus.OK);
    }
    @GetMapping("/allBlogByAccountId/{accountId}")
    public ResponseEntity<List<Blog>> findAllByAccount_Id(@PathVariable Integer accountId){
        return new ResponseEntity<>(blogService.findAllBlogByAccountId(accountId),HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Blog>> findAllBlog(){
        return new ResponseEntity<>(blogService.findAllBlog(), HttpStatus.OK);
    }
}
