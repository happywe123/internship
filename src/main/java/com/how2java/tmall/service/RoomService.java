package com.how2java.tmall.service;

import com.how2java.tmall.dao.RoomDAO;
//import com.how2java.tmall.pojo.Hotel;
import com.how2java.tmall.pojo.Room;
import com.how2java.tmall.util.Page4Navigator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class RoomService {

    @Autowired
    RoomDAO roomDAO;

    public Page4Navigator<Room> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA = roomDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
    public List<Room> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return roomDAO.findAll(sort);
    }

    public void add(Room bean){
        roomDAO.save(bean);
    }

    public void delete(int id){
        roomDAO.delete(id);
    }

    public Room get(int id){
        Room bean = roomDAO.findOne(id);
        return bean;
    }

    public void update(Room bean){
        roomDAO.save(bean);
    }


    // 数据可视化
    public Map<String,Integer> getForView(){
        Map<String,Integer> map  =new HashMap<>();
        map.put("空净房",0);
        map.put("脏房",0);
        map.put("维修房",0);
        map.put("打扫房",0);
        map.put("预订房",0);
        for(String key : map.keySet()){
            map.put(key,roomDAO.findRoomsByState(key).size());
        }
       // System.out.println(map.get("空净房"));
        return map;
    }

    // 数据可视化--房型图
    public Map<String, Integer> getForRoomType(){
        Map<String,Integer> mapNumber  =new HashMap<>();
        Map<Integer,String> typeMap = new HashMap<>();
        typeMap.put(1,"单人间");
        typeMap.put(2,"套房");
        typeMap.put(3,"大床房");
        typeMap.put(4,"标准间");

        for(int i = 1; i <= 4; i++){
            mapNumber.put(typeMap.get(i),roomDAO.countByTypeId(i));
        }
        System.out.println(mapNumber.get("单人间"));
        return mapNumber;
    }

}
