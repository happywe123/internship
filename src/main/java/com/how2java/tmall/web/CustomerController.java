package com.how2java.tmall.web;

import com.how2java.tmall.pojo.Card;
import com.how2java.tmall.pojo.Customer;
import com.how2java.tmall.service.CardService;
import com.how2java.tmall.service.CustomerService;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public Page4Navigator<Customer> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<Customer> page = customerService.list(start, size, 5);  //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        return page;
    }

    @GetMapping("/customers/{id}")
    public Customer get(@PathVariable("id") int id){
        Customer bean = customerService.get(id);
        return bean;
    }

    @PostMapping("/customers")
    public Object add(@RequestBody Customer bean){
        customerService.add(bean);
        return bean;
    }

//    @DeleteMapping("/customers/{id}")
//    public String delete(@PathVariable("id") int id, HttpServletRequest httpServletRequest){
//        customerService.delete(id);
//        return null;
//    }

    @PutMapping("/customers")
    public Object update(@RequestBody Customer bean){
        customerService.update(bean);
        return bean;
    }
}
