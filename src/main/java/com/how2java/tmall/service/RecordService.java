package com.how2java.tmall.service;

import com.how2java.tmall.dao.RecordDAO;
import com.how2java.tmall.pojo.Record;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {


    @Autowired
    RecordDAO orderDAO;

    public Page4Navigator<Record> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA = orderDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
    public List<Record> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return orderDAO.findAll(sort);
    }

    public void add(Record bean){
        orderDAO.save(bean);
    }

    public void delete(int id){
        orderDAO.delete(id);
    }

    public Record get(int id){
        Record bean = orderDAO.findOne(id);
        return bean;
    }

    public void update(Record bean){
        orderDAO.save(bean);
    }

}
