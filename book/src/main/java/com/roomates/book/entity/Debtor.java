package com.roomates.book.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "debtor", schema = "book")
public class Debtor {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "obligation_id")
    private Integer obligationId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "amount")
    private String amouont;

    @Column(name = "status")
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getObligationId() {
        return obligationId;
    }

    public void setObligationId(Integer obligationId) {
        this.obligationId = obligationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAmouont() {
        return amouont;
    }

    public void setAmouont(String amouont) {
        this.amouont = amouont;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
