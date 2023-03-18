package com.biocode.repository;

import com.biocode.model.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CommentRepo extends PagingAndSortingRepository<Comment,Integer> {
    List<Comment> findAllByBlog_Id(Integer blogId);
    Comment findCommentByAccount_IdAndBlog_Id(Integer accountId,Integer blogId);
    void deleteCommentByAccount_IdAndBlog_Id(Integer accountId,Integer blogId);
}
