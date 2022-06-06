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

# eclipse git 연결
1. 새로운 폴더 -> git clone

2. eclipse   
   file -> import -> gradle -> Exisiting Gradle Project
 -> Next -> Next -> Browse -> project -> Finish  
settings.gradle에 file명 맞게 바꿔주기 -> gradle reflesh
 
3. 오른쪽 상단 open perspective -> git 추가

4. git pull or push  
 아이디 : 깃허브 닉네임  
 비밀번호 : key


