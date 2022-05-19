1. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public int getCount(List<Object> list){
        return 0;
    }
    //리턴 타입 : int
    //메소드 이름: getCount
    //파라미터 타입 : List
```

2. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public void insertData(Map<String, Object> map){

    }
    //리턴 타입 : void(없음)
    //메소드 이름: insertData
    //파라미터 타입 : Map
```

3. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public List<Object> list insertData(String str){
        return null;
    }
    //리턴 타입 : List
    //메소드 이름: insertData
    //파라미터 타입 : String
```

4. 오버라이딩(Overriding)과 오버로딩(Overloading)이 무엇인지 간략히 기술하시오.
- Overloading : 하나의클래스안에서 메소드이름을 동일하게 정의하기 위해 파라미터를 다르게 하는 것
- Overriding : 부모클래스 메소드를 무시하고 자식 클래스의 메소드 사용하기 위해 메소드이름과 파라미터를 동일하게 하는 것

5. 추상클래스와 Interface(인터페이스)에 차이점을 간략히 기술하시오.
- 인터페이스는 다중상속이 가능  
인터페이스 안에는 추상메소드와 변수만 존재  
오버라이드 필수

- 추상클래스 안에는 추상메소드와 일반메소드 모두 존재 가능  
그래서 일반메소드는 오버라이드가 필수는 아님

6. 상속에 대해 아는 내용을 간략히 기술하시오.  
- 자식은 부모클래스를 사용할 수 있지만 부모클래스는 자식클래스 사용 불가
- 모든 클래스의 부모는 Object이다

7. 생성자에 대해 아는 내용을 간략히 기술하시오.  
- 생성자의 목적은 값을 초기화 하는 것이 목적  
- 생성자는 클래스 이름과 동일해야 함
- 디폴트 생성자가 존재
- 리턴타입이 없음

8. 컬렉션에 대해 아는 내용을 간략히 서술하시오.
- 길이가 유동적이다
- <>제네릭 안에는 class만 올 수 있다
- import생성 필수

9. 아래 코드를 보고 예상되는 결과는?

```java
    class A{

        public static int count;
        public int temp;

    }
    class B{

        main(){

            A a1 = new A();
            a1.count = 10;
            a1.temp = 20;

            A a2 = new A();
            a2.count = 20;
            a2.temp = 20;

            System.out.println(a1.count); // 답 : 10
            System.out.println(a1.temp); // 답 : 20

            System.out.println(a2.count); // 답 : 20
            System.out.println(a2.temp); // 답 : 20
        }
    }

```

10. 아래 코드를 보고 예상되는 결과는?

```java
    class A{
        public int money;
    }
    class B{
        public A getInstance(){
            A a = new A();
            return a;
        }
    }
    class C{
        main(){
            B b = new B();
            A a = b.getInstance();
            a.money = 1000;
            a = b.getInstance();
            a.money = a.money + 1000;
            System.out.println(a.money); // 답 : 1000
        }
    }
```

11. getter, setter을 이용하지 않고 필드변수 값을 초기화 하는 방법을 아래 코드로 작성하시오.

```java
class A{
    private String name;
    private int age;
    
    public A(String name, int age){
        this.name = name;
        this.age = age;
    }
}
```
