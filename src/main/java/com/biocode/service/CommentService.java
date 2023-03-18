package com.biocode.service;

import com.biocode.model.Comment;
import com.biocode.repository.BlogRepo;
import com.biocode.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepo commentRepo;
    public Comment saveComment(Comment comment){
        return commentRepo.save(comment);
    }
    public List<Comment> findAllComentByBlogId(Integer blogId){
        return commentRepo.findAllByBlog_Id(blogId);
    }
    public Comment findCommentByAccount_IdAndBlog_Id(Integer accountId,Integer blogId){
        return commentRepo.findCommentByAccount_IdAndBlog_Id(accountId,blogId);
    }
    public void deleteCommentByAccount_IdAndBlog_Id(Integer accountId,Integer blogId){
        commentRepo.deleteCommentByAccount_IdAndBlog_Id(accountId,blogId);
    }
}
