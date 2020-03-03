package com.lizhenfang.hgshop.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.lizhenfang.hgshop.service.UserService;
/**
 * 
 * @author Administrator
 *
 */
@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService{

	@Override
	public boolean login(String userName, String passWord) {
		// TODO Auto-generated method stub
		return "admin".equals(userName) && "123456".equals(passWord);
		
	}

}
