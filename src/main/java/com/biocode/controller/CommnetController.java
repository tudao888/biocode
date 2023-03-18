package com.biocode.controller;

import com.biocode.model.Comment;
import com.biocode.model.Like;
import com.biocode.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("comment")
@CrossOrigin("*")
public class CommnetController {
    @Autowired
    private CommentService commentService;
    @GetMapping("/{blogId}")
    public ResponseEntity<List<Comment>> findAllComentByBlogId(@PathVariable Integer blogId){
        return new ResponseEntity<List<Comment>>(commentService.findAllComentByBlogId(blogId), HttpStatus.OK);
    }
    @GetMapping("/{accountId}/{blogId}")
    public ResponseEntity <Comment> findCommentByAccount_IdAndBlog_Id(@PathVariable Integer accountId,@PathVariable Integer blogId){
        return new ResponseEntity <Comment> (commentService.findCommentByAccount_IdAndBlog_Id(accountId,blogId), HttpStatus.OK);
    }
    @DeleteMapping("/{accountId}/{blogId}")
    public ResponseEntity <?> deleteByAccount_IdAndBlog_Id(@PathVariable Integer accountId,@PathVariable Integer blogId){
        commentService.deleteCommentByAccount_IdAndBlog_Id(accountId,blogId);
        return new ResponseEntity <> ( HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Comment> save(@RequestBody Comment comment){
        return new ResponseEntity<>(commentService.saveComment(comment),HttpStatus.OK) ;
    }
}
