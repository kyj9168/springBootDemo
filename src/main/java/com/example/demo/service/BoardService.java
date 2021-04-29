package com.example.demo.service;

import com.example.demo.domain.Board;
import com.example.demo.domain.BoardDto;
import com.example.demo.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    //의존성 주입 DI
    private final BoardRepository boardRepository;
    private final ModelMapper modelMapper;

    //    public BoardService(BoardRepository boardRepository) {
    //        this.boardRepository = boardRepository;
    //    }

    public List<Board> getBoardList(){
        return boardRepository.findAll();
    }

    public BoardDto getBoard(int id){
        Board board = boardRepository.findById(id).orElse(new Board());
        BoardDto boardDto = modelMapper.map(board, BoardDto.class);

//        BoardDto boardDto = new BoardDto();
//        boardDto.setContents(board.getContents());
//        boardDto.setCreated_date(board.getCreated_date());
//        boardDto.setId(board.getId());
//        boardDto.setTitle(board.getTitle());
//        boardDto.setWriter(boardDto.getWriter());
//        boardDto.setUpdate_date(board.getUpdate_date());

        return boardDto;
    }

    public void saveBoard(BoardDto boardDto) {
        Board board = modelMapper.map(boardDto, Board.class);
        boardRepository.save(board);
    }

    public void deleteBoard(int id) throws Exception {
        throw new Exception("test");
//        boardRepository.deleteById(id);
    }
}
