package com.sasha.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sasha.springboot.entities.Project;
import com.sasha.springboot.repos.ProjectRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectRestController {
	
	@Autowired
	ProjectRepository repository;
	
	//rest controller stuff
	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public List<Project> getProjects() {
		return repository.findAll();
	}

	@RequestMapping(value = "/projects/{id}", method = RequestMethod.GET)
	public Project getProject(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	

	@RequestMapping(value = "/projects", method = RequestMethod.POST)
	public Project createProject(@RequestBody Project applicant) {
		return repository.save(applicant);
	}

	@RequestMapping(value = "/projects", method = RequestMethod.PUT)
	public Project updateProject(@RequestBody Project product) {
		return repository.save(product);
	}

	@RequestMapping(value = "/projects/{id}", method = RequestMethod.DELETE)
	public void deleteProject(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}
