# java programmers 풀면서 알게 된 함수들 정리:clap:


## int len = (int)Math.log10(int type 변수)+1;
- int type 의 길이 구하기 

## array[i] = (int)(n/Math.pow(10, len-i-1))%10;
- Java_practice/programmers/정수_내림차순.md 파일 참고
- for 문 안에서 array[i] 각 자릿수에 숫자 넣기

## int x = Integer.parseInt(String s);
- String s -> int x로 변환

## String s = Integer.toString(int x);
- int x -> String s로 변환

## String x = String.join("추가할 문자", "대상 list or 배열")
- x에 대상 문자들이나 문자 배열을 합쳐 줌

## int x = Math.toIntExact(n);
- long n -> int x로 변환

## try & catch & finally
- try { 에러가 발생할 수 있는 코드 }
- catch { 에러시 수행 }
- finally { 무조건 수행 }
- 주로 데이터베이스에 데이터를 주고받을 경우 많이 사용

## for(int x : array 변수명){ (system.out.print array 변수명) } 
- 배열을 출력하고 싶을 때  
이때 int 변수명의 데이터타입은 배열에 맞게 바뀌면 됨

## Arrays.sort(array));
- 배열 오름차순 정리

## .getInstance()
- 싱글패턴, 하나의 인스턴스만 가지고 공유해서 사용
```
new 생성자를 통한 객체선언
    ClassType x = new ClassType();

.getInstance()를 통한 객체선언
    ClassType y = ClassType.getInstance();
- 싱글톤 패턴을 적용한 경우
```
