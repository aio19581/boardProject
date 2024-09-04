package com.board;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class boardVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private String regDate;
	private int cnt;
}
