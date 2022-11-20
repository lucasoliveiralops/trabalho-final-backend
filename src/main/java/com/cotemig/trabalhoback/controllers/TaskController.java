package com.cotemig.trabalhoback.controllers;

import com.cotemig.trabalhoback.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

//    @GetMapping("")
//    public ResponseEntity<List<Task>> index(){
//        List<Task> tasks = taskService.index();
//
//        return new ResponseEntity<>(tasks, HttpStatus.OK);
//    }
}
