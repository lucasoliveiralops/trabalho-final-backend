package com.cotemig.trabalhoback.controllers;

import com.cotemig.trabalhoback.models.Task;
import com.cotemig.trabalhoback.models.User;
import com.cotemig.trabalhoback.services.TaskService;
import com.cotemig.trabalhoback.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserService userService;

  // @Autowired
  // private TaskService taskService;

  @GetMapping("/mock")
  public ResponseEntity<User> createMock() {
    userService.mockUsers();

    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping("")
  public ResponseEntity<List<User>> showUsers() {
    List<User> users = userService.getAllUsers();

    return new ResponseEntity<>(users, HttpStatus.OK);
  }

  // @PostMapping("/{id}/task")
  // public ResponseEntity<User> addTask(@PathVariable("id") long id, @RequestBody Task task) {
  //   User user = userService.readUser(id);
  //   task.setUser(user);
  // }

  @GetMapping("/{id}")
  public ResponseEntity<User> indexUser(@PathVariable("id") long id) {
    if (id < 0) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    User user = userService.readUser(id);

    if (user == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    return new ResponseEntity<>(user, HttpStatus.OK);
  }
}
