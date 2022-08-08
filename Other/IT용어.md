## IT용어

### A
- API
  - Application Programming Interpace(상호작용)
  - URL과 같은 의미
    - application : 프로그램, 소프트웨어
    - interpace : 상호작용
### C
- Cloud : 다른 회사(컴퓨터의 리소스)를 빌리는 것 (대표적으로 AWS, Azure)

- CDN(Content Delivery Network)
  - 지리적 제약 없이 전 세계 사용자에게 빠르고 안전하게 콘텐츠를 전송할 수 있는 기술  
(가장 가까운 지사에서 컨텐츠를 배송 받는 것)  
  - 글로벌로 진출하고자 하는 회사는 무조건 사용해야 하는 기술 (인스타, 페이스북)  
    ex) 뉴욕에서 셀레나가 사진을 인스타에 올렸을 때
    미국의 인스타회사가 아닌 가장 가까운 인스타 지사에서 사진을 다운받는 것

- cookie : 웹브라우저(크롬, 사파리...)에 저장  
쿠키는 프론트(js)에 저장  
보안이 낮음(세션과 비교했을 때)  

### D
- DHCP : IP가 유동적으로 바뀌는 것 (학교, 회사, 카페 ...)

### G
- Gateway (게이트웨이) : cmd에서 inconfig 라우터의 비밀번호  

- GUI (graphical user interface)  
 사용자가 편리하게 사용할 수 있도록 입출력 등의 기능을 알기 쉬운 아이콘 따위의 그래픽으로 나타낸 것

### H
- HTML 
  - Hyper Text Markup Language
  - hyper : 뛰어난
- HTTP 
  - Hyper Text Transper Protocol : HyperText 전송해주는 약속
  - protocol : 약속, 규칙, 규격
  - 보안에 취약
    - https : security, 단점을 보완하기 위해 나옴
```
  HTTP method / function : 이걸 지휘, 명령해 주는 것이 jquery

    GET : DB의 select (데이터 조회), public
    POST : DB의 insert (데이터 생성), private
    DELETE : DB의 delete (데이터 삭제)
    PATCH : DB의 update (데이터 일부분 수정)
```
```
HTTP 통신 특징

1. connectionless (비 연결 지향)
더이상 연결을 지속적으로 하지 않음
2. Stateless (상태정보유지 안함)
요청을 응답하고 바로 접속을 바로 끊어서 정보를 저장하지 않는다
(카톡보내고 바로 카톡방 나가는 경우)
```
### I
- IP : 인터넷을 사용하기 위한 (논리적인) 주소 (고속도로 통행권)  
사설IP / 공인IP

### M
- NMS (Network Management System)  
네트워크 상의 모든 장비들의 중앙감시 체계를 구축하여 모니터링, 분석 및 계획이 가능하며 관련 데이터를 활용한 이상 트래픽에 대한 조기 경보 및 네트워크 관리 시스템
- MES (Manufacturing Execution System)  
통합 생산관리 시스템


### S
- Static IP : 고정 아이피 (만든 서비스를 고객에게 제공할 때)

- Subnet mask (서브넷 마스크) : 호스트번호를 구분할 수 있게 해주는 개념  
```
    255.255.255.0  
    192.198.0.44 =>이 때 호스트번호는 44  

    255.255.0.0  
    192.198.0.44 => 이때 호스트 번호는 0.44  
    
    = 0을 기준으로 ip확인  
```
- Sever : 서비스를 제공하는 주체
 
- session : 웹서버에 저장  
세션은 백엔드(java)에 저장  
보안이 높음  
로그인부터 로그아웃때까지의 범위 = 세션
### R
- Router (라우터) : 인터넷에 접속하기 위한 출입문개념  
공유기 (각각에 다른 ip를 부여, 기록)

### O
- Open source (http, JAVA, http, eclipse, git, ...) : 소스 코드를 공개해 누구나 특별한 제한없이 사용하는 소프트웨어 

### I
- IDE : 통합 개발 환경 (회사 가면 처음에 많이 물어봄)  
종류 : eclipse, 인텔리 제이(유료), 파이참, ...

### P
- PORT : 식별번호
  - 3306 (MYSQL), 8080(SPRING) ...
- Programming
  - 코드를 작성 -> 컴퓨터는 0 과 1밖에 모름 => 우리가 작성한 코드를 컴퓨터가 알아듣게 번역
  - 프로그래밍 종류 : JAVA, C, C++, Python, Ruby, JavaScript, ...
```
    1. Conpile : C, C++, JAVA, ...
    - 전체 소스코드를 보고 실행
    - 인터프리터와 비교했을 때 실행속도가 빠름
    - 코드를 수정하고 실행하려면 처음부터 다시

    2. Interpreter : Python, JavaScript, ...
    - 한 줄씩 실행
    - 컴파일과 비교했을 때 실행속도 느림 대신 
    - 코드를 수정하고 즉시 실행 가능
```
- protocol : 복수의 컴퓨터 사이나 중앙 컴퓨터와 단말기 사이에서 데이터 통신을 원활하게 하기 위해 필요한 통신
```
      portNum
HTML : 80
HTML : 443
SSH  : 22
```
-  PoC(Proof of Concept) : 새로운 프로젝트가 실제로 실현 가능성이 있는가, 효과와 효용, 기술적인 관점에서부터 검증을 하는 과정