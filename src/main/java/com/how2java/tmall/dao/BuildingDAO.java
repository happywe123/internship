package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Building;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BuildingDAO  extends JpaRepository<Building,Integer> {


}
