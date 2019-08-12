package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelDAO extends JpaRepository<Hotel,Integer> {
}
