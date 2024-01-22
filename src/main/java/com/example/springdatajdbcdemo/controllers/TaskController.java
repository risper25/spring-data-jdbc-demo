package com.example.springdatajdbcdemo.controllers;

import com.example.springdatajdbcdemo.entities.Task;
import com.example.springdatajdbcdemo.services.TaskGroupServiceImpl;
import com.example.springdatajdbcdemo.services.TaskService;
import com.example.springdatajdbcdemo.services.TaskServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskServiceImpl service;

    @PostMapping("/add")
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        return ResponseEntity.ok(service.addTask(task));
    }

    @PutMapping("/update")
    public ResponseEntity<Task> updateTask(@RequestBody Task task) {
        return ResponseEntity.ok(service.updateTask(task));
    }

    @GetMapping("/find-task-id/{id}")
    public ResponseEntity<Task> findTaskByID(@PathVariable long id) {
        return ResponseEntity.ok(service.findTaskByID(id));
    }

    @GetMapping("/find-task-userid/{user_id}")
    public ResponseEntity<List<Task>> findTaskByUser(long user_id) {
        return ResponseEntity.ok(service.findTaskByUser(user_id));
    }


    public List<Task> findTaskByTaskGroupId(long taskGroupId) {
        return null;
    }


    public List<Task> findTaskByCategoryName(String name, long userId) {
        return null;
    }


    public void deleteTaskById() {

    }
}
