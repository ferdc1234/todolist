package com.api.v1.todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.v1.todolist.model.Task;
import com.api.v1.todolist.service.TaskService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/v1/todolist")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping()
    public List<Task> getAllTask() {
        return taskService.listarTareas();
    }

    @PostMapping()
    public ResponseEntity<String> postTask(@RequestBody Task task) {
        try {
            taskService.guardarTarea(task);
            return ResponseEntity.ok("Tarea creada con éxito");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear la tarea");
        }
    }
    
    
    
}
