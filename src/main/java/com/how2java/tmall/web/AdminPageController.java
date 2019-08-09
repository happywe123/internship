package com.how2java.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {

//	@GetMapping(value="/")
//	public String index(){
//		return "redirect:home";
//	}
//	@GetMapping(value="/home")
//	public String home(){
//		return "admin/login";
//	}



    @GetMapping(value="/admin")
    public String admin(){
        return "redirect:admin_order_list";
    }

    @GetMapping(value="/admin_order_list")
    public String listOrder() {
        return "admin/listOrder";
    }



//    @GetMapping(value="/admin")
//    public String admin(){
//        return "redirect:admin_booking_list";
//    }
//
//    @GetMapping(value="/admin_booking_list")
//    public String listCard() {
//        return "admin/listBooking";
//    }



//    @GetMapping(value="/admin")
//	public String admin(){
//		return "redirect:admin_customer_list";
//	}
//
//	@GetMapping(value="/admin_customer_list")
//	public String listCard() {
//        return "admin/listCustomer";
//    }
//

//	@GetMapping(value="/admin")
//	public String admin(){
//		return "redirect:admin_card_list";
//	}
//
//	@GetMapping(value="/admin_card_list")
//	public String listCard(){
//		return "admin/listCard";
//	}


//	@GetMapping(value="/admin")
//	public String admin(){
//		return "redirect:admin_room_list";
//	}
//
//	@GetMapping(value="/admin_room_list")
//	public String listRooms(){
//		return "admin/listRooms";
//	}


//	@GetMapping(value="/admin")
//	public String admin(){
//		return "redirect:admin_building_list";
//	}
//
//	@GetMapping(value="/admin_building_list")
//	public String listBuilding(){
//		return "admin/listBuilding";
//	}


//	@GetMapping(value="/admin")
//	public String admin(){
//		return "redirect:admin_hotel_list";
//	}
//
//	@GetMapping(value="/admin_hotel_list")
//	public String listHotel(){
//		return "admin/listHotel";
//	}



//	@GetMapping(value="/admin")
//    public String admin(){
//		return "redirect:admin_type_list";
//    }
//
//	@GetMapping(value="/admin_type_list")
//	public String listType(){
//		return "admin/listType";
//	}
}
