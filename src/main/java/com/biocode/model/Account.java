package com.biocode.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;

}
