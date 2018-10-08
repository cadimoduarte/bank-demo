package com.zup.study.bankdemo.model;

import javax.persistence.*;

@Entity
@Table( name="operation")
public class Operation extends Audit {

    private static final String OPERATION_TYPE_DEPOSIT = "DEPOSIT";
    private static final String OPERATION_TYPE_TRANSFER = "TRANSFER";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name="operation_type")
    public String operationType;

    @Column(name="value")
    public Double value;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_origin_id")
    public Account accountOrigin;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_target_id", nullable = false)
    public Account accountTarget;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        //TODO: validate type of operation
        this.operationType = operationType;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Account getAccountOrigin() {
        return accountOrigin;
    }

    public void setAccountOrigin(Account accountOrigin) {
        this.accountOrigin = accountOrigin;
    }

    public Account getAccountTarget() {
        return accountTarget;
    }

    public void setAccountTarget(Account accountTarget) {
        this.accountTarget = accountTarget;
    }
}
