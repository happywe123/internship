package com.how2java.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {
	@GetMapping(value="/admin")
    public String admin(){
		return "redirect:admin_type_list";
    }

	@GetMapping(value="/admin_type_list")
	public String listCategory(){
		return "admin/listType";
	}
}
