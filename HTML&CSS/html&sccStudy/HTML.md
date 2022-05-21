## div : 영역 태그
- java의 중괄호로 생각하면 됨 
- 가장 큰 div tag는 container로 body tag안에 있는 것 중 가장 영역이 넓음 (제 2의 body tag로 생각) 
- 홈페이지말고 다른 팝업창이나 광고창의 경우 container tag 외에 tag를 만들어 관리
- <'div class="변수명"> 원하는 태그 작성 <'/div>

---
## input
- type : text, password, number, file, checkbox, date, month, week, time, button ...

- 속성
  - placeholder : 입력창 뒤에 회색 글씨로 보여짐
  - maxlength : 길이 제한
  - value : 기본 값
  - min : 최소 값
  - max : 최대 값

- file : 파일 업로드
- check box
<'input type="checkbox" id="cherry" checked />
<'label for="cherry">cherry<'/label>
- required : 필수값 입력 체크
- disabled : text고정, 수정 불가
---
## a : 링크이동
- 디폴트가 inline block
- text align : 안됨, 원한다면 div로 감싸서 해야함

---
## select
<'select name="" id="">  
<'option value="">select size<'/option>  
<'option value="데이터 입력 값">'화면에 보이는 데이터'<'/option>  
<'/select>

- option에 링크걸기  
<'select name="" onchange="window.open(value,'_blank')";>  
<'option>what your favorite site<'/option>  
<'option class="변수명" value="주소">화면에 보여질 값<'/option>  
<'option class="변수명" value="주소">화면에 보여질 값<'/option>  
<'/select>
- option tag 속성
  - selectde : 페이지가 로드될 때 옵션 중에서 미리 선택되는 옵션

---
## data list (select와 비슷)
<'label for=""> <'/label>  
<'input id="" type="text" list="" />  
<'datalist id="">  
<'option value="데이터"><'/option>  
<'/datalist>

---
## detail
<'details>  
<'summary> ex) 문제 <'/summary>  
<'span> ex) 정답 <'/span>  
<'/details>

---
## img : 이미지 태그

---
## p : 문단태그
 - 문단 나누기 : <'/br>

---
## form
<'form action="웹서버 주소">  
아이디 : <'input type="text" />  
비밀번호 : <'input type="password" />  
이메일 : <'input type="email" />  
<'input type="submit" />  
<'/form>

---
## table
<'table>  
<'thead>  
<'tr> 행  
<'th>테이블 제목<'/th>  
<'/tr>  
<'/thead>  
<'tbody>  
<'tr>  
<'td>제목 값<'/td>  
<'/tr>  
<'/tbody>  
<'/table>  

---
## gage bar
<'progress value="원하는 수치" min="최소 값" max="최대 값"><'/progress>

--- 
## link
<'link rel="stylesheet" href="css파일명">

---
## ul (unorderlist) / ol(orderlist)
<'li><'/li>  
a link 추가  
<'li><'a href="link 추가"><'/a><'/li>

---
## header : navigation, 머릿글, 사이트 로고 등이 옴 이걸 하나의 div로 따로 관리함
<'div class="header"><'/div>

or

<'header><'/header>  
이때 menu는 <'ul> or <'ol> 로 정렬해서 <'li><'a href="#"><'/a><'/li>로 만듦  
※#은 이동할 주소가 없다는 의미  

---
## footer : 가장 하단에 나오는 마무리 단락  
<'footer><'/footer>
