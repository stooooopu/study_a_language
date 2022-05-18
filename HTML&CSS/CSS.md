
## 1. position 
 ### position: (static or relative or absolute or fixed)
 1. static : default 움직이지 않음
 2. relative : 원래 본인의 자리를 기준으로 움직임 (top, left, right, bottm)  
 3. absolute : 원하는대로 움직임 (top, left, right, bottm)  
 조건. 부모태그가 relative일때 부모 기준으로 움직임
 4. fixed : 고정된 위치로 스크롤을 따라 움직임

---
## 2. margin : 부모태그끼리 박스간격 조정
 - auto 가능 / a tag 안됨
 - 속성 값 : 음수, px, %, rem
 - margin: 10px(사방으로 10);
 - margin: 5px(위), 10px(오른쪽&왼쪽), 0(아래);
 - margin: 5px(위&아래), 10px(오른쪽&왼쪽);
 - margin: 10px(위) 10px(오른쪽) 10px(아래쪽) 10px(왼쪽);
 - margin-(top or left or right or bottm) : 로 지정해서 사용 가능

---
## 3. padding : 자식태그와 박스간격 조정
 - auto 안됨
 - 부모태그에 작성
 - 속성 값 : 음수, px, %, rem
 - padding: 10px; //동서남북 모두 10px씩 패딩
 - padding: 5px(위), 10px(오른쪽&왼쪽), 0(아래);
 - padding: 5px(위&아래), 10px(오른쪽&왼쪽);
 - padding: 10px(위) 10px(오른쪽) 10px(아래쪽) 10px(왼쪽);
 - padding-(top or left or right or bottm) : 로 지정해서 사용 가능
	
---
## 4. border-box : border의 두께 포함

---
## 5. flex (display: flex;) : container 안에 item들로 구성, 기본적으로 가로 정렬
- 1차원적인 UI (한 방향 레이아웃)

- align-item : y축 정렬
  - center : 가운데 정렬

- justify-content : x축 정렬, item간의 간격 조절 (=반응형)
  - space-around : 양 끝 공백포함 item간의 간격 조절
  - space-between : 양 끝 공백 삭제 item간의 간격 조절

- flex-direction : item 정렬
  - column : 세로 정렬

- flex-wrap : 화면 비율에 따라 item 겹침 해결
  - wrap : 차례대로 해결
  - revers wrap : 반대로 해결

- flex-basis : flex아이템의 초기 크기를 지정 (item 크기를 줄임)
  - 속성 값 : %
 
---
## 6. grid
- 2차원적인 UI (두방향 레이아웃)

- grid-template-columns: repeat();
  - repeat(반복 횟수, (크기에 대한)값);
  - repeat(auto-fit, minmax(250px, 1fr));
    - auto-fit : 자동 반복
    - minmax() : 최소 크기와 최대 크기 조절 
    - 1fr(fraction) : flex : 1 과 동일*/

- grid-gap: 간격 조절
  - 속성 값 : px, %
---
## 사이즈 단위
- px
- vh
- rem

---
## Basic

- @ : 어노테이션
  - @media (max-width: Xpx) { .className {flex-direction : column;}}  
     - 최대 화면 크기가 Xpx이면 class를 column으로 바꾸는 것  
     - 반응형 웹 (모바일을 위해서)


- width : 가로
  - 속성 값 : px, %
  - max-width : 최대값 지정

- height : 세로
  - 속성 값 : px, %

- display : 배치
  - inline-block : 가로배치 (flex와 비슷)

- display
  - none : 숨기기
  - block : 보여주기

- z-index : 배치 순서
  - 숫자가 클 수록 앞쪽에 배치
  - 음수 가능
  - position 지정이 필요

---
## text

- text-align : 문자 정렬

- color : 폰트 색

- font-size : 폰트 사이즈
  - 속성 값 : px, rem

- font-weight : 폰트 두께
  - 속성값 : 숫자만

- line-height : 문단간 간격 조정(문장 사이)
  - 속성 값 : px

- text-decoration 
  - none : li 밑줄 삭제

- list-style: none
  - none : li 옆 점 삭제

---
## img & color

- background-image : 배경 이미지
  - background-position : background 사이즈안에서 이미지 위치
  - background-size
    - cover

- background-color : 배경 색

- linear-gradient : 그라데이션 (+url(파일명.확장자명))

- background-position : 배경 정렬

- opacity : 투명도
  - 속성값 : 0 ~ 1

- overflow : 컨텐츠가 너무 커서 보여주기 힘들 때
  - visible : 기본값
  - hidden : 넘치는 부분을 자름
  - scroll : 스크롤 바 추가

- object-fit : 사진깨짐 방지

---
## hover : .divName:hover {} , 마우스를 올렸을 때 효과
- class_HTML > day_08.html 참고

- transform : .divName {} 과 한 쌍
  - scale(원래 사이즈1을 기준으로 = 0.x : 작아짐 / 1.x : 커짐)

- flex-grow : 원래사이즈를 기준으로 = 0.x : 작아짐 / x.x : 커짐

---
## animation
- 참고사이트 : https://webclub.tistory.com/621

---
## etc

- border : 테두리 (두께 타입 색)
  - 속성 값 : px
  - border line type  
    - solid : 두꺼운 실선  
    - dotted : 점선  
    - double : 두줄 
  - border-radius : 모서리 라운드
    - 속성 값 : px, %
   
- flex
  - 1 : item들이 일정한 크기를 갖게 됨

- cursor : 마우스 커서  
  - pointer : 손가락

- box-shadow : x축 y축 그림자느낌
  - 속성 값 : px

- transition : 커서를 대면 나오는 속도 빠를수록 숫자가 작음
  - 속성 값 : s, ms