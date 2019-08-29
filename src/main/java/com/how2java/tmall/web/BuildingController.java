package com.how2java.tmall.web;

import com.how2java.tmall.pojo.Building;
import com.how2java.tmall.service.BuildingService;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class BuildingController {

    @Autowired
    BuildingService buildingService;

    @GetMapping("/buildings")
    public Page4Navigator<Building> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<Building> page = buildingService.list(start, size, 5);  //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        return page;
    }

    @PostMapping("/buildings")
    public Object add(@RequestBody Building bean){
        buildingService.add(bean);
        return bean;
    }

    @DeleteMapping("/buildings/{id}")
    public String delete(@PathVariable("id") int id, HttpServletRequest httpServletRequest){
        buildingService.delete(id);
        return null;
    }

    @PutMapping("/buildings")
    public Object update(@RequestBody Building bean){
        buildingService.update(bean);
        return bean;
    }

    @GetMapping("/buildings/{id}")
    public Building get(@PathVariable("id") int id){
        Building bean = buildingService.get(id);
        return bean;
    }

    @GetMapping("/testbuilding")
    public List<Building> getall(){
        List<Building>  list = buildingService.getAll();
        return list;

    }


}
