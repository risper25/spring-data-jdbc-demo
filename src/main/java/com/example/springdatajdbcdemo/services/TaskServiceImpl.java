package com.example.springdatajdbcdemo.services;

import com.example.springdatajdbcdemo.entities.Task;

import java.util.List;

public class TaskServiceImpl implements TaskService{
    @Override
    public Task addTask(Task task) {
        return null;
    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }

    @Override
    public Task findTaskByID(long id) {
        return null;
    }

    @Override
    public List<Task> findTaskByUser(long userId) {
        return null;
    }

    @Override
    public List<Task> findTaskByTaskGroupId(long taskGroupId) {
        return null;
    }

    @Override
    public List<Task> findTaskByCategoryName(String name, long userId) {
        return null;
    }

    @Override
    public void deleteTaskById() {

    }
}
