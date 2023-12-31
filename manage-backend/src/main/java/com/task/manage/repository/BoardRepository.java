package com.task.manage.repository;

import com.task.manage.model.Board;
import com.task.manage.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    @Query("SELECT t FROM Board t WHERE t.assignedUserId = :id")
    List<Board> findBoardsByAssignedUserId(@Param("id") Long id);
}
