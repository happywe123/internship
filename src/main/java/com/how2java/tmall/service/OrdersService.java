package com.how2java.tmall.service;

import com.how2java.tmall.dao.OrdersDAO;
import com.how2java.tmall.pojo.Orders;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrdersService {

    @Autowired
    OrdersDAO ordersDAO;

    public Page4Navigator<Orders> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA = ordersDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }

    public List<Orders> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return ordersDAO.findAll(sort);
    }

    public void add(Orders bean){
        ordersDAO.save(bean);
    }

    public void delete(int id){
        ordersDAO.delete(id);
    }

    public Orders get(int id){
        Orders orders = ordersDAO.getOne(id);
        return orders;
    }

    public void update(Orders bean){
        ordersDAO.save(bean);
    }

}
