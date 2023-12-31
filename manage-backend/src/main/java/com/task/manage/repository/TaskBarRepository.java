package com.task.manage.repository;

import com.task.manage.model.Task;
import com.task.manage.model.TaskBar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskBarRepository extends JpaRepository<TaskBar, Long> {
    @Query("SELECT t FROM TaskBar t WHERE t.assignedBoardId = :id")
    List<TaskBar> findTasksByAssignedBoarId(@Param("id") Long id);
}
