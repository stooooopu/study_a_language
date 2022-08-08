# 가장 먼저 위치설정 확인
![00](/AWS/img/00.JPG)

# AWS S3 과정

## 1. 버킷만들기 클릭
![01](/AWS/img/01.JPG)

## 2. 버킷 이름 = 내가 할 도메인 주소 입력
![02](/AWS/img/02.JPG)
ex) stopu.com / .io / .pro / .net ...    

## 3. 이름(stopu.io) 클릭
![03](/AWS/img/03.JPG)

## 4. 속성 -> 스크롤 마지막 정적 웹 사이트 호스팅
![09](/AWS/img/09.JPG)
![11](/AWS/img/11.PNG)

## 5. 인덱스 문서 항목에 내가 올릴 html파일의 이름과 동일하게 작성
![12](/AWS/img/12.PNG)
## 6. 권한 -> 퍼블릭 엑세스 차단(버킷 설정) 클릭
![04](/AWS/img/04.JPG)

## 7. 체크박스 전체 해제
![05](/AWS/img/05.JPG)
![06](/AWS/img/06.JPG)

## 8. 버킷 정책에서 편집 클릭
![07](/AWS/img/07.JPG) 


## 9. 밑에 버킷정책 복사 후 도메인주소에 2번에서 만든 도메인 입력
![08](/AWS/img/08.JPG)
- 버킷정책
```
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Principal": "*",
            "Action": "s3:*",
            "Resource": "arn:aws:s3:::도메인주소/*"
        }
    ]
}
```
## 10. 속성 클릭
![09](/AWS/img/09.JPG)

## 11. 스크롤 끝에 주소 생성 됨
![10](/AWS/img/10.JPG)

---
# AWS EC2
## 1. EC2 -> 인스턴스 시작
- 인스턴스 = 객체  

![EC2_01](/AWS/img/EC2/EC2_01.JPG)

## 2. 이름 : 내가 원하는 서버이름
![EC2_02](/AWS/img/EC2/EC2_02.JPG)


## 3. Quick Start -> 더 많은 AMI찾아보기 -> ubuntu 18.04 선택
![EC2_03](/AWS/img/EC2/EC2_03.JPG)

## 4. 내가 원하는 열쇠이름 쓰고 저장 -> 바탕화면에 옮기기 (.pem)
![EC2_04](/AWS/img/EC2/EC2_04.JPG)


## 5. 인스턴스 유형에 '프리티어 사용가능' = 365일 무료
![EC2_05](/AWS/img/EC2/EC2_05.JPG)


## 6. 기존 보안그룹 -> Default -> 인스턴스 시작
- 스토리지 : 하드디스크(최소 8GB)  

![EC2_06](/AWS/img/EC2/EC2_06.JPG)

## 7. 생성된 EC2 확인
![EC2_07](/AWS/img/EC2/EC2_07.JPG)

## 8. ip 추가내용
퍼블릭ip / 탄력적ip
- 둘다 퍼블릭ip  
퍼블릭ip : 고정이 아님 재부팅시 바뀜(DHCP)  
바뀌는 걸 고정하기 위해 탄력적ip를 받아야 함(유료)  

![EC2_08](/AWS/img/EC2/EC2_08.JPG)

## 9. side nav : 보안그룹
![EC2_09](/AWS/img/EC2/EC2_09.JPG)

## 10. 인바운드 규칙 -> 인바운드 규칙 편집
![EC2_10](/AWS/img/EC2/EC2_10.JPG)

## 11. SSH추가
![EC2_11](/AWS/img/EC2/EC2_11.JPG)

## 12. 아웃바운드도 동일하게 추가
---
# Xmanager
내가 방금 만든 클라우드 컴퓨터와 연결할 수 있는 프로그램(원격프로그램) 설치 중  
명령어로 프로그램 설치  
ubuntu : apt명령어를 이용 프로그램을 다운받음  
## 1. Xme4.exe -> userName, companyName : 원하는대로  
keygen.exe -> 생성한 productKey 입력  

![001](/AWS/img/Xmanager/001.JPG)

## 2. Xshell 4 실행  

![002](/AWS/img/Xmanager/002.JPG)

## 3. 새로만들기

![003](/AWS/img/Xmanager/003.JPG)

## 4. 호스트(H): EC2 퍼블릭 IPv4 주소 붙여넣기

![004](/AWS/img/Xmanager/004.JPG)

## 5. 터미널 -> 인코딩(E) : 유니코드로 변경

![005](/AWS/img/Xmanager/005.JPG)

## 6. 사용자 이름 : ubuntu  
사용자 키 -> 찾아보기

![006](/AWS/img/Xmanager/006.JPG)

## 7. 가져오기 -> 바탕화면에 있는 .pem key가져오기 -> 확인

