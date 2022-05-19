package 컬렉션즈;

import java.util.ArrayList;

	class Student {
		String name;
		int age;
		String addr;
		
		public Student() {
			
		}
		
		public Student(String name, int age, String addr) {
			this.name = name;
			this.age = age;
			this.addr = addr;	
		}
		
		public void setAge(int age) {
			this.age += age;
		}
		
		public int getAge() {
			return this.age;
		}
	}
	
	
public class ArrayList_Study02 {

	public static void main(String[] args) {
		
		Student s1 = new Student("최승철",28,"서울");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1); // student클래스 추가
		
		// 클래스안에있는 필드변수랑 메소드를 불러올 수 있음
		
		String name = list.get(0).name; // student클래스 필드변수 불러옴
		int age = list.get(0).age; // student클래스 필드변수 불러옴
		String addr = list.get(0).addr; // student클래스 필드변수 불러옴
//		System.out.println(name+age+addr);
	
		list.get(0).setAge(2);
		age = list.get(0).getAge(); // student 메소드 불러옴
//		System.out.println(age);
		
		Student s2 = new Student("윤정한",28,"서울");
		list.add(s2);
		String name2 = list.get(1).name;
		int age2 = list.get(1).age;
		
		
		String addr2 = list.get(1).addr;
//		System.out.println(name2+age2+addr2);
		
		// list[1]번에 있는 setAge함수를 불러와서 파라미터에 12입력 -> 함수실행
//		age2 = list.get(1).setAge(12); 변수에 안담기는 이유는 return이 없는 void이기 때문에 
		list.get(1).setAge(12);
		// list[1]번에 있는 getAge함수를 불러와서 그 값을 age2에 대입 
		// => class Student > setAge()안에 this.age가 필드변수 age에 대입되어있는 상태 > this.age는 현재 40  
		age2 = list.get(1).getAge();
		System.out.println(age2);
		
		
		
	}
}
