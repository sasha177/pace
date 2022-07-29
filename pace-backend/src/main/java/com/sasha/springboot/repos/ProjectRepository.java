package com.sasha.springboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasha.springboot.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
