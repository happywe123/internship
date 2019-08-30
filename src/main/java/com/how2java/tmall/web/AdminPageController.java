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


    // 后端主页面，即展示页
	@GetMapping(value="/")
	public String index(){
		return "redirect:adminPage";
	}

    @GetMapping(value="/adminPage")
    public String home(){
        return "admin/home";
    }

    // 登录页面
	@GetMapping(value="/login_page")
	public String loginpage(){
		return "admin/login";
	}

	//顶部导航栏-后台配置页面跳转
    @GetMapping(value="/admin_backstage")
    public String adminBackStage(){
	    return "fore/backstage";
    }


	// 导航栏跳转到直接入住界面
    @GetMapping(value="/zhijieruzhu")
    public String zhiJie(){
	    return "in/information";
    }

    @GetMapping(value="/information")
    public String information(){
        return "in/information";
    }

    @GetMapping("/selectroom")
    public String selectRoom(){
        return "in/selectroom";
    }

    @GetMapping("/money")
    public String money(){
        return "in/money";
    }

    // 办理退房
    @GetMapping(value="/checkout")
    public String checkOut(){
        return "fore/checkout";
    }


    // 办理换房
    @GetMapping(value="/changeRoom")
    public String changeRoom(){
        return "fore/changeroom";
    }

    // 办理续房
    @GetMapping(value="/renewal")
    public String reneWal(){
        return "fore/renewal";
    }


    // 图表类，用于对后台数据的可视化展示
    @GetMapping(value="roomEcharts")
    public String roomShow(){
        return "fore/roomEcharts";
    }

    // 员工树形图
    @GetMapping(value="userTree")
    public String userShow(){
        return "fore/userTree";
    }


    // 测试 Vue 路由转换
    @GetMapping(value="test")
    public String test(){
        return "fore/xinwen2";
    }


    // 退出当前登录界面
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:login_page";
    }













//    // 房间类型跳转页
//    @GetMapping(value="/admin")
//    public String admin(){
//        return "redirect:admin_type_list";
//    }

    // 房间类型跳转界面
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
