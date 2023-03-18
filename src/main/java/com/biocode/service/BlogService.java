package com.biocode.service;

import com.biocode.model.Blog;
import com.biocode.repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepo blogRepo;



    public Blog saveBlog(Blog blog){
        return blogRepo.save(blog);
    }


    public Blog findBlogById(Integer blogId){
        return blogRepo.findById(blogId).get();
    }
    public List<Blog> findAllBlogByAccountId(Integer accountId){
        return blogRepo.findAllByAccount_Id(accountId);
    }
}
