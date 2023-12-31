package com.task.manage.service;

import com.task.manage.model.Board;
import com.task.manage.model.Task;

import java.util.List;

public interface BoardService {

    List<Board> getAllBoards();

    List<Board> getUserAllBoards(Long id);

    Board createBoard(Long id, Board board);

    void deleteBoardById(Long id);

    void updateBoard(Board board);
}
