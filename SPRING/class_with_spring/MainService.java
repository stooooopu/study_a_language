package com.example.first_spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.first_spring.vo.UserVO;

@Service // 로직구현
public class MainService {
	
//	public List<UserVO> getUserList(){
//		// 파라미터없이 List를 리턴해야하기 때문에 새로운 리스트 생성
//		List<UserVO> list = new ArrayList<UserVO>();
//		list.add(new UserVO("최승철",29,"서울"));
//		return list;
//	}
    //문제 1. 나이가 60 이하인 배우만 리턴하시오.
    public List<UserVO> getUserList(){
    	// 60세 이상을 담는 List
    	List<UserVO> ageList = new ArrayList<UserVO>();
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("이병헌",51,"서울"));
        list.add(new UserVO("조승우",42,"서울"));
        list.add(new UserVO("이경영",61,"서울"));
        list.add(new UserVO("배성우",49,"서울"));
        list.add(new UserVO("백윤식",75,"서울"));
        for(int i=0; i<list.size(); i++) {
			int age = list.get(i).getAge(); 
			if(age<=60) {
				ageList.add(list.get(i));
			}
		}
//        for(int i=0; i<list.size(); i++) {
//        	int age = list.get(i).getAge(); 
//			if(age>60) {
//				list.remove(i);
//				--i; 줄어드는 이유는 삭제되면 뒤에인덱스 값이 앞으로 땡겨지니까
//			}
//        }
		return ageList;
	}
    //문제 2. 나이가 가장많은 배우의 나이를 리턴하시오.
    public int getUserAgeMax(){
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("이병헌",51,"서울"));
        list.add(new UserVO("조승우",42,"서울"));
        list.add(new UserVO("이경영",61,"서울"));
        list.add(new UserVO("배성우",49,"서울"));
        list.add(new UserVO("백윤식",75,"서울"));
        int age = 0;
        for(int i=0; i<list.size(); i++) {
        	int userAge = list.get(i).getAge();
        	if(age<userAge) {
        		age = userAge;
        	}
        }
		return age;
	}
    //문제 3. list에 배우이름 배성우가 있다면 리턴하시오.
    public UserVO getUser(){
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("이병헌",51,"서울"));
        list.add(new UserVO("조승우",42,"서울"));
        list.add(new UserVO("이경영",61,"서울"));
        list.add(new UserVO("배성우",49,"서울"));
        list.add(new UserVO("백윤식",75,"서울"));
        UserVO actor = null;
		for(int i=0; i<list.size(); i++) {
			String name = list.get(i).getName();
			if(name.equals("배성우")) {
				actor = list.get(i);
			}
		}
		return actor;
	}
    //문제 4. list에 성이 이씨인 배우가 몇명인지 리턴하시오.
    public int getUserCount(){
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("이병헌",51,"서울"));
        list.add(new UserVO("조승우",42,"서울"));
        list.add(new UserVO("이경영",61,"서울"));
        list.add(new UserVO("배성우",49,"서울"));
        list.add(new UserVO("백윤식",75,"서울"));
        int count = 0;
        String selectName = "이";
        for(int i=0; i<list.size(); i++){
			String firstName = list.get(i).getName();
			if(firstName.substring(0, 1).equals(selectName)) {
				++count;
			}
		}
		return count;
	}
}
