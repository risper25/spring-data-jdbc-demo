package com.example.springdatajdbcdemo.controllers;

import com.example.springdatajdbcdemo.services.TaskGroupServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/task-group")
@RequiredArgsConstructor
public class TaskGroupController {
    private final TaskGroupServiceImpl service;


    @PostMapping("/add")
    public ResponseEntity<TaskGroup> addTaskGroup(@RequestBody TaskGroup taskGroup) {
        return ResponseEntity.ok(service.addTaskGroup(taskGroup));
    }

    @PutMapping("/update")
    public ResponseEntity<TaskGroup> updateTaskGroup(@RequestBody TaskGroup taskGroup) {
        return ResponseEntity.ok(service.updateTaskGroup(taskGroup));
    }

   @GetMapping("/find-by-id/{id}")
    public ResponseEntity<TaskGroup> findTaskGroupByID(@PathVariable long id) {
        return ResponseEntity.ok(service.findTaskGroupByID(id));
    }

    @GetMapping("/find-by-user/{user_id}")
    public ResponseEntity<List<TaskGroup>> findTaskGroupByUser(@PathVariable long userId) {
        return ResponseEntity.ok(service.findTaskGroupByUser(userId));
    }
}
