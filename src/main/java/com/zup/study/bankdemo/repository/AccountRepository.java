package com.zup.study.bankdemo.repository;

import com.zup.study.bankdemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
