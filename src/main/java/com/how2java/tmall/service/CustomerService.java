package com.how2java.tmall.service;

import com.how2java.tmall.dao.CardDAO;
import com.how2java.tmall.dao.CustomerDAO;
import com.how2java.tmall.pojo.Card;
import com.how2java.tmall.pojo.Customer;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDAO customerDAO;


    public Page4Navigator<Customer> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA = customerDAO.findAll(pageable);
        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }

    public List<Customer> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return customerDAO.findAll(sort);
    }
}
