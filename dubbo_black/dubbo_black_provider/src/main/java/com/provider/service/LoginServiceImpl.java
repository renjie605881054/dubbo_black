package com.provider.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.consumer.entity.User;
import com.consumer.service.LoginService;
import com.provider.dao.LoginMapper;

@Service
public class LoginServiceImpl implements LoginService {

	@Resource
	private LoginMapper loginMapper;
	
	@Override
	public String login(String userName) {
		User user = new User();
		user.setUserName(userName);
		List<User> list = loginMapper.getList(user);
		return list!=null?list.get(0).toString():"暂无信息";
	}

}
