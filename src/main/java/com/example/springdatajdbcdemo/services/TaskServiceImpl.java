package com.example.springdatajdbcdemo.services;

import com.example.springdatajdbcdemo.entities.Task;
import com.example.springdatajdbcdemo.repositories.TaskRepository;
import com.example.springdatajdbcdemo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService{
    private final TaskRepository taskRepository;
    private final UserRepository userRepository;
    @Override
    public Task addTask(Task task) {

        return taskRepository.save(task);
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
    public void deleteTaskById(Long id) {

    }

    @Override
    public Page<Task> findByTitleWithPagination(String title, Pageable pageable) {
        return taskRepository.findByTitle(title,pageable);
    }

    @Override
    public Page<Task> findAll(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }

}
