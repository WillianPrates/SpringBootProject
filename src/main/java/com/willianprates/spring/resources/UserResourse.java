package com.willianprates.spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willianprates.spring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	

	@GetMapping
	public ResponseEntity<User> FindAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "123455");
		return ResponseEntity.ok().body(u);
	}
}
