package com.sasha.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String project;
	private String name;
	private String description;
	private String assignment;
	private String deadline;
	
	public Task() {
		super();
	}

	//constructor
	public Task(String project, String name, String description, String assignment, String deadline) {
		super();
		this.name = name;
		this.description = description;
		this.project = project;
		this.assignment=assignment;
		this.deadline = deadline;
	}
	
	//getters and setters below
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAssignment() {
		return assignment;
	}
	public void setAssignment(String username) {
		this.assignment = username;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}	
}