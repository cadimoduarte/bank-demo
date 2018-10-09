package com.zup.study.bankdemo.controller;

import com.zup.study.bankdemo.model.Account;
import com.zup.study.bankdemo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @PostMapping("/accounts")
    public Account createAccount( @Valid @RequestBody Account account ){
        return accountRepository.save( account );
    }

    @GetMapping("/accounts")
    public Page<Account> getAllAccounts( Pageable pageable){
        return accountRepository.findAll(pageable);
    }

}
