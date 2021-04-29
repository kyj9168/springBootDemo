package com.example.demo.controller;

import com.example.demo.domain.Board;
import com.example.demo.domain.BoardDto;
import com.example.demo.domain.ResponseDto;
import com.example.demo.service.BoardService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    //Get 과 Post 장단점
    //목록
    @GetMapping("/api/boards")
    private ResponseDto getBoards() throws JsonProcessingException {
        return ResponseDto.builder().data(boardService.getBoardList()).build();
    }

    //상세
    @GetMapping("/api/boards/{id}")
    private ResponseDto getBoard(@PathVariable int id){
        return ResponseDto.builder().data(boardService.getBoard(id)).build();
    }

    //수정
    //작성
    @PostMapping("/api/boards")
    private ResponseDto postBoard(@RequestBody BoardDto boardDto){
        boardService.saveBoard(boardDto);
        return ResponseDto.builder().build();
    }

    //삭제
    @DeleteMapping("/api/boards/{id}")
    private ResponseDto deleteBoard(@PathVariable int id) throws Exception {
        boardService.deleteBoard(id);
        return ResponseDto.builder().build();
    }
}
