package com.biocode.repository;

import com.biocode.model.Like;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LikeRepo extends PagingAndSortingRepository<Like,Integer> {
    List<Like> findAllByBlog_Id(Integer blogId);

    Like findLikeByAccount_IdAndBlog_Id(Integer accountId, Integer blogId);
    void deleteByAccount_IdAndBlog_Id(Integer accountId, Integer blogId);
}
