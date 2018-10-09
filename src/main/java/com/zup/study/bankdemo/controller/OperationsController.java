package com.zup.study.bankdemo.controller;

import com.zup.study.bankdemo.model.Operation;
import com.zup.study.bankdemo.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class OperationsController {

    @Autowired
    OperationRepository operationRepository;

    @PostMapping("/operations")
    public Operation createOperation(@Valid @RequestBody Operation operation){
        return operationRepository.save(operation);

    }

    @GetMapping("/operations")
    public Page<Operation> getAllOperations(Pageable pageable){
        return operationRepository.findAll(pageable);
    }

    @GetMapping("/operations/accountOrigin/{accountOriginId}")
    public Page<Operation> getOperationsByAccountOriginId(@PathVariable (value = "accountOriginId") Long accountOriginId, Pageable pageable ){
        return operationRepository.findByAccountOriginId(accountOriginId, pageable);
    }

    @GetMapping("/operations/accountTarget/{accountTargetId}")
    public Page<Operation> getOperationsByAccountTargetId(@PathVariable (value = "accountTargetId") Long accountTargetId, Pageable pageable ){
        return operationRepository.findByAccountTargetId(accountTargetId, pageable);
    }
}
