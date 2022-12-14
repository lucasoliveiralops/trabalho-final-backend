package com.cotemig.trabalhoback.services;

import com.cotemig.trabalhoback.models.History;
import com.cotemig.trabalhoback.models.Task;
import com.cotemig.trabalhoback.repository.HistoryRepository;
import com.cotemig.trabalhoback.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
  @Autowired
  private TaskRepository taskRepository;

  private HistoryService historyService;

  @Override
  public Task getTaskById(long id) {
    Optional<Task> task = taskRepository.findById(id);

    if (!task.isPresent()) {
      return null;
    }

    return task.get();
  }

  @Override
  public List<Task> getAllTasks() {
    return taskRepository.findAll();
  }

  @Override
  public Task createTask(Task task) {
    return taskRepository.save(task);
  }

  @Override
  public Task updateTask(Task task) {
    return taskRepository.save(task);
  }

  @Override
  public Task deleteTask(long id) {
    Optional<Task> task = taskRepository.findById(id);

    if (!task.isPresent()) {
      return null;
    }

    taskRepository.deleteById(id);

    return task.get();
  }
}
