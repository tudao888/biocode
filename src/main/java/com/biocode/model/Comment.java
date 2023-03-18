package com.biocode.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Blog blog;

}
