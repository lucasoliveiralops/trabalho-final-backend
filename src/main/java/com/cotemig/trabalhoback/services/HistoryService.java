package com.cotemig.trabalhoback.services;

import com.cotemig.trabalhoback.models.History;
import com.cotemig.trabalhoback.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class HistoryService {
    @Autowired
    HistoryRepository historyRepository;

    public List<History> getByTaskId(Long taskId) {
        return historyRepository.getByTaskId(taskId);
    }

    public void insert(History history) {
        historyRepository.save(history);
    }
}
