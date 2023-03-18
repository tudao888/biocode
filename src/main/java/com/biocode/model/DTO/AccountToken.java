package com.biocode.model.DTO;

import com.biocode.model.Account;
import com.biocode.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AccountToken {
    private Integer id;
    private String username;
    private String token;
    private Account account;

    private List<Role> roles;
}
