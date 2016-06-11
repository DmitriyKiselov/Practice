package dao;

import org.springframework.data.repository.CrudRepository;

import com.dk.cn.Users;

public interface UserDao extends CrudRepository<Users, Integer> {
}