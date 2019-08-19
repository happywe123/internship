package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersDAO extends JpaRepository<Orders, Integer> {
}
