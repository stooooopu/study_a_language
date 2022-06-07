# foreign key 
- 참조키(외래키)는 컬럼 이름이 중요한게 아니라, 데이터 타입이 같아야 한다
## on delete 
- 부모테이블 데이터에 __삭제__ 이벤트가 발생  
 -> 자식테이블 데이터에 이벤트 발생
## on update 
- 부모테이블 데이터에 __수정__ 이벤트가 발생  
 -> 자식테이블 데이터에 이벤트 발생
```sql
CREATE TABLE 테이블_이름  
  (column명 type (type의 길이),  
  foreign key(
      생성하는 테이블 column 중 참조하려는 column이름
      ) 
  references 참조할table(참조 할 coulmn) 
    
= 자식table(자식coulmn) references 부모table(부모coulmn)
```
```sql
 CREATE TABLE emp
  ( empno int(11),  
  ABC int(5),  
  ename barchar(20),  
  deptno int(5),  
  foreign key(deptno) referebces dept(deptno))

  or

  foreign key(ABC) referebces dept(deptno))  
```
- 조건 : 참조하고자 하는 테이블은 고유한 컬럼이어야 함
- foreign key(ABC) 가 들어갈 수 있는 이유
  - 데이터타입도 같고 괄호 안에 조건도 같아서 가능  
  - 하지만 헷갈리지 않기 위해 보통 column 이름을 같게함
---
# 이벤트 종류
## 1. cascade : 자식데이터 삭제 or 수정
```sql
foreign key(deptno) references dept(deptno) ON DELETE CASCADE (or on update cascade) 
```
- dept table에 deptno 30을 지웠을 때  
=> emp table deptno 30 인 사람들 모두 삭제됨  

## 2. set null : 자식데이터 null 업데이트
```sql
foreign key(deptno) references dept(deptno) on delete set null (or on update set null)
```
- dept table에 deptno 30을 지웠을 때  
=> emp table deptno 30 인 사람들의 deptno 모두 null로 바뀜  

## 3. set default : 자식데이터 default 값으로 업데이트
```sql
foreign key(deptno) references dept(deptno) on delete set default (or on update set default)
```  
- dept table에 deptno 30을 지웠을 때  
=> emp table deptno 30 인 사람들의 deptno 모두 default값으로 바뀜

## 4. restrict(default) : 부모데이터 삭제 or 수정 불가능  
```sql
foreign key(deptno) references dept(deptno) on delete restrict (or on update restrict)
```
- dept table에 deptno 30을 지우고 싶어도  
emp table deptno 30이있으니 지우거나 수정 불가  
- dept table에 deptno 60을 지운다면 emp table deptno 60이 없으니  
dept table deptno 60은 지우거나 수정 가능

## 5. NO ACTION : 자식테이블의 데이터 변경 안됨
```sql
foreign key(deptno) references dept(deptno) on delete set no action (or on update no action)
```
- dept table에 deptno 30을 지웠을 때  
=> emp table deptno 30 인 사람들 남아 있음  

---
# ALTER로 FK 이벤트 주기
```sql
ALTER TABLE 자식테이블 ADD FOREIGN KEY (FK컬럼명) REFERENCES 부모테이블 (FK컬럼명) ON DELETE CASCADE;
```


---

### table 설계 예시
- 조건. 담당교수가 한 명이라고 가정
```
학생 table  

column
학번 (PK)
학생이름  
학생나이  
담당교수이름  
학점  
학년  
```
```
교수 table

column  
교수번호 (PK)
교수이름  
담당과목  
연차  
```
=>이때 학생table에 '담당교수이름'이 교수table에 '교수번호'와 같음  
그래서 학생table '담당교수이름'->'교수번호'로 바꾸면 됨  
```
학생 table

column  
학번 (PK)
교수번호 (외래키, 참조키, FK)
학생이름  
학생나이  
학점  
학년  
```