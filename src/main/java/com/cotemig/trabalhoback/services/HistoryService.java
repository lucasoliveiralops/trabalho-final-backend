package com.cotemig.trabalhoback.services;

import com.cotemig.trabalhoback.models.History;
import com.cotemig.trabalhoback.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HistoryService {
    @Autowired
    HistoryRepository historyRepository;

    public List<History> getByTaskId(Long taskId) {
        return historyRepository.getByTaskId(taskId);
    }
}
