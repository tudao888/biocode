package com.biocode.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Blog {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String contentBlog;
    private String image;

    @ManyToOne
    private Account account;
}
