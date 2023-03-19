package com.biocode.repository;

import com.biocode.model.Vote;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface VoteRePo extends PagingAndSortingRepository<Vote,Integer> {
    Vote findVoteByAccount_IdAndPost_Id(Integer accountId, Integer postId);
    List<Vote> findVoteByPost_Id (Integer postId);
}
