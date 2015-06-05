package com.jcboa.admin.controller.app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jcboa.admin.pojo.AdminUserData;

@Controller
@Scope("prototype")
@RequestMapping("/app")
public class AppController {
	
	@ResponseBody
	@RequestMapping("/login")
	public ModelAndView login() {
		AdminUserData aud = new AdminUserData();
		aud.setCard("1232");
		ModelAndView mav = new ModelAndView("home");
		
		return mav;
	}

}
