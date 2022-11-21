package com.cotemig.trabalhoback.repository;

import com.cotemig.trabalhoback.models.Kanban;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KanbanRepository extends JpaRepository<Kanban, Long> {
}
