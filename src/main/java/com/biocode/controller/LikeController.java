package com.biocode.controller;

import com.biocode.model.Like;
import com.biocode.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("like")
@CrossOrigin("*")
public class LikeController {
    @Autowired
    private LikeService likeService;
    @GetMapping("/{blogId}")
    public ResponseEntity<List<Like>> findAllByBlog_Id(@PathVariable Integer blogId){
        return new ResponseEntity<List<Like>>(likeService.findAllByBlog_Id(blogId), HttpStatus.OK);
    }
    @GetMapping("/{accountId}/{blogId}")
    public ResponseEntity <Like> findLikeByAccount_IdAndBlog_Id(@PathVariable Integer accountId,@PathVariable Integer blogId){
        return new ResponseEntity <Like> (likeService.findLikeByAccount_IdAndBlog_Id(accountId,blogId), HttpStatus.OK);
    }
    @DeleteMapping("/{accountId}/{blogId}")
    public ResponseEntity <?> deleteByAccount_IdAndBlog_Id(@PathVariable Integer accountId,@PathVariable Integer blogId){
        likeService.deleteByAccount_IdAndBlog_Id(accountId,blogId);
        return new ResponseEntity <> ( HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Like> save(@RequestBody Like like){
        return new ResponseEntity<>(likeService.saveLike(like),HttpStatus.OK) ;
    }
}
