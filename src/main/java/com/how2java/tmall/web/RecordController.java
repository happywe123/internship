package com.how2java.tmall.web;



import com.how2java.tmall.pojo.Record;
import com.how2java.tmall.service.RecordService;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RecordController {

    @Autowired
    RecordService recordService;

//    @GetMapping("/orders")
//    public Page4Navigator<Record> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
//        start = start<0?0:start;
//        Page4Navigator<Record> page = recordService.list(start, size, 5);  //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
//        return page;
//    }
}
