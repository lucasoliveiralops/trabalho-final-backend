package com.cotemig.trabalhoback.repository;

import com.cotemig.trabalhoback.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
