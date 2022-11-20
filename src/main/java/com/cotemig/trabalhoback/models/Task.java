package com.cotemig.trabalhoback.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
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

//    private User user;
//    @ManyToOne
//    private History history;

    @JoinColumn(name="type_id", nullable = true)
    @ManyToOne
    private Type type;

    public Task() {}

    public Task(String name, String description, Date estimate, Integer status) {
        this.name = name;
        this.description = description;
        this.estimate = estimate;
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

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", estimate=" + estimate +
                '}';
    }
}
