package com.example.first_spring.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// @Data
@Getter
@Setter
@AllArgsConstructor // 생성자 자동생성, 변수 추가시 자동으로 늘어남
public class UserVO { // VO = DTO
	private String name;
	private int age;
	private String addr;
	
	public UserVO() {
		
	}
}
