package com.example.springdatajdbcdemo.repositories;

import com.example.springdatajdbcdemo.entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends CrudRepository<Task,Long> {
    Optional<Task> findByTask_id(long task_id);
}
