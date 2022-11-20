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
    private long taskId;

    public History() { }

    public History(Date createdAt, long taskId) {
        this.createdAt = createdAt;
        this.taskId = taskId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "History{" +
                "createdAt=" + createdAt +
                ", taskId=" + taskId +
                '}';
    }
}
