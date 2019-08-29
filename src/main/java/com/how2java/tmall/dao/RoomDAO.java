package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomDAO extends JpaRepository<Room,Integer> {
    List<Room> findRoomsByState(String state);

    int countByTypeId(int id);
}
