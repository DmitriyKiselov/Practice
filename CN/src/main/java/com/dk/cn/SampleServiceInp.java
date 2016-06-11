package com.dk.cn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;

@Service
public class SampleServiceInp<SignupForm> {

	@Autowired
	UserDao userDao;

	public SignupForm saveFrom(SignupForm signupForm) {

		// Shown for example only, you could use a constructor, builder pattern
		// or Dozer
		// point is that the DAO only knows and cares about users and not any UI
		// form.
		Users user = new Users();
		user.setName(signupForm.toString());
		user = userDao.save(user);
		System.out.println("Привет");
		return signupForm;

	}
}