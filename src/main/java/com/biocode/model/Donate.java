package com.biocode.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Donate {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Post post;
}
