## BYTE 
- 데이터를 표현하는 단위
```
bit -> B -> KB -> MB -> GB -> TB -> PB -> EB -> ...
8 bit = 1byte     2(30) 1GB
2(10) 1KB           2(40) 1TB
2(20) 1MB           2(50) 1PB
```
1. bit
- 데이터의 최소표현단위
```
 1bit = 2가지 01                        5bit = 32가지
 2bit = 4가지 0101                      6bit = 64가지
 3bit = 8가지 0101 0101                 7bit = 128가지
 4bit = 16가지 0101 0101 0101 0101      8bit = 256가지
```
- 컴퓨터는 0 과 1만 인식가능 (오류를 최소화하기 위해)
- 8bit == 1byte

2. byte
- 영어, 로마자, 숫자를 표현하기 위해서 바이트가 나옴
- 영어 50 + 숫자 10 + 특수문자 66 + 기타문자(국가코드) = 총 256  
그래서 8bit(256) = 1byte

---
## HARDDISK
- HDD / SDD
- 저장공간 (데이터가 영구적으로 남아 있음)
- 1TB / 100TB

## MEMORY
- 저장공간 (컴퓨터를 종료하는 순간 데이터가 날아감)
- 8GB / 16GB / 32GB
- 현재 실행시킨 프로그램들이 메모리에 저장 됨
---
## SEVER
- 서버는 특정짓는 컴퓨터가 아니라 누구든지 컴퓨터가 될 수 있음
- 고객들이 서비스(데이터베이스, 웹, 앱)에  접속하기위해  
서버의 주소(IP)를 알아야 함
- 일반 컴퓨터의 IP == 1개
- 서비스를 이용하기 위해서 주소와 식별번호(PORT)를 알아야 함
---
## IP
- 255.255.255.255  
IP는 octet( . )기준 하나당 1byte

- 인터넷하라고 주는 주소(식별자)
```
IP   : 192.168.0.252
PORT : 3306 (MYSQL), 8080(SPRING)

192.168.0.252:3306 (내 컴퓨터 MYSQL)
192.168.0.252:3306 (내 컴퓨터 SPRING)
```
```
LOCALHOST : 127.0.0.1 
내가 내 서비스 접속할 때쓰는 IP
모든 컴퓨터가 동일함
```
### PrivateIP 
- 사용이유
    1. 보안
    2. IP부족
- 특징
    - broadcasting : 송신 호스트가 전송한 데이터가  
    네트워크에 연결된 모든 호스트에 전송되는 방식

### 고정IP (StaticIP)
- public or private
- 회사, 메인 서비스 서버(컴퓨터)
- 특정 한 사람에게 주는 IP
### 유동IP (Dynamic Host Configuration Protocol)
- public or private
- 카페, 병원, 식당, 집 ...
---
## ROUTER 
- 라우터에서 주는 IP : 내부IP
```
광랜(인터넷 선) --- 라우터 ===> 내가 부여받은 IP
115.94.162.198 ---- 라우터 ===> 192.168.0.252
진짜IP ------------ 라우터 ===> 가짜IP
외부IP ------------ 라우터 ===> 내부IP
publicrIP---------  라우터 ===> privateIP

실제IP는 1개이기 때문에 가짜IP를 생성해서 나눠줌
이때 내부IP는 같은 외부IP에서 IP를 받은 집단만 알 수 있음
```
- 보안
- IP부족
```
A집단외부IP ------------> B집단외부IP
A집단에서 B집단으로 접속을 하고싶으면
A집단외부IP를 받아서 다른 집단의 외부IP로 접속
```
---
## Subnet
- 하나의 publicIP를 공유하는 공간
