package com.biocode.service;

import com.biocode.model.Account;
import com.biocode.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements UserDetailsService {

    @Autowired
    private AccountRepo accountRepo;


    public Account save(Account account) {
        return accountRepo.save(account);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepo.findAllByUsername(username);
        return new User(account.getUsername(), account.getPassword(),account.getRoles());
    }

    public Account createAccount(Account account) {
        accountRepo.save(account);
        return account;
    }
}
