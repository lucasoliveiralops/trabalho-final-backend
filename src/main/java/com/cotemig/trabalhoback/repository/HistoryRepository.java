package com.cotemig.trabalhoback.repository;

import com.cotemig.trabalhoback.models.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Long> {
    @Query(value = "SELECT * FROM history WHERE task_i = ?1", nativeQuery = true)
    List<History> getByTaskId(Long taskId);
}
