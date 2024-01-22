package com.example.springdatajdbcdemo.services;

import com.example.springdatajdbcdemo.entities.Task;

import java.util.List;

public interface TaskService {
    Task addTask(Task task);
    Task updateTask(Task task);
    Task findTaskByID(long id);
    List<Task> findTaskByUser(long userId);
    List<Task> findTaskByTaskGroupId(long taskGroupId);
    List<Task> findTaskByCategoryName(String name,long userId);
    void deleteTaskById();



}
