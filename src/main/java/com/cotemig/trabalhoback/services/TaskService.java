package com.cotemig.trabalhoback.services;

import com.cotemig.trabalhoback.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
  public Optional<Task> getTaskById(long id);

  public List<Task> getAllTasks(long id);

}
