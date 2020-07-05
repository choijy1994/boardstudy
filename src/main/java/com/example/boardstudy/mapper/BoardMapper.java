package com.example.boardstudy.mapper;

import com.example.boardstudy.domain.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardMapper {
    public int insertBoard(BoardDTO params);
    public BoardDTO selectBoardDetail(Long idx);
    public int updateBoard(BoardDTO params);
    public int deleteBoard(Long idx);
    public List<BoardDTO>selectBoardList();
    public int selectBoardTotalCount();
}
