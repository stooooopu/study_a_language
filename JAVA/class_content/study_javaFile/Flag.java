package 메소드메소드;
public class Flag {

	public static void main(String[] args) {

		boolean isFlag = false; //여기는 true or false만 올 수 있음
		
		int num = 10;
		int num_2 = 20;
		
		if (num == num_2) {
			isFlag = false; //이렇게 상태를 제어합니다
		}
		if (!isFlag) {//false
			System.out.println("false입니다");
		}
		if (isFlag) {//true
			System.out.println("true입니다");
		}
		
		
		if(5 == 5) {
			isFlag = true;
		}
		if(isFlag) {
			int sum = 0;
			for (int i=0; i<5; i++) {
				sum += i;	
			}
			System.out.println("true일때만 실행하는로직예제"+sum);
		}
		if (isFlag) {
			int sum = 0;
			for (int i=0; i<10; i++) {
				sum += i;	
			}
			System.out.println("false일때만 실행하는 로직예제"+sum);
		}
// -----------------------------------------------------------------------절취선
public class FlagMethod02 {
	
public static void 로봇팔을동작하다() {
	System.out.println("팔을 동작하다");
}
public static void 로봇다리를동작하다() {
	System.out.println("다리를 동작하다");
}
public static void main(String[] args) {
	boolean isFlag = true;
	//현재 isFlag는 true인데 밑에 if조건이 맞아서 실행됨
	//그래서 if(!isFlag)가 실행!!
	//만약 if(3>0)가 (3<0)이라면 if실행 안하니까
	//isFlag = true -> if(isFlag)가 실행!!
	
	if(3>0) {//어떠한 로직에 의해 isFlag값이 변경됨
		isFlag = false;
	}

	if(!isFlag) {//flag값에 따라 서로 다른 메소드가 호출됨 
		로봇다리를동작하다();
	}
	
	if(isFlag) {
		로봇팔을동작하다();
	}
	
 }
}
// ------------------------절취선
public class FlagMethod {
	
	public static int getSum(int x, int y) {
		int num = getSum(10);//메소드 안에 메소드 호출 가능
		return num+y;
	}
	public static int getSum(int x) {
		return x;
	}
	public static void main(String[] args) {
		//낵아 함수를 실행해서 결과값을 보고 싶을 때
		//main함수에서 무적건 호출 해야함
		int result = getSum(10,20);
		System.out.println(result);
	}
}