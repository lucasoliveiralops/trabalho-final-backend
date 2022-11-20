package com.cotemig.trabalhoback.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name = "";
  private String imageUrl = "";

  public User() {
  }

  public User(String name, String imageUrl) {
    this.name = name;
    this.imageUrl = imageUrl;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override
  public String toString() {
    return "User{" + "id=" + id + ", name='" + name + '\'' + ", imageUrl='" + imageUrl + '\'' + '}';
  }
}
