package com.how2java.tmall.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    private String name;
    private String sex;
    private int telphone;
    private String document;
    private int documentnumber;
    private String lvxingtuan;

    private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getTelphone() {
        return telphone;
    }

    public void setTelphone(int telphone) {
        this.telphone = telphone;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getDocumentnumber() {
        return documentnumber;
    }

    public void setDocumentnumber(int documentnumber) {
        this.documentnumber = documentnumber;
    }

    public String getLvxingtuan() {
        return lvxingtuan;
    }

    public void setLvxingtuan(String lvxingtuan) {
        this.lvxingtuan = lvxingtuan;
    }


}
