package com.example.springdatajdbcdemo.repositories;

import com.example.springdatajdbcdemo.entities.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends CrudRepository<Task,Long> {
    Optional<Task> findByTaskId(long task_id);
    //Optional<Task> findByAppuser(long user_id);
    //List<Task> findByCategoryName(String category_name);
    Optional<Task> findByIsComplete(Boolean is_complete);
    Page<Task> findByTitle(String title, Pageable page);
    Page<Task> findAll(Pageable pageable);
    @Modifying
    @Query("UPDATE task t SET t.title=:new_title WHERE t.id=:task_id ")
    int updateTaskText(@Param("new_title") String new_title,@Param("task_id") Long task_id);

}
