package com.cotemig.trabalhoback.controllers;

import com.cotemig.trabalhoback.models.User;
import com.cotemig.trabalhoback.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping("/mock")
  public ResponseEntity<String> createMock(){
    userService.mockUsers();
    return new ResponseEntity<>("<a href=\"/users\">SUCCESS, CLICK HERE!</a>", HttpStatus.OK);
  }

  @GetMapping("")
  public ResponseEntity<List<User>> showUsers(){
    List<User> users = userService.showUsers();

    return new ResponseEntity<>(users, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> indexUser(@PathVariable("id") long id) {
    if(id < 0){
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST) ;
    }

    User user = userService.indexUser(id);

    if(user == null){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    return new ResponseEntity<>(user, HttpStatus.OK);
  }
}
