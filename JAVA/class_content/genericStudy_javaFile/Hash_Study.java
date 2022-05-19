package 컬렉션즈;
import java.util.ArrayList; // 각각 import따로 해 줘야함
import java.util.HashMap; 
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class OneSoju extends Object{ // extends Object가 default로 숨겨져있음
	
}

public class Hash_Study {
	
	public static void main(String[] args) {
		// 부모는 자식을 포함받을 수 있다 (자식이 부모를 받을 수는 없음)
		
		// 1. ArrayList<String> list에 ArrayList받기
		ArrayList<String> list = new ArrayList<String>();
		
		// 2. List<String> list2에 ArrayList받기 
		// List의 자식으로 ArrayList / LinkedList / Vector가 존재
		// 부모는 자식을 받을 수 있기때문에 List<String> list2 = new ArrayList<String>(); 가능
		List<String> list2 = new ArrayList<String>();
		
		// 3. 기존 List로 생성한 변수에 List의 다른 자식으로 변경가능
		list2 = new LinkedList<String>();
		
		HashMap<String,String> map = new HashMap<String,String>(); 
		map.put("1","참이슬"); //HashMap데이터 넣기
		map.put("2","처음처럼");
		map.put("a","한라산");
		
		// 한라산 출력
		System.out.println(map.get("a")); //key로 value에접근
		
		// value에 Object : 모든걸 포함시키겠다
		HashMap<String,Object> map1 = new HashMap<String,Object>();
		map1.put("b", 13);
		System.out.println(map1.get("b"));

		OneSoju onesoju = new OneSoju();
		// value에 onsoju를 넣을 수 있음
		// 1. class도 데이터타입이니까
		// 2. map1의 value의 타입은 Object, onesoju의 부모도 Object라서 가능
		
		Map<String,Object> map2 = new HashMap<String,Object>();
		
		
	}
}
