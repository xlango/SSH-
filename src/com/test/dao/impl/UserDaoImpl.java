package com.test.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.test.dao.UserDao;
import com.test.entity.User;

@Repository(value="userDao")
public class UserDaoImpl implements UserDao{

	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	public void add() {
		//HibernateTemplate hibernateTemplate=new HibernateTemplate();
		//hibernateTemplate.save(entity);
		System.out.println("dao......");
		/*User user=new User();
		user.setUsername("tom");
		user.setAddress("China");
		
		hibernateTemplate.save(user);*/
		
		/*User user=hibernateTemplate.get(User.class, 2);
		System.out.println("username==="+user.getUsername()+"address==="+user.getAddress());*/
		
		//find方法返回所有记录
		/*List<User> list=(List<User>) hibernateTemplate.find("from User");
		for (User user:list) {
			System.out.println("username==="+user.getUsername()+"::address==="+user.getAddress());
		}*/
		
		//find方法条件查询
		List<User> list=(List<User>)hibernateTemplate.find("from User where username=?", "sam");
		for (User user:list) {
			System.out.println("username==="+user.getUsername()+"::address==="+user.getAddress());
		}
	}
}