![007](/AWS/img/Xmanager/007.JPG)

---

## java JDK install
1. sudo apt update
2. sudo apt install openjdk-11-jdk
3. Y
4. javac -version

## Ubuntu ROOT 계정 생성
1. sudo passwd root (ROOT 초기 비밀번호 설정)  

![008](/AWS/img/Xmanager/008.JPG)

2. su - (ROOT 로그인)
3. cd /home (바탕화면 home폴더 접속)

## 톰캣 설치
1. wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.64/bin/apache-tomcat-9.0.64.tar.gz  

2. tar xf apache-tomcat-9.0.64.tar.gz   
tar xf(압축푸는 명령어)

3. 같은 경로의 폴더이름을 변경시킬 수 있음  
mv 기존폴더이름 변경할이름

4. sh startup.sh > 8080port가 열림 (tomcat > bin접속)

![009](/AWS/img/Xmanager/009.JPG)

5. netstat -tnlp (현재 실행중인 파일들)  

![010](/AWS/img/Xmanager/010.JPG)
window : .exe  
ubuntu : .sh  

6. EC2 인바운드 규칙 편집 -> 사용자 지정 TCP추가  
아웃바운드 규칙도 동일하게 편집  

![011](/AWS/img/Xmanager/011.JPG)

7. EC2 퍼블릭 IPv4 주소+포트번호 8080 -> tomcat설치 확인

![012](/AWS/img/Xmanager/012.JPG)

---
# RDS
- DB전용 AWS  
## 1. 데이터베이스 생성

![001](/AWS/img/RDS/001.JPG)

## 2. 본인이 사용하는 DB선택 (MySQL 버전 낮춰서 선택)

![002](/AWS/img/RDS/002.JPG)

## 3. DB인스턴스 식별자 : 원하는 이름database / 마스터 암호 : DB접속 암호

![003](/AWS/img/RDS/003.JPG)

## 4. 캡쳐와 동일하게 선택
- 스토리지 : 최종데이터가 쌓이는 장소

![004](/AWS/img/RDS/004.JPG)

## 5. 퍼블릭 액세스 '예' 선택
- 디비는 민감하니까 퍼블릭 액세스는 아니오임 우리는 편의상 예  

![005](/AWS/img/RDS/005.JPG)

## 6. 데이터베이스 생성

![006](/AWS/img/RDS/006.JPG)

## 7. 오른쪽 하단 VPC보안그룹 클릭

![007](/AWS/img/RDS/007.JPG)

## 8. 인바운드&아웃바운드 규칙 수정 -> mysql추가
- 0.0.0.0/0 : 모든 ip허용

![008](/AWS/img/RDS/008.JPG)

## 9. 사용자 sql실행

![009](/AWS/img/RDS/009.JPG)

## 10. create -> connection

![010](/AWS/img/RDS/010.jpg)

## 11. 사용하는 DB선택

![011](/AWS/img/RDS/011.JPG)

## 12. serverHost : 7번의 엔드포인트 / userName&password : 3번에서 설정한 이름&암호

![012](/AWS/img/RDS/012.JPG)

## 13. AWSDB생성 됐는지 확인

![013](/AWS/img/RDS/013.JPG)

## 14. DB이름 수정

![014](/AWS/img/RDS/014.JPG)

## 15. AWS SQL편집기 실행

![015](/AWS/img/RDS/015.jpg)

## 16. create DB & TABLE 실행
- DB만 생성하면 autoincrement가 체크 안됨

![016](/AWS/img/RDS/016.JPG)

## 17. create한 table 체크

![017](/AWS/img/RDS/017.JPG)

## 18. 데이터 내보내기

![018](/AWS/img/RDS/018.jpg)

## 19. 테이블선택 Cxported에 내가 선택한 테이블이 있는지 확인

![019](/AWS/img/RDS/019.JPG)

## 20. target container에 내가 생성한 AWS로 선택해야함 (choose)

![020](/AWS/img/RDS/020.JPG)

## 21. target container확인

![021](/AWS/img/RDS/021.JPG)

## 22. target [Existing]확인 > 진행

![022](/AWS/img/RDS/022.JPG)

## 23. 테이블에 데이터 들어왔는지 확인

![023](/AWS/img/RDS/023.JPG)

## 24. edit connection으로 연결 SQL수정

![024](/AWS/img/RDS/024.jpg)

## 25. serverHost : 7번의 엔드포인트 / userName&password : 3번에서 설정한 이름&암호

![025](/AWS/img/RDS/025.JPG)


## 26. AWSDB사용할 yaml파일 실행

![026](/AWS/img/RDS/026.JPG)

## 27. url 및 username, password수정

![027](/AWS/img/RDS/027.JPG)

