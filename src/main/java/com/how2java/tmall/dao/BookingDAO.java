package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDAO extends JpaRepository<Booking, Integer> {
}
