package com.how2java.tmall.service;

import com.how2java.tmall.dao.BuildingDAO;
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
public class BuildingService {

    @Autowired
    BuildingDAO buildingDAO;


    public Page4Navigator<Building> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA = buildingDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
    public List<Building> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return buildingDAO.findAll(sort);
    }

//	public void add(Type bean) {
//		typeDAO.save(bean);
//	}
//
//	public void delete(int id) {
//		typeDAO.delete(id);
//	}
//
//	public Type get(int id) {
//		Type c= typeDAO.findOne(id);
//		return c;
//	}
//	public void update(Type bean) {
//		typeDAO.save(bean);
//	}
}
