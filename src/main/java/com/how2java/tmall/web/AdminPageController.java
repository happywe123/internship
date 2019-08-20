package com.how2java.tmall.web;

import com.how2java.tmall.pojo.User;
import com.how2java.tmall.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminPageController {

//
//    public Object checkLogin( HttpSession session) {
//        User user =(User)  session.getAttribute("user");
//        if(null!=user)
//            return Result.success();
//        return Result.fail("未登录");
//    }


    // 登录页面的展示页
	@GetMapping(value="/admin")
	public String index(){
		return "redirect:login_page";
	}

	@GetMapping(value="/login_page")
	public String home(){
		return "admin/login";
	}

//    // 房间类型跳转页
//    @GetMapping(value="/admin")
//    public String admin(){
//        return "redirect:admin_type_list";
//    }

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

//    // 楼栋信息的展示页
//	@GetMapping(value="/admin_building_list")
//	public String listBuildings(){
//		return "admin/listBuilding";
//	}
//
//	@GetMapping(value="/admin_building_edit")
//    public String editBuildings(){
//	    return "admin/editBuilding";
//    }


}
