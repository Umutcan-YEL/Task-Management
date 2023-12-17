package com.task.manage.service;

import com.task.manage.model.Task;

import java.util.List;

public interface TaskService {


    List<Task> getAllTask();


    List<Task> getUserAllTask(Long id);


    Task createTask(Long id, Task task);

    void deleteTaskById(Long id);

    void updateTask(Task task);
}
