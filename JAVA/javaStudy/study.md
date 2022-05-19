# 목차
1. [JAVA 설치](#java-설치)
1. [dataType](#datatype)
1. [객체지향언어](#객체지향언어)
1. [JAVA](#java)
1. [method](#method)
1. [배열](#배열)
1. [Flag](#flag)
1. [Overloading and @Override](#overloading)
1. [ShortcutKey and Tip](#shortcutkey-and-tip)

---
# JAVA 설치

1. 내pc program files 에 JAVA생성 됐는지 확인 - JDK폴더 들어가기
2. 내pc -> 마우스 우클릭 속성 -> 고급 -> 고급시스템 설정 -> 환경 변수  
3. '시스템 변수'에 새로만들기 클릭 
4. 변수 이름 : JAVA_HOME, 변수 값 : 1번 주소 복붙  
5. 확인 후 변수이름에 새로만들기 %JAVA-HOME%\bin\ -> 확인x3
6. cmb들어가서 javac - java version 까지 확인

---
# dataType
1. 정적 타입
    - int double char array ...
2. 동적 타입
    - String class array ...
---

# 객체지향언어
## 객체지향언어에서 부모 : Object
## 객체
1.  고유한 특성을 가짐
2.  객체들이 모여서 하나의 프로그램이 탄생
3.  업무 분담과 일의 효율성을 위해 사용

## 객체지향언어의 특징
1.  캡슐화 : 내부를 마치 캡슐처럼 보호 {method...}
2.  상속 : 클래스를 부모와 자식으로 두고 부모의 기능을 물려받음
3.  다형성 : 같은 이름의 메소드가 다르게 구현 (메소드 오버로딩, 오버라이딩)

---
# JAVA
1. project
  - 대문자　or　소문자
  - 카멜표기법　or　_ 로 표시
2. package 
  - 소문자
  - 카멜표기법
  - default package존재 (바로 class 생성 가능)
3. class
  - 첫글자만 대문자
4. 정적타입과 동적타입을 따로 관리
  - 동적타입은 Heap Area( memory )에 저장
  - 저장시 고유번호를 가짐 => 메모리주소
    - String : 문자를 비교 X, 메모리 주소비교 (equels( ) 사용)
  - error :  out of Heap area : class를 너무 많이 생성했을 때 저장 공간이 부족해 생기는 에러(서버다운)

---
# method 
## method 란?
1. 재사용성과 코드의 간결함 증가를 위해 사용
    - 각 기능을 분리해서 개발해야 소프트웨어 품질 향상
    - 응집도는 높고( 함수안에 있는 코드는 단단 ) 결합도는 낮아야 좋은 소프트웨어
    - 업무분담을 위해 각자 본인이 개발 할 것들을 나누어야 함
2. static이 붙은  함수에는 static함수만 올 수 있다.
```
public class fruit {
  public int apple(){

  }
  public static int banana(){

  }
	public static void main(String[] args) {
    //여기 static 함수만 호출 가능
      int a = apple();
    // new로 불러온 함수(동적타입)가능 
    }
  }
```
3. main method : 자바에서 먼저 실해되는 기능(함수)  

## <접근 지정자> <리턴타입> <함수이름/메소드이름> <인자값/파라미터값>

1. 접근지정자 : 객체지향 언어는 대부분 평균4개의 접근지정자가 있음
    - public : 다른 클래스에서 호출 가능
    - private : 내부 클래스에서만 호출 가능 
    - protected 
    - default 접근지정자

2. 리턴타입 : 메소드의 최종 결과값을 반환  
    - 데이터타입8개(int,double,float,long...) + 클래스타입(String) 1개 = 총9개
    - 리턴할게 없을 때는 void로 표현  

3. 메소드 : 이름을 동사로

4. 인자값/파라미터값
    - 데이터타입8개(int,double,float,long...) + 클래스타입(String) 1개 = 총9개
    - 인자는 결과를 만들기 위한 재료
    - 인자값이 없을 때는 빈 괄호
    - 인자값은 3개이하로 작성
    - 콤마로 구별함

---
# 배열
- 배열 이유 : 데이터타입이 같은 연관된 데이터들을 쉽게 사용하기 위해
- 배열 단점 : 이미 한 번정해진 배열의 크기를 변경할 수 없음  
- 배열 선언
```
  int[] array1 = new int[3];
  int []array2 = new int[3];
  int array3[] = new int[3];

길이가 3인 배열 3개 선언
3개의 배열 = {0,0,0} 기본값 0으로 세팅 됨
```

---
# Flag
- blooean is변수이름 
  - 변수이름앞에 is를 붙여 blooean형인걸 알 수 있음
  - true　or　flase 만 올 수 있음
```
  blooean isFlag = ture;

  if(isFlag){
    int x = 10;
  }
  if(!isFlag){
    int x = 20;
  }
    System.out.println(x)
  
결과값 : 10
  
  int y = 5;

  isFlag = x < y;
    System.out.println(isFlag)

결과값 : false
```
---
# Overloading 
1. 개념 : 같은 클래스 or 상속 관계에서 동일한 이름의 메소드 중복 가능
2. 조건 
  - 메소드 이름은 동일, 파라미터의 갯수, 타입은 달라야함
  - 동일한 클래스 안에 존재
3. 사용하는 이유 : 이름이 같은 여러 개의 메소드를 선언 사용의 편리성 제공
# @Override
1. 개념 : 서브클래스에서 슈퍼클래스에 있는 동일한 이름의 메소드를 재정의
2. 조건 : 메소드 이름은 동일, 파라미터의 갯수, 타입도 같아야 함
3. 사용하는 이유 : 부모클래스 메소드를 무시하고 자식클래스에서 재정의 하기위해
---
# ShortcutKey and Tip
- 약한 결합 (Loose Coupling) : 파라미터로 객체 받음
- 강한 결합 (Tight Coupling) : class에 method 직접 호출(인스턴스화)
- 프로그래밍에서 접근 :　.
  - ex) Ip : 192.168.0.1
- getter　&　setter
  - alt + shift + s
- generic
  - ctrl + shift + o -> import생성
- calss, metiod annotation
  - alt + shift + j
  - class, method 등 언제 누가 만들었는지 주석다는 것
  - 내용 편집  
  window -> Preperences -> JAVA -> Code Style -> Comments -> type / Methods edit
