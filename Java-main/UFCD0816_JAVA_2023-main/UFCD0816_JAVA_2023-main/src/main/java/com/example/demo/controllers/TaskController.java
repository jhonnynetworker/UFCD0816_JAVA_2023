package com.example.demo.controllers;

import com.example.demo.models.Task;
import com.example.demo.repositories.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/")
public class TaskController 
{

    @GetMapping("/Hello")
    public String hello() 
    {
        return "Hello, world!";
    }

    @GetMapping("/tarefa/{tarefa}")
    public String greet(@PathVariable String tarefa) 
    {
        return "Tarefa para hoje: " + tarefa + "!";
    }

    private final taskRepository taskRepository;

    @Autowired
    public TaskController(taskRepository taskRepository) 
    {
        this.taskRepository = taskRepository;
    }

    @GetMapping("task/")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping("save/")
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping("find/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @PutMapping("task/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        Task existingTask = taskRepository.findById(id).orElse(null);

        if (existingTask != null) {
            existingTask.setDescription(updatedTask.getDescription());
            existingTask.setCompleted(updatedTask.isCompleted());
            return taskRepository.save(existingTask);
        }

        return null;
    }

    @DeleteMapping("task/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }

}
