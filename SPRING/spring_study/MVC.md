
# MVC Architecture
Model View Controller  
개발할 때 3가지 역할을 나누어 개발하는 방법론  
프로그래밍 로직을 __서로 영향 없이 쉽게 고칠 수 있는__ 소프트웨어 디자인 패턴  
하나의 클래스 파일로는 협업이 불가능
```
기존의 문제점

1. 문제를 풀 때 마다 controller에 코드가 길어짐  
2. 유지보수가 힘들어짐 
```
=> 이를 해결하기 위해 MVC아키텍처 등장  
```
MVC 패턴 사용시

유지보수성, 애플리케이션의 확장성, 유연성 증가
중복코딩 제거
```
__MVC Architecture__ 가 생김 덕분에 지금까지 spring이 살아남을 수 있었음  

- Model  
    - 비즈니스로직 (service)
    - DB연동 로직 (Mapper, repository)  
    이때 Mapper은 Interface
- View  
최종 사용자에서 결과를 화면(UI)으로 보여줌
- Controller  
요청을 받아서 화면과 Model을 연결시켜주는 역할  
http method처리

---