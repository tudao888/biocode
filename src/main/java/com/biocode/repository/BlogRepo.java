package com.biocode.repository;

import com.biocode.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BlogRepo extends PagingAndSortingRepository<Blog,Integer> {
    List<Blog> findAllByAccount_Id(Integer accountId);
}
