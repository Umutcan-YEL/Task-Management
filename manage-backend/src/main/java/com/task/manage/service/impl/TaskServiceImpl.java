package com.task.manage.service.impl;

import com.task.manage.model.Task;
import com.task.manage.repository.TaskRepository;
import com.task.manage.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;


    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public List<Task> getUserAllTask(Long id) {
        return taskRepository.findTasksByAssignedTaskBarId(id);
    }


    public Task createTask(Long id, Task task) {
        task.setAssignedTaskBarId(id);
        task.setCreatedDate(LocalDateTime.now());
        return taskRepository.save(task);
    }

    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }

    public void updateTask(Task task) {
        taskRepository.save(task);
    }
}
