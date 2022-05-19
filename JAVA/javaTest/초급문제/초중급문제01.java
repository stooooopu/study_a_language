//		5. 100넘는 숫자 개수 찾기
//		### 문제설명
//		    배열을 선언하고 100이 넘는 개수가 몇개인지 찾으시오.
//		### 제한사항
//		- 변수는 아래와 같이 선언.
//		- 개수가 3개 이하면 count에 5를 대입하시오.
//		### 입출력 예 4
		   int count = 0;
		   int array[] = {101, 110, 120, 130, 88, 30};
		   for(int i=0; i<array.length; i++) {
			   if (array[i]>100) {
				   count++;
			   }
		   }if(count<5) count=5;
		System.out.println(count);
		
//		6. 거스름돈 문제
//		### 문제설명
//		    철수의 계좌잔고는 현재 157000이 있다.  
//		    은행가서 5만원, 만원, 5천원 으로 교환을 하고 싶다.  
//		    157000은 5만원 3장, 만원 0장, 5천원 1장으로 교환이 가능할 것 이다.  
//		### 제한사항
//		- 변수는 아래와 같이 선언.
//		- 잔고에 20만원이 넘으면 money에 0을 대입하시오.
//		### 입출력 예
//	    오만원 3장
//	    만원 0장
//	    오천원 1장
	    int money = 157000;
	    int 거스름돈 = 0;
	    int 장수 = 0;
	    final int OMAN = 50000;
	    final int MAN = 10000;
	    final int OCHEON = 5000;
	    if(money > 200000) {
	    	money = 0;
	    }
	    장수 = money / OMAN;
	    System.out.println("오만원은"+장수+"장");
	    거스름돈 = money % OMAN;
	    장수= 거스름돈 / MAN;
	    System.out.println("만원은"+장수+"장");
	    거스름돈 = 거스름돈 % MAN;
	    장수= 거스름돈 / OCHEON;
	    System.out.println("오천원은"+장수+"장");