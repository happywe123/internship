package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {
}
