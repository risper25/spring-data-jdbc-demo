package com.example.springdatajdbcdemo.services;

import com.example.springdatajdbcdemo.entities.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TaskService {
    Task addTask(Task task);
    Task updateTask(Task task);
    Task findTaskByID(long id);
    List<Task> findTaskByUser(long userId);
    List<Task> findTaskByTaskGroupId(long taskGroupId);
    List<Task> findTaskByCategoryName(String name,long userId);
    void deleteTaskById(Long id);
    Page<Task> findByTitleWithPagination(String title, Pageable pageable);
    Page<Task> findAll(Pageable pageable);


}
