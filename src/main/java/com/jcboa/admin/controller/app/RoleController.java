package com.jcboa.admin.controller.app;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jcboa.admin.pojo.RoleData;
import com.jcboa.admin.service.RoleService;
import com.jcboa.core.controller.BaseController;

@Controller
@Scope("prototype")
@RequestMapping("/role")
public class RoleController extends BaseController<RoleData, RoleService> {
	
	@Resource
	public void setBaseService(RoleService baseService) {
		this.baseService = baseService;
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public ModelAndView login() {
		
		try {
			RoleData role = this.baseService.queryById(new RoleData(1));
			modelView.addObject("role", role);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		modelView.setViewName("home");
		
		return modelView;
	}
	
}
