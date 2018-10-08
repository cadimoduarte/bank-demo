package com.zup.study.bankdemo.repository;

import com.zup.study.bankdemo.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long> {
}
