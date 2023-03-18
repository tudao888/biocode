package com.biocode.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String contentPost;
    private String image;
    private String startAt;
    private String endAt;
    private String dateOfPost;
    private String address;
    private Integer maxVote;
    private Integer status;
    // 1: Chờ duyệt
    // 2: Đã duyệt
    // 3: Đã kết thúc

    @ManyToOne
    private Account account;
}
