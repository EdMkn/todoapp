package com.app.todoapp.repository;

import com.app.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * For retrieving, stocking the date
 */
public interface TaskRepository extends JpaRepository<Task, Long> {

}
