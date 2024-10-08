package com.api.v1.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.v1.todolist.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

