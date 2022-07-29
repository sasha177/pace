package com.sasha.springboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasha.springboot.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
