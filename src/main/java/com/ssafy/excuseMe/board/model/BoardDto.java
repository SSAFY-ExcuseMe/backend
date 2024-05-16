package com.ssafy.excuseMe.board.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(title = "BoardDto : 게시글정보", description = "게시글의 상세 정보를 나타낸다.")
public class BoardDto {
	
	@Schema(description = "작성자 ID")
	int user_id;
	@Schema(description = "글번호")
	int id;
	@Schema(description = "제목")
	String title;
	@Schema(description = "내용")
	String contents;
	@Schema(description = "작성일")
	String created_date;
	@Schema(description = "조회수")
	int view;
	@Schema(description = "좋아요수")
	int like;
	public BoardDto(int user_id, String title, String contents) {
		super();
		this.user_id = user_id;
		this.title = title;
		this.contents = contents;
	}
	
	
	
}
