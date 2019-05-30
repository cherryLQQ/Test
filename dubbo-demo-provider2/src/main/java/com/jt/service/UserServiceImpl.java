package com.jt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
@Service(timeout=3000)
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {	
		return userMapper.selectList(null);
	}
	@Override
	public String saveUser(User user) {
		 userMapper.insert(user);
		 return "9002";
	}

}
