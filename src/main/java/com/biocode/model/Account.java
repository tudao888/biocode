package com.biocode.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer age;
    private String  address;
    private String phone;

    @ManyToOne
    private Role role;



}
