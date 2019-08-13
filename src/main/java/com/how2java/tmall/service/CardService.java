package com.how2java.tmall.service;

import com.how2java.tmall.dao.CardDAO;
import com.how2java.tmall.pojo.Card;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    CardDAO cardDAO;

    public Page4Navigator<Card> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA = cardDAO.findAll(pageable);
        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }

    public List<Card> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return cardDAO.findAll(sort);
    }
}
