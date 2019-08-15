package com.how2java.tmall.web;

import com.how2java.tmall.pojo.Booking;
import com.how2java.tmall.pojo.Building;
import com.how2java.tmall.service.BookingService;
import com.how2java.tmall.service.BuildingService;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/bookings")
    public Object add(@RequestBody Booking bean){
        bookingService.add(bean);
        return bean;
    }

    @DeleteMapping("/bookings/{id}")
    public String  delete(@PathVariable("id") int id){
        bookingService.delete(id);
        return null;
    }

    @GetMapping("/bookings/{id}")
    public Booking get(@PathVariable("id") int id){
        Booking bean = bookingService.get(id);
        return bean;
    }

    @PutMapping("/bookings")
    public Object update(@RequestBody Booking bean){
        bookingService.update(bean);
        return bean;
    }

}
