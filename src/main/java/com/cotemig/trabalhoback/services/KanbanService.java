package com.cotemig.trabalhoback.services;

import com.cotemig.trabalhoback.models.Kanban;
import com.cotemig.trabalhoback.repository.KanbanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KanbanService {
  @Autowired
  private KanbanRepository kanbanRepository;

  public Kanban createKanban(Kanban kanban) {
    return kanbanRepository.save(kanban);
  }

  public Kanban readKanban(long id) {
    Optional<Kanban> task = kanbanRepository.findById(id);

    if (!task.isPresent()) {
      return null;
    }

    return task.get();
  }
  public Kanban updateKanban(Kanban kanban) {
    return kanbanRepository.save(kanban);
  }

  public Kanban deleteKanban(long id) {
    Optional<Kanban> task = kanbanRepository.findById(id);

    if (!task.isPresent()) {
      return null;
    }

    kanbanRepository.deleteById(id);

    return task.get();
  }
}
