package com.example.first_spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring.service.MainService;
import com.example.first_spring.vo.UserVO;

@RestController // 요청만실행 서비스의 리턴을 바로 넘겨줌
// ip수집가능 문제 1번
public class ActorController {
	@Autowired
	private MainService service;
	// Servlet = Java(Spring)
	//문제 1. 나이가 60 이하인 배우만 리턴하시오.
	@GetMapping("/actor/list")
	public List<UserVO> callUserList(HttpServletRequest request){
		// 어떤 지역에서 접속했는지 알 수 있음 => 데이터 수집이 가능
		String ip = request.getHeader("X-forwarded-For");
		// http구조상 head에 ip가 담겨져 있음
		if(ip == null) ip = request.getRemoteAddr(); // 가끔 ip가 null이 들어올 때가 있음
		// 원격주소를 이용해 IP를 가져와서 ip에 담아라
		System.out.println("IP ====>"+ip);
		
		return service.getUserList();
	}

	//문제 2. 나이가 가장많은 배우의 나이를 리턴하시오.
	@GetMapping("/actor/age")
	public int callMaxAge() {
		return service.getUserAgeMax();
	}

	//문제 3. list에 배우이름 배성우가 있다면 리턴하시오.
	@GetMapping("/actor")
	public UserVO callUser() {
		return service.getUser();
	}
    
	//문제 4. list에 성이 이씨인 배우가 몇명인지 리턴하시오.
	@GetMapping("/actor/count")
	public int callCount() {
		return service.getUserCount();
	}
}
