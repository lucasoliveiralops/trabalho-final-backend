package com.cotemig.trabalhoback.repository;

import com.cotemig.trabalhoback.models.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface historyRepository extends JpaRepository<History, Long> {
}
