package com.example.springdatajdbcdemo.services;

import com.example.springdatajdbcdemo.entities.Task;
import com.example.springdatajdbcdemo.entities.TaskGroup;

import java.util.List;

public interface TaskGroupService {
    TaskGroup addTaskGroup(TaskGroup taskGroup);
    TaskGroup updateTaskGroup(TaskGroup taskGroup);
    TaskGroup findTaskGroupByID(long id);
    List<TaskGroup> findTaskGroupByUser(long userId);
}
