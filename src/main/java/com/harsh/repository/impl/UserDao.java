package com.harsh.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.harsh.entity.User;
import com.harsh.repository.IUserDao;
import com.harsh.util.ApiStatus;

@Repository
public class UserDao {
	
	@Autowired
	private IUserDao dao;
	
	


	public ApiStatus<User> register(User user) {
		// TODO Auto-generated method stub
		
		User u = (User) dao.save(user);
		String status = "success";
		String message = "Reg succ";
		if(u==null)
		{
			status = "error";
			message="reg not succ";
		}
		
		
			
		return  new ApiStatus<User>(status, message, u);
	}



}
