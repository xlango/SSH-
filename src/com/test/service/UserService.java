package com.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserDao;

@Transactional
@Service(value="userService")
public class UserService {

	@Resource(name="userDao")
	private UserDao userDao;
	
	public void add() {
		System.out.println("service......");
		userDao.add();
	}
}
