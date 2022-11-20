package com.cotemig.trabalhoback.services;

import com.cotemig.trabalhoback.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
  public Task getTaskById(long id);

  public List<Task> getAllTasks();

  public Task createTask(Task task);

  public Task updateTask(long id, Task task);

  public Task deleteTask(long id);
}
