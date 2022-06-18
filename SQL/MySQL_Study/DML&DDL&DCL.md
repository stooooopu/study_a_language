# TCL
- COMMIT (DML : COMMIT 미포함 / DDL : COMMIT 포함)  
- ROLLBACK : A가 DB접속 -> INSERT를 5번 하고 COMMIT-> 실수로 DELETE  
    이때 ROLLBACK을 이용해서 최신 COMMIT상태로 돌아감
---
# DML(Data Manipulation Languge)
- 데이터 조작 언어
-	공통점 : data룰 관리하는 명령어
  - SELECT : 데이터 조회
  - DELETE : 데이터 삭제
  - UPDATE : 데이터 수정
  - INSERT : 데이터 삽입 or 생성

## 1. INSERT : 데이터를 저장  
1. 작성법
```
  INSERT INTO 테이블 이름 (컬럼이름)  
  VALUES (컬럼에 해당하는 데이터)  
```
```sql
  INSERT INTO emp (ename, sal)  
  VALUES ('최승철', 3000)  
```
2. 작성법
- 해당 테이블에 데이터를 모두 넣는다면 테이블 이름 뒤 괄호 생략
```
  INSERT INTO 테이블 이름  
  VALUES (컬럼에 해당하는 데이터)  
```
```sql
  INSERT INTO emp  
  VALUES ('최승철', 3000, 'manager' ...)  
```
- 주의
  - 테이블에 job컬럼이 not null이면 insert할 때 무조건 데이터를 넣어야함
  - 테이블에 기본키 설정이 auto increment가 아니라면  
  기본키 데이터를 넣어야함 (되어있다면 JAVA의 ++count처럼 자동 증감됨)
  - commit; 해야 최종 insert가 됨( dbeaver같은 프로그램은 auto commit이 디폴트 값이라 바로 insert 됨)

## 2. DELETE : 데이터 삭제
작성법
```
  DELETE FROM (테이블 이름)  
  WHERE (원하는 조건)  
```
```sql
  DELETE FROM dept  
  WHERE deptno=70  
```
- 주의
  - 해당 컬럼이 ON DELETE CASECADE로 설정되어 있으면,  연관된 컬럼이 모두 삭제 됨  
  (ex dept테이블 deptno = 30에 ON DELETE CASECADE이 걸려있으면 emp테이블 deptno = 30 도 지워짐)
  - commit; 해야 최종 delete가 됨  
  (dbeaver같은 프로그램은 auto commit이 디폴트 값이라 바로 delete 됨)
  - 실제로 데이터가 삭제 되는 것이 아님 -> 컬럼을 하나 더 만들어서 휴먼 데이터 관리
    - ex) '회원탈퇴여부' 컬럼 추가 'Y' or 'N'만 오게해서 탈퇴여부를 볼 수 있게 함 => FLAG

## 3. UPDATE : 데이터 수정
## 4. SELECT : 데이터 조회

---

# DDL(Data Definition Languge) 
- 데이터 정의 언어
- 프로그램과 상관없이 auto commit
- 공통점 : table을 관리하는 명령어
## 1. CREATE : 테이블 생성 
1. 작성법
```
 CREATE TABLE tableName(  
컬럼이름 데이터타입(자릿수 지정가능) 조건 );  
```
=>전체를 '스키마'로 부른다  
```sql
  CREATE TABLE student(  
  id INT(11) NOT NULL auto_increment,  
  name VARCHAR(20) NOT NULL,  
  height INT(5),  
  age INT(5) DEFAULT 0,  
  create_at DATETIME DEFAULT CURRENT_TIMESTAMP,  
  constraint student_id_pk primary key (id));  
```
이때 마지막 줄을  
```sql
id INT(11) NOT NULL auto_increment PRIMARY KEY 
```
로도 사용가능하지만  
나중에 조회가 안되므로 간단한 테이블에만 사용  
- DEFAULT : 입력안하면 테이블에 자동으로 0 세팅  
- NOT NULL : 필수입력조건
- create_at DATETIME DEFAULT CURRENT_TIMESTEMP : 디폴트값이 현재시간
- CONSTRAINT student_id_pk PRIMARY KEY(id) : 제약조건에 변수를 주는 것(student_id_pk)  
  기본키를 관리하기 위해서 student_id_pk를 입력  
- auto_increment : id가 입력될때마다 자동 증감
### 계정 생성
```sql
-- root 계정만 다른 계정을 생성할 수 있음
-- '%' : 어떤 PC등 접속이 가능하게 만들겠다
create user stopu@'%' identified by '12345';
```

## 2. DROP : 테이블 삭제
```sql
  DROP TABLE tableName;
```
## 3. ALTER : 테이블 수정
```sql
-- 컬럼을 추가, 수정, 삭제하고 싶을 때 사용
-- modify : 수정
-- drop : 삭제
  ALTER TABLE tableName

  cloumnName변경
  ALTER TABLE tableName RENAME COLUMN 변경전이름 TO 변경할이름;

  cloumnDataType변경
  ALTER TABLE tableName MODIFY coulmn_name dataType() NOT NULL;

  FK추가
  ALTER TABLE tableName add constraint blog_board_id_fk foreign key(board_id)
references blog_board_name(id) on delete cascade;
```
---

# DCL(Data control Languge)

- 데이터 제어 언어 (보통 팀장급들이나 큰 규모의 회사에 가게되면 씀 데이터베이스를 관리하는 직업)
- 공통점 : 데이터베이스 관리
## GRANT : 특정 사용자에게 권한 부여
```sql
grant select on DB_name.table_name to user_id; 
```
```sql
-- 여기까지는 아무 권한 없는 계정
-- ----------------------------------------------------
-- grant로 권한 부여
-- on DB_name.table_name(* :  테이블전체를 의미)
grant select , insert , update on dw.* to stopu@'%';
```
## REVOKE : 특정 사용자 권한 회수