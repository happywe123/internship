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

    @GetMapping(value="/admin_room_list")
    public String listRooms(){
        return "admin/listRooms";
    }

    @GetMapping(value="/admin_room_edit")
    public String editRoom(){
        return "admin/editRoom";
    }

    @GetMapping(value="/admin_order_list")
    public String listOrders() {
        return "admin/listOrder";
    }

    @GetMapping(value="/admin_booking_list")
    public String listBookings() {
        return "admin/listBooking";
    }

    @GetMapping(value="/admin_booking_edit")
    public String editBooking(){
        return "admin/editBooking";
    }

	@GetMapping(value="/admin_customer_list")
	public String listCustomers() {
        return "admin/listCustomer";
    }

    @GetMapping(value="/admin_customer_edit")
    public String editCustomer(){
        return "admin/editCustomer";
    }

	@GetMapping(value="/admin_card_list")
	public String listCards(){
		return "admin/listCard";
	}

	@GetMapping(value="/admin_card_edit")
    public String editCards(){
	    return "admin/editCard";
    }

	@GetMapping(value="/admin_building_list")
	public String listBuildings(){
		return "admin/listBuilding";
	}

	@GetMapping(value="/admin_building_edit")
    public String editBuildings(){
	    return "admin/editBuilding";
    }


//	@GetMapping(value="/admin_hotel_list")
//	public String listHotels(){
//		return "admin/listHotel";
//	}

}
