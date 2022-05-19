# static
- __static__ 으로 선언된 메소드와 변수는 인스턴스화 하지 않아도 호출 가능
- 목적은 공유(share)하는 것
- 공유가 목적인 만큼 값이 변하지 않는 것 들을 선언
- 코드를 정의할 때 (단, 해당 클래스에는 변수만 존재)
- 클래스를 여러개 생성해서 사용하는 상황일 때 : singleton pattern
# Singleton pattern
Singleton 
```
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){
        외부에서 호출할 수 없게 private으로 지정
    }

    public static Singleton getInstance(){
        return instance;
    }

    public void say(){
        System.out.Println("Hello World");
    }
}
```
- 코딩 디자인 패턴 중 하나로 static개념을 응용함
- 주로 공통된 객체(클래스)를 여러개 생성해서 사용하는 상황에서 많이 사용
- 클래스가 최초 한 번만 메모리를 할당하고  
그 메모리에 객체를 만들어 사용하는 디자인 패턴
- 싱글톤은 여러차례 호출되더라도 실제로 생성되는 객체(클래스)는 하나
- DB 연동시 많이 사용
- static이 저장하는 영역이 따로 있기 때문에 이런 singleton이 나온 것
