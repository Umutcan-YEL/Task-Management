package com.task.manage.service;

import com.task.manage.model.TaskBar;

import java.util.List;

public interface TaskBarService {


    List<TaskBar> getAllTaskBars();

    List<TaskBar> getBoardTaskBars(Long id);

    TaskBar createTaskBar(Long id, TaskBar taskBar);

    void deleteTaskBarById(Long id);

    void updateTaskBar(TaskBar taskBar);
}
