package com.cotemig.trabalhoback.repository;

import com.cotemig.trabalhoback.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskRepository extends JpaRepository<Task, Long> {
}
