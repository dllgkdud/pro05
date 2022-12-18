package com.shop.myapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
	private long id;
	private String title;
	private String content;
    private String writer;
    private int hits;
    private char delete_yn;
    private String created_date;
    private String modified_date; 
}
