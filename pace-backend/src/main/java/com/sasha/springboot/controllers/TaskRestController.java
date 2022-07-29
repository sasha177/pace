package com.sasha.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sasha.springboot.entities.Task;
import com.sasha.springboot.repos.TaskRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TaskRestController {
	
	@Autowired
	TaskRepository repository;
	
	//rest controller stuff
	@RequestMapping(value = "/tasks", method = RequestMethod.GET)
	public List<Task> getTasks() {
		return repository.findAll();
	}

	@RequestMapping(value = "/tasks/{id}", method = RequestMethod.GET)
	public Task getTask(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	

	@RequestMapping(value = "/tasks", method = RequestMethod.POST)
	public Task createTask(@RequestBody Task applicant) {
		return repository.save(applicant);
	}

	@RequestMapping(value = "/tasks", method = RequestMethod.PUT)
	public Task updateTask(@RequestBody Task product) {
		return repository.save(product);
	}

	@RequestMapping(value = "/tasks/{id}", method = RequestMethod.DELETE)
	public void deleteTask(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}
