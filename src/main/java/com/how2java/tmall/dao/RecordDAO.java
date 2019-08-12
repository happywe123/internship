package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordDAO extends JpaRepository<Record,Integer> {
}
