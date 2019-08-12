package com.how2java.tmall.web;

import com.how2java.tmall.pojo.Room;
import com.how2java.tmall.pojo.Type;
import com.how2java.tmall.service.RoomService;
import com.how2java.tmall.service.TypeService;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("/rooms")
    public Page4Navigator<Room> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<Room> page = roomService.list(start, size, 5);  //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        return page;
    }

}
