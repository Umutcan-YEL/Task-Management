package com.task.manage.service.impl;

import com.task.manage.model.Board;
import com.task.manage.model.TaskBar;
import com.task.manage.repository.TaskBarRepository;
import com.task.manage.service.TaskBarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskBarServiceImpl implements TaskBarService {

    private  final TaskBarRepository taskBarRepository;


    public List<TaskBar> getAllTaskBars() {
        return taskBarRepository.findAll();
    }

    public List<TaskBar> getBoardTaskBars(Long id) {
        return taskBarRepository.findTasksByAssignedBoarId(id);
    }


    public TaskBar createTaskBar(Long id, TaskBar taskBar) {
        taskBar.setAssignedBoardId(id);
        return taskBarRepository.save(taskBar);
    }

    public void deleteTaskBarById(Long id) {
        taskBarRepository.deleteById(id);
    }

    public void updateTaskBar(TaskBar taskBar) {
        taskBarRepository.save(taskBar);
    }
}
