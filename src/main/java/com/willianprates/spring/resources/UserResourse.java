package com.willianprates.spring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willianprates.spring.entities.User;
import com.willianprates.spring.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@Autowired
	private UserServices service;
	

	@GetMapping
	public ResponseEntity<List<User>> FindAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
