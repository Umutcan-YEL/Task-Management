package com.task.manage.repository;

import com.task.manage.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository  extends JpaRepository<Task,Long> {
    @Query("SELECT t FROM Task t WHERE t.assignedUserId = :id")
    List<Task> findTasksByAssignedUserId(@Param("id") Long id);
}
