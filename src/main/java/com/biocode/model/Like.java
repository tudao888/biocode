package com.biocode.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Data
@Table(name = "bioLike")
public class Like {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Blog blog;

}
