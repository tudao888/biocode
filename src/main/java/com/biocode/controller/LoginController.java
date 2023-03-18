package com.biocode.controller;

import com.biocode.model.Account;
import com.biocode.model.DTO.AccountToken;
import com.biocode.model.Role;
import com.biocode.service.AccountService;
import com.biocode.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class LoginController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtService jwtService;

    @Autowired
    AccountService accountService;

    @PostMapping("/login")
    public AccountToken login(@RequestBody Account account){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(account.getUsername(), account.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtService.createToken(authentication);
        Account account1 = accountService.findAccountByUsername(account.getUsername());
        AccountToken accountToken = new AccountToken(account1.getId(),account1.getUsername(),token,account1,account1.getRoles());
        return accountToken;
    }

    @PostMapping("/register")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        List<Role> roles = new ArrayList<>();
        Role role = new Role();
        role.setId(2);
        roles.add(role);
        account.setRoles(roles);
        account.setAvatar("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-15.jpg");
        accountService.save(account);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

}
