package com.biocode.service;

import com.biocode.model.Like;
import com.biocode.repository.BlogRepo;
import com.biocode.repository.LikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {
    @Autowired
    private LikeRepo likeRepo;
    public Like saveLike(Like like){
        return likeRepo.save(like);
    }
    public List<Like> findAllByBlog_Id (Integer blogId){
        return likeRepo.findAllByBlog_Id(blogId);
    }
    public Like findLikeByAccount_IdAndBlog_Id(Integer accountId,Integer blogId){
        return likeRepo.findLikeByAccount_IdAndBlog_Id(accountId,blogId);
    }
    public void deleteByAccount_IdAndBlog_Id(Integer accountId,Integer blogId){
        likeRepo.deleteByAccount_IdAndBlog_Id(accountId,blogId);
    }
}
