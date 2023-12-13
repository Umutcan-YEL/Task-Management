package com.task.manage.service;

import com.task.manage.model.Task;
import com.task.manage.model.User;
import com.task.manage.repository.TaskInterface;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskInterface taskInterface;

    public TaskService(TaskInterface taskInterface) {
        this.taskInterface = taskInterface;
    }

    @Autowired


    public List<Task> getAllTask() {
        return taskInterface.findAll();
    }

    public List<Task> getUserAllTask(Long id) {
        return taskInterface.findTasksByAssignedUserId(id);
    }


    public Task createTask(Long id, Task task) {
        task.setAssignedUserId(id);
        return taskInterface.save(task);
    }

    public void deleteTaskById(Long id) {
        taskInterface.deleteById(id);
    }

    public void updateTask(Task task) {
        taskInterface.save(task);
    }


}
