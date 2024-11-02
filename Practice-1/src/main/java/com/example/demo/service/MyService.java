package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.MyRepository;
import com.example.demo.User;

@Service
public class MyService {
	
	@Autowired
	MyRepository repo;
	
	public List<User> getUsers()
	{
		List<User> users = repo.findAll();
		return users;
	}
	
	public User getUser(int id)
	{
		User user = repo.findById(id).orElse(null);
		return user;
	}

}
