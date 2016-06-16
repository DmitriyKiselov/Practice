package com.dk.dao;

import java.util.List;

import com.dk.cn.Users;

public interface UserDao {

	public void save(Users p);

	public List<Users> list();

}