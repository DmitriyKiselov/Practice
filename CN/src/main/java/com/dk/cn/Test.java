package com.dk.cn;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dk.dao.UserDao;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		UserDao userDao = context.getBean(UserDao.class);

		List<Users> list = userDao.list();

		for (Users p : list) {
			System.out.println("Users List::" + p);
		}

		// close resources
		context.close();
	}
}