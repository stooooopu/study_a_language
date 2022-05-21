### * A
- alert()
  - ()안의 내용 popup
- append()
  - $(" #id ").append(' tag ');
  - 부모태그에 append하면 자식태그로 추가 됨
  - 포스트잇 개념으로 생각
  - append to
    - 옆에 추가(다시 찾아보기)
- Array()
  - 배열선언
- Array()의 메소드
  - push() : 배열에 값을 추가한다
  - splice() : 원하는 위치에 요소를 추가하거나 삭제
    - 추가 : .splice(배열 변경 시작할 index번호, 배열에서 제거할 요소의 수(추가의 경우 0입력), "추가할 값");
    - 삭제 : .splice(배열 변경 시작할 index번호, 삭제할 수량)
    - 배열 변경 시작할 index번호 
      - 배열의 길이보다 큰 값이라면 실제 시작 인덱스는 배열의 길이로 설정
      - 음수로 설정될 경우 배열의 끝에서부터 요소를 셈  
      array.length - n 번째 인덱스를 가르킴  
      값의 절대값이 배열의 길이 보다 큰 경우 0으로 설정 됨
- attr()
  - attribute : 속성 (tag안에 있는 id, class, value, selected ...)
  - 이름 호출, 속성 값 수정 가능
  - attr(속성 종류, 바꾸고자 하는 값)
    - attr('id', 'white')
    - attr('style','background-color : #___);

### * C
- children() 
  - 부모기준으로 자식 정보를 알고싶을 때
  - 배열 형태로 가져옴
  - 손자를 찾을 수는 없음
  - children()[ index번호 ]로 배열호출 가능
- check-box
  - $('선택자').is(":checked") : check-box 체크 여부
  - .is(":checked") == true : checked
  - .is(":checked") == flase : not checked

### * D
- display()
  - block
    - $(" #id ").css('display', 'block');
    - $(" #id ").show();
  - none
    - $(" #id ").css('display', 'none');
    - $(" #id ").hide();
  - var 변수명 = $(" #id ").css("display");
    - 해당 클래스의 display속성 알기

### * E
- each()
  - .each(function(index, item){}
    - index : 배열의 인덱스 또는 객체의 키를 의미
    - item : 해당 인덱스나 키가 가진 값을 의미
  - jqery 반복문으로 배열의 길이까지만 작동
  - for문과의 차이점 : 범위 지정의 유무
  - 객체형을 다루기 쉽고 return값을 받지 못함
  - Array객체에서 사용 가능

### * F
- find()
  - 부모기준 손자까지 찾아줌

### * G
- getTime()
  - 현재시간을 숫자로 나타냄
  - 단위 : millisecond (1000ms = 1s)
  - 1970.01.01을 기준
  - 음수가 나타날 경우 1970년 이전을 의미
  - 1000 * 60 * 60 * 24 (ms * s * m * h)
  
### * I
- innerHtml : html tag + text
- innerText : only text
- .className input[type = text/password/check-box etc...]
### * N
- Number() 
  - 문자에서 숫자로 변환
### * O
- on() 
  - 이벤트를 받을 준비 (바인딩)
  - .on('click',function(){});
  - .on('이벤트 이름', '익명함수'or'이미 선언한 함수')
  - 파라미터에 함수 가능
  - 이때 function뒤에 함수명이 없는데 이걸 _익명함수_ 라고함
  - 실행 순서 : click -> fuction

### * P
- parseInt()
  - 문자 -> 숫자로 변환
  - perseInt( 문자형으로 된 숫자 데이터 )
- preventDefault()
  - 기본으로 정의된 이벤트(href)를 작동하지 못하게 함
- parent()
  - 어떤 요소의 부모 요소를 선택


### * R
- replace()
  - 모든 공백제거 : .val().replace(/ /g, '');
- replaceAll()
  - replace조건 모든 것 제거
- removeAttr()
  - 선택한 요소의 특성 제거
- reduce()
  - 4가지 파라미터(인수, 인자값, 매개변수)를 가짐
    ```
    accumulator : 반환값을 누적
    currentValue : 처리할 현재 요소
    currentIndex (Optional) : 현재 요소의 인덱스
    array(Optional) : reduce()를 호출한 배열
    
    acc : 누적값, cur : 현재값
    ```
### * S
- selected
  - option value값으로 선택하기  
  $("#id").val("value값").prop("selected", true);
  - option 순서로 선택하기  
  $("#id option:eq(0번부터 시작)").prop("selected", true);

### * T
- target
  - 
- text()
  - 선택한 요소 안의 내용을 가져오거나, 다른 내용으로 바꿈
### * 그 외
- 정규표현식(Reguler Expression) : 문자열을 처리하는 방법