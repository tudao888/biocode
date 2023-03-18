package com.biocode.repository;

import com.biocode.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepo extends PagingAndSortingRepository<Account, Integer> {
    Account findAllByUsername(String username);

    Account findAccountByUsername(String username);
}
