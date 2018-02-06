package com.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.admin.controller.base.BaseController;
import com.consumer.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController extends BaseController{
	
	@Resource
	private LoginService loginService;
	
	@RequestMapping("login")
	@ResponseBody
	public String login() {
		String login = loginService.login("yasuo");
		return login;
	}
}
