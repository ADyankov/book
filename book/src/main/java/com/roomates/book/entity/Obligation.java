package com.roomates.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "obligation", schema = "book")
public class Obligation {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "amount")
    private String amount;

    @Column(name = "creditor")
    private Integer creditor;

    @Column(name = "status")
    private String status;

    @Column(name = "created_on")
    private Timestamp createdOn;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Integer getCreditor() {
        return creditor;
    }

    public void setCreditor(Integer creditor) {
        this.creditor = creditor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }
}
