package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {
 /*
	@RequestMapping("/rest")
	public String restMsg(){
		return "this is rest msg";
	}*/
	@RequestMapping("/show")
	
	public String showJsp(Model model){
		model.addAttribute("key", "this is jsp page");
		return "view";
	}
	
	
}
