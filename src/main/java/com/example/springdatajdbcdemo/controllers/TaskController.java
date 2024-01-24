package com.example.springdatajdbcdemo.controllers;

import com.example.springdatajdbcdemo.entities.Task;
import com.example.springdatajdbcdemo.services.TaskServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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


    @GetMapping("/findByCategoryName/{name}/{user_id}")
    public ResponseEntity<List<Task>> findTaskByCategoryName(@PathVariable("name") String name, @PathVariable("user_id") long userId) {
        return ResponseEntity.ok(service.findTaskByCategoryName(name, userId));
    }

    @DeleteMapping("deleteById/{id}")
    public ResponseEntity<String> deleteTaskById(@PathVariable Long task_id) {
        service.deleteTaskById(task_id);
        return ResponseEntity.ok("Deleted");

    }

    @GetMapping("/findByTitle")
    public ResponseEntity<Page<Task>> findByTitleWithPagination(@RequestParam String title,
                                                                @RequestParam int page,
                                                                @RequestParam int size){
        PageRequest pageable=PageRequest.of(page,size);
        return ResponseEntity.ok(service.findByTitleWithPagination(title,pageable));
    }
    @GetMapping("/findAll")
    public ResponseEntity<Page<Task>> findAllWithPagination(@RequestParam int page,
                                                            @RequestParam int size){
        PageRequest pageable=PageRequest.of(page,size);
        return ResponseEntity.ok(service.findAll(pageable));

    }
}
