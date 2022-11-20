package com.cotemig.trabalhoback.controllers;

import com.cotemig.trabalhoback.models.Task;
import com.cotemig.trabalhoback.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("")
    public ResponseEntity<List<Task>> index(){
        List<Task> tasks = taskService.getAllTasks();

        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> show(@PathVariable("id") long id){
        if(id < 0){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Task task = taskService.getTaskById(id);

        if (task == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task response = taskService.createTask(task);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable("id") long id, @RequestBody Task task) {
        Task response = taskService.updateTask(id, task);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Task> destroyTask(@PathVariable("id") long id) {
        Task response = taskService.deleteTask(id);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
