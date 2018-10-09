package com.zup.study.bankdemo.repository;

import com.zup.study.bankdemo.model.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long> {
    Page<Operation> findByAccountTargetId(Long accountTargetId, Pageable pageable);

    Page<Operation> findByAccountOriginId(Long accountOriginId, Pageable pageable);
}
