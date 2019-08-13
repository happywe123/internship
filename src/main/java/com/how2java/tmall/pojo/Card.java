package com.how2java.tmall.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "card")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    private String category;
    private String state;
    private int locknum;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return state;
    }

    public void setStatus(String status) {
        this.state = status;
    }

    public int getLocknum() {
        return locknum;
    }

    public void setLocknum(int locknum) {
        this.locknum = locknum;
    }
}
