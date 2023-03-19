package com.biocode.controller;

import com.biocode.model.Like;
import com.biocode.model.Vote;
import com.biocode.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/votes")
public class VoteController {
    @Autowired
    private VoteService voteService;
    @GetMapping("/{accountId}/{postId}")
    public ResponseEntity<Vote> findVoteByAccount_IdAndPost_Id(@PathVariable Integer accountId, @PathVariable Integer postId){
        return new ResponseEntity <Vote> (voteService.findVoteByAccount_IdAndPost_Id(accountId,postId), HttpStatus.OK);
    }
    @GetMapping("/{postId}")
    public ResponseEntity<List<Vote>> findAllByBlog_Id(@PathVariable Integer postId){
        return new ResponseEntity<List<Vote>>(voteService.findVoteByPost_Id(postId), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Vote> save(@RequestBody Vote vote){
            return new ResponseEntity<>(voteService.save(vote),HttpStatus.OK);
        }
    }
