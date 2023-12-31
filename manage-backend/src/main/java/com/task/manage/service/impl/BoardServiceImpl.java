package com.task.manage.service.impl;

import com.task.manage.model.Board;
import com.task.manage.model.Task;
import com.task.manage.repository.BoardRepository;
import com.task.manage.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    @Override
    public List<Board> getUserAllBoards(Long id) {
        return boardRepository.findBoardsByAssignedUserId(id);
    }


    public Board createBoard(Long id, Board board) {
        board.setAssignedUserId(id);
        return boardRepository.save(board);
    }

    public void deleteBoardById(Long id) {
        boardRepository.deleteById(id);
    }

    public void updateBoard(Board board) {
        boardRepository.save(board);
    }

}
