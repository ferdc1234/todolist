package com.api.v1.todolist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.v1.todolist.model.Task;
import com.api.v1.todolist.repository.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository tareaRepository;

    public List<Task> listarTareas() {
        return tareaRepository.findAll(); // Llama a findAll para obtener todas las tareas
    }

    public Optional<Task> obtenerTareaPorId(Long id) {
        return tareaRepository.findById(id); // Busca una tarea por ID
    }

    public Task guardarTarea(Task tarea) {
        return tareaRepository.save(tarea); // Guarda una nueva tarea o actualiza una existente
    }

    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id); // Elimina una tarea por ID
    }
}

