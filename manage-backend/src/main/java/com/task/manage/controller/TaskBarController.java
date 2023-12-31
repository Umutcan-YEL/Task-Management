package com.task.manage.controller;

import com.task.manage.model.Board;
import com.task.manage.model.TaskBar;
import com.task.manage.service.TaskBarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/taskbar")
@RequiredArgsConstructor
public class TaskBarController {

    private  final TaskBarService taskBarService;

    @GetMapping("/get-user-taskbar/{id}")
    public List<TaskBar> getUserAllBoard(@PathVariable Long id) {
        return taskBarService.getBoardTaskBars(id);
    }

    @PostMapping("/create/{id}")
    public TaskBar createBoard(@PathVariable(name = "id") Long id, @RequestBody TaskBar taskBar) {
        return taskBarService.createTaskBar(id, taskBar);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<TaskBar> updateBoard(@PathVariable Long id, @RequestBody TaskBar taskBar) {
        taskBar.setId(id);
        taskBarService.updateTaskBar(taskBar);
        return ResponseEntity.ok(taskBar);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteBoardById(@PathVariable Long id) {
        taskBarService.deleteTaskBarById(id);
        return ResponseEntity.ok("TaskBar Deleted");
    }
}
