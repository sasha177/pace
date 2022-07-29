package com.sasha.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sasha.springboot.entities.User;
import com.sasha.springboot.repos.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {
	
	@Autowired
	UserRepository repository;
	
	//rest controller stuff
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getusers() {
		return repository.findAll();
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public User getuser(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public User createuser(@RequestBody User applicant) {
		return repository.save(applicant);
	}

	@RequestMapping(value = "/users", method = RequestMethod.PUT)
	public User updateuser(@RequestBody User product) {
		return repository.save(product);
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public void deleteuser(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}
