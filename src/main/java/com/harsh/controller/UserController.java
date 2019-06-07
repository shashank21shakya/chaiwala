package com.harsh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.entity.User;
import com.harsh.repository.IUserDao;
import com.harsh.repository.impl.UserDao;
import com.harsh.util.ApiStatus;

@RestController
public class UserController {
	
	@Autowired
	private UserDao dao ; 
	
	@PostMapping("add")
	public ResponseEntity<?> add(@RequestBody User user){
		ApiStatus<User> api = dao.register(user);
		return ResponseEntity.status(HttpStatus.OK).body(api);
		
		
	}

}
