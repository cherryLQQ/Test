package com.jt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jt.pojo.User;
import com.jt.service.UserService;

@RestController
public class UserController {
	@Reference(timeout=3000,check=true)
	private UserService userService;
	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
	@RequestMapping("/saveUser/{name}/{age}/{sex}")
	public String saveUser(User user){
		return userService.saveUser(user);
		
	}

}
