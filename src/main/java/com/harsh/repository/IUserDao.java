package com.harsh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.User;
import com.harsh.util.ApiStatus;

public interface IUserDao  extends JpaRepository<User, Integer> {
	
}
