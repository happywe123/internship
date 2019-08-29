package com.how2java.tmall.service;

import java.util.ArrayList;
import java.util.List;

import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.how2java.tmall.dao.TypeDAO;
import com.how2java.tmall.pojo.Type;

@Service
public class TypeService {
	@Autowired
	TypeDAO typeDAO;

	public Page4Navigator<Type> list(int start, int size, int navigatePages) {
		Sort sort = new Sort(Sort.Direction.DESC, "id");
		Pageable pageable = new PageRequest(start, size,sort);
		Page pageFromJPA = typeDAO.findAll(pageable);

		return new Page4Navigator<>(pageFromJPA,navigatePages);
	}

	public List<Type> list() {
    	Sort sort = new Sort(Sort.Direction.DESC, "id");
		return typeDAO.findAll(sort);
	}

	public void add(Type bean) {
		typeDAO.save(bean);
	}

	public void delete(int id) {
		typeDAO.delete(id);
	}

	public Type get(int id) {
		Type c= typeDAO.findOne(id);
		return c;
	}
	public void update(Type bean) {
		typeDAO.save(bean);
	}


	// 将所有房间类型的 name 存放在一个集合中，并将集合返回
	public List<String> getAllTypeName(){
		List<String> resList = new ArrayList<>();
		List<Type> list = typeDAO.findAll();
		for(int i = 0; i < list.size(); i++){
			resList.add(list.get(i).getName());
		}
		return resList;
	}


}
