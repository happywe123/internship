package com.how2java.tmall.web;

import com.how2java.tmall.pojo.Booking;
import com.how2java.tmall.pojo.Building;
import com.how2java.tmall.service.BookingService;
import com.how2java.tmall.service.BuildingService;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/bookings")
    public Page4Navigator<Booking> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<Booking> page = bookingService.list(start, size, 5);  //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        return page;
    }
}
