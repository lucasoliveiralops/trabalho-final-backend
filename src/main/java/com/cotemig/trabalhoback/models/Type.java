package com.cotemig.trabalhoback.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "types")
public class Type {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;

  public Type() { }

  public Type(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Type{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
