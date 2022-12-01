
# RULE or TIP

## <'li><'/li><'a><'/a><'/li> *5
- (바깥태그>안쪽태그)*원하는 수량  
- (li>a)*5

---
## <'div class="item item1">1<'/div> <'div class="item item2">2<'/div> *10  
증감연산자를 사용해서 class = "item item ++x" ++x * x가 될 수 있게

- div.공통변수이름(전역변수가 됨) 변수이름 _${$} * 원하는 수량
- div.item item${$}*10 -> 원하는 태그 안에 넣기  

---
## <'section> or <'div.section>
둘다 section영역을 정해주는 것
- section_tag : semantic tag

---
## CSS .row / .row-col
이렇게 class="row" or "row-col" 따로 지정해 주면  
계속 따로 flex를 주지 않아도 됨
- .row { display : flex; justify-content: space-between; }
- .row-col { display : flex; flex-direction: column; }
- three.js : IT 의료, 3D UI를 많이 보여주는 업체

---
## HTML includ
```html
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript">   
$(document).ready( function() {

$("#headers").load("common/header.html");  // 원하는 파일 경로를 삽입하면 된다
$("#footers").load("common/footer.html");  // 추가 인클루드를 원할 경우 이런식으로 추가하면 된다

});
</script>
```
> https://blog.naver.com/PostView.nhn?isHttpsRedirect=true&blogId=blacklish1&logNo=221017411129&parentCategoryNo=&categoryNo=27&viewDate=&isShowPopularPosts=true&from=search