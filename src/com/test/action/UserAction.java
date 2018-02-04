package com.test.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.test.service.UserService;

@Controller(value="userAction")
public class UserAction extends ActionSupport {

	@Resource(name="userService")
	private UserService userService;
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("action......");
		userService.add();
		return NONE;
	}
}
