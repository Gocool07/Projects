package com.springcrudsql.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcrudsql.bean.User;
import com.springcrudsql.service.UserService;

@RestController
public class UserController 
{
	@Autowired
	private UserService us;
	
	@RequestMapping("/users")
	public List<User> getAllUsers()
	{
		return us.getAllUsers();		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/users")
	public void createUser(@RequestBody User user)
	{
		us.createUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/users/{userId}")
	public void updateUser(@PathVariable("userId") long userid,@RequestBody User user)
	{
		us.updateUser(userid,user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{userId}")
	public void DeleteUser(@PathVariable("userId") long userId)
	{
		us.deleteUser(userId);
	}
		

	
}
