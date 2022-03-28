package com.springcrudsql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrudsql.bean.User;
import com.springcrudsql.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	public UserRepository userRepo;
	
	public List<User> getAllUsers()
	{
		List<User> users=new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}
	
	public void createUser(User user)
	{
		userRepo.save(user);
	}

	public void updateUser(long userId, User user)
	{
		userRepo.save(user);
	}
	
	public void deleteUser(long userId)
	{
		userRepo.deleteById(userId);
	}

}
