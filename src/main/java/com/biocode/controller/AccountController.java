package com.biocode.controller;

import com.biocode.model.Account;
import com.biocode.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountRepo accountRepo;

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable int id) {
        return new ResponseEntity<>(accountRepo.findById(id).get(), HttpStatus.OK);
    }
}
