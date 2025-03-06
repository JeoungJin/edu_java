package com.shinhan.day13;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	List<Board> getBoardList(){
		List<Board> data = new ArrayList<Board>();
		data.add(new Board("제목1", "내용1"));
		data.add(new Board("제목2", "내용2"));
		data.add(new Board("제목3", "내용3"));
		return data;
	}
}
