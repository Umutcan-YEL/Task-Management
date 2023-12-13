package com.task.manage.controller;

import com.task.manage.model.Task;
import com.task.manage.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/get-all")
    public List<Task> getAllTasks() {
        return taskService.getAllTask();
    }

    @GetMapping("/get-user-task/{id}")
    public List<Task> getUserAllTasks(@PathVariable Long id) {
        return taskService.getUserAllTask(id);
    }

    @PostMapping("/create/{id}")
    public Task createTask(@PathVariable(name = "id") Long id, @RequestBody Task task) {
        return taskService.createTask(id, task);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        task.setTaskId(id);
        taskService.updateTask(task);
        return ResponseEntity.ok(task);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteTaskById(@PathVariable Long id) {
        taskService.deleteTaskById(id);
        return ResponseEntity.ok("Task Deleted");
    }

}
