# Spring 설치
```
회사가서 먼저 이클립스 or sts ( IDE ) 설정 확인  

한글 설정

 window -> preferences -> encoding검색 -> General (Workspace)
 => 왼쪽 하단 Text file encoding -> Other : UTF-8로 변경
 ```
 
1. sts 검색 사양에 맞는 다운  
2. https://start.spring.io/ 북마크 해 놓기  
3. cdrive -> spring-workspace폴더 만들기  
4. https://start.spring.io/ 열기
```
1. project에 gradleproject 선택
2. Artifact 에 project이름 만들기
3. java version확인 (내 버전이 없으면 한 단계 낮은 것 사용)
4. ADD DEPENDENCIES... 로 필요한 것을 선택
    Spring Web (필수)
    lombok
    devtools 등 필요한 기능을 추가
    => generate
새로운 project를 생성
```
5. 알집파일을 3번의 spring-workspace에 옮기기 -> 압축풀기, 이때 폴더 안에 바로 파일이 있어야 함
6. eclipse실행 -> file -> switch workspaces -> other -> spring-workspace로 경로 지정
7. 왼쪽 import project클릭 -> gradle선택 -> 아까 압축 푼 폴더를 경로로 설정

---
# Spring project생성
1. https://start.spring.io/  

![jsp](../spring_study/img/jsp.JPG)  

2. spring_workspaces -> zipFile옮기고 여기에 압축풀기
3. eclipse -> file -> import -> 경로지정
4. properties 확장자명 -> yaml로 수정
5. salmap 패키지 생성
6. sqlmapper.xml 생성
7. banner(option), logback (query결과 뜨는 것) 추가
8. MVC package -> class파일 생성

---
# eclipse에서 table생성
```
학생게시판 만들기

table : 
- 학생 
번호
이름
패스워드

- 게시판
제목
내용
작성자
수정날짜
최초게시날짜

둘의 관계는 1:n의 관계
```
1. src/main/resources 우클릭 -> other -> General -> file ->  
fileName : init.sql
```sql
-- sql파일 여기서 table작성
-- CREATE TABLE IF NOT EXISTS : 이 테이블이 존재하지 않는다면 생성해라
-- DDL autocommit
CREATE TABLE IF NOT EXISTS students( -- 학생 테이블
	students_id INTEGER(4) AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '학생 아이디',
    students_name VARCHAR(20) COMMENT '학생 이름',
    students_password VARCHAR(200) COMMENT '학생 비밀번호', -- 우리가 암호화해서 저장하기 때문에 글자수 제한을 크게 해야함
    create_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '가입 날짜' -- insert할때 입력 안하면 디폴트로 현재시간을 넣어 주겠다
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS board -- 게시판 테이블
( 
    board_id INTEGER(4) AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '게시판 아이디',
    students_id INTEGER(4) COMMENT '학생 아이디',
    title VARCHAR(50) COMMENT '제목',
    content VARCHAR(100) COMMENT '글 내용',
    update_at DATETIME COMMENT '수정 날짜',
    create_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '작성 날짜',
    CONSTRAINT board_students_id_fk FOREIGN KEY (students_id) REFERENCES students(students_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- run할 때 이 파일을 실행시킬지 결정은 yaml에서 함
-- DDL을 스키마라고 함
```
- mybatis시작 할 때 DB의 경로를 dw로 해 주었기 때문에 생성된 테이블은  
dw에 저장되어있음
- 만약 dw테이블이 존재하지 않는다면
```sql
-- 만약 dw라는 database가 존재하지 않는다면 이렇게 생성
-- 지금 이 CREATE에서는 대소문자 구분 안함
CREATE database IF NOT EXISTS DW DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE DW; -- 데이터베이스를 만들면 이걸 사용할 거라고 말하는거 
```

