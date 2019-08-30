package com.how2java.tmall.web;

import com.how2java.tmall.pojo.Orders;
import com.how2java.tmall.service.OrdersService;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    OrdersService ordersService;

    @GetMapping("/orders")
    public Page4Navigator<Orders> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<Orders> page = ordersService.list(start, size, 5);  //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        return page;
    }

    @PostMapping("/orders")
    public Object add(@RequestBody Orders bean){
        ordersService.add(bean);
        return bean;
    }

    @DeleteMapping("/orders/{id}")
    public String  delete(@PathVariable("id") int id){
        ordersService.delete(id);
        return null;
    }

    @GetMapping("/orders/{id}")
    public Orders get(@PathVariable("id") int id){
        Orders bean = ordersService.get(id);
        return bean;
    }

    @PutMapping("/orders")
    public Object update(@RequestBody Orders bean){
        ordersService.update(bean);
        return bean;
    }

    // 返回 orders 表中的所有订单
    @GetMapping("/ordersforitem")
    public List<Orders> getAllOrders(){
        return ordersService.list();
    }

}
