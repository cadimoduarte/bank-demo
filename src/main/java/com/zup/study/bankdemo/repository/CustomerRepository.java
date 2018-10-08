package com.zup.study.bankdemo.repository;

import com.zup.study.bankdemo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer> findById(Long id, Pageable pageable);
}
