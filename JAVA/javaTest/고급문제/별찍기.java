//*->*****별찍기
		//2중 for문 이용해서 * -> ***** 출력할 것
		//if/else/for문밖에있는 전역변수 사용하지 말 것
		//System.out.println(""); 이때 ln은 엔터야!
		for (int i=0; i<6; ++i) {
			for (int j=1; j<=i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}

//*****->*별찍기
		for (int i=5; i>=0; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}