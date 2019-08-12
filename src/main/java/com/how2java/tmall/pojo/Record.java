package com.how2java.tmall.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="record")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    private String ordercode;

    @ManyToOne
    @JoinColumn(name="cid")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="tid")
    private Type type;

    private double price;

    private Date intime;

    private Date livetime;

    private String teamremark;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Date getLivetime() {
        return livetime;
    }

    public void setLivetime(Date livetime) {
        this.livetime = livetime;
    }

    public String getTeamremark() {
        return teamremark;
    }

    public void setTeamremark(String teamremark) {
        this.teamremark = teamremark;
    }
}
