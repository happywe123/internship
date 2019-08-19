package com.how2java.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {

//    // 登录页面的展示页
//	@GetMapping(value="/")
//	public String index(){
//		return "redirect:home";
//	}
//	@GetMapping(value="/home")
//	public String home(){
//		return "admin/login";
//	}


    // 房间类型跳转页
    @GetMapping(value="/admin")
    public String admin(){
        return "redirect:admin_type_list";
    }

    @GetMapping(value="/admin_type_list")
    public String listTypes(){
        return "admin/listType";
    }

    @GetMapping(value="/admin_type_edit")
    public String editType(){
        return "admin/editType";
    }


    // 房间展示的跳转页
    @GetMapping(value="/admin_room_list")
    public String listRooms(){
        return "admin/listRooms";
    }

    @GetMapping(value="/admin_room_edit")
    public String editRoom(){
        return "admin/editRoom";
    }


    // 订单的页面跳转
    @GetMapping(value="/admin_orders_list")
    public String listOrders() {
        return "admin/listOrders";
    }

    @GetMapping(value="/admin_orders_edit")
    public String editOrders(){
        return "admin/editOrders";
    }


    // 顾客信息的展示页
	@GetMapping(value="/admin_customer_list")
	public String listCustomers() {
        return "admin/listCustomer";
    }

    @GetMapping(value="/admin_customer_edit")
    public String editCustomer(){
        return "admin/editCustomer";
    }

    // 卡片的展示页
	@GetMapping(value="/admin_card_list")
	public String listCards(){
		return "admin/listCard";
	}

	@GetMapping(value="/admin_card_edit")
    public String editCards(){
	    return "admin/editCard";
    }

    // 楼栋信息的展示页
	@GetMapping(value="/admin_building_list")
	public String listBuildings(){
		return "admin/listBuilding";
	}

	@GetMapping(value="/admin_building_edit")
    public String editBuildings(){
	    return "admin/editBuilding";
    }


}
