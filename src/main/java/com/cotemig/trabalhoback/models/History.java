package com.cotemig.trabalhoback.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "histories")
public class History {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date createdAt;

  @ManyToOne
  @JoinColumn(name = "task_id", nullable = false)
  private Task task;
//
//  @ManyToMany
//  @JoinColumn(name = "kanban_id", nullable = false)
//  private Kanban kanban;

  public History() {

  }
  public History(Date createdAt, Task task, Kanban kanban) {
    this.createdAt = createdAt;
    this.task = task;
//    this.kanban = kanban;
  }

  public long getId() {
    return id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }

//  public Kanban getKanban() {
//    return kanban;
//  }
//
//  public void setKanban(Kanban kanban) {
//    this.kanban = kanban;
//  }
}
