package com.cotemig.trabalhoback.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name = "";
    private String description = "";
    private Integer status = 1;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date estimate;
    private long userId;
    private long typeId;
    private long kanbanStepId;

    public Task(Integer id, String name, String description, Date estimate, long userId, long typeId, long kanbanStepId, Integer status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.estimate = estimate;
        this.userId = userId;
        this.typeId = typeId;
        this.kanbanStepId = kanbanStepId;
        this.status = status;
    }

    public Task(String name, String description, Date estimate, long userId, long typeId, long kanbanStepId, Integer status) {
        this.name = name;
        this.description = description;
        this.estimate = estimate;
        this.userId = userId;
        this.typeId = typeId;
        this.kanbanStepId = kanbanStepId;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEstimate() {
        return estimate;
    }

    public void setEstimate(Date estimate) {
        this.estimate = estimate;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public long getKanbanStepId() {
        return kanbanStepId;
    }

    public void setKanbanStepId(long kanbanStepId) {
        this.kanbanStepId = kanbanStepId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", estimate=" + estimate +
                ", userId=" + userId +
                ", typeId=" + typeId +
                ", kanbanStepId=" + kanbanStepId +
                '}';
    }

    
}
