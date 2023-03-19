package com.biocode.service;

import com.biocode.model.Vote;
import com.biocode.repository.VoteRePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {
    @Autowired
    private VoteRePo voteRePo;
    public Vote findVoteByAccount_IdAndPost_Id(Integer accountId, Integer postId){
        return voteRePo.findVoteByAccount_IdAndPost_Id(accountId, postId);
    }
    public List<Vote> findVoteByPost_Id(Integer postId){
        return voteRePo.findVoteByPost_Id(postId);
    }
    public Vote save(Vote vote){
        return voteRePo.save(vote);
    }
}
