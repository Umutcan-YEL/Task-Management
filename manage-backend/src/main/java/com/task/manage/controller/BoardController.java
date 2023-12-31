package com.task.manage.controller;

import com.task.manage.model.Board;
import com.task.manage.model.Task;
import com.task.manage.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/get-user-board/{id}")
    public List<Board> getUserAllBoard(@PathVariable Long id) {
        return boardService.getUserAllBoards(id);
    }

    @PostMapping("/create/{id}")
    public Board createBoard(@PathVariable(name = "id") Long id, @RequestBody Board board) {
        return boardService.createBoard(id, board);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Board> updateBoard(@PathVariable Long id, @RequestBody Board board) {
        board.setId(id);
        boardService.updateBoard(board);
        return ResponseEntity.ok(board);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteBoardById(@PathVariable Long id) {
        boardService.deleteBoardById(id);
        return ResponseEntity.ok("Board Deleted");
    }
}
