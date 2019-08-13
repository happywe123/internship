package com.how2java.tmall.service;

import com.how2java.tmall.dao.BookingDAO;
import com.how2java.tmall.dao.BuildingDAO;
import com.how2java.tmall.pojo.Booking;
import com.how2java.tmall.pojo.Building;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingDAO bookingDAO;

    public Page4Navigator<Booking> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA = bookingDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
    public List<Booking> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return bookingDAO.findAll(sort);
    }



}
