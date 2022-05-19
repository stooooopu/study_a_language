# 문자메소드

1. 대문자 -> 소문자
- .toLowerCase();
```
    String name = "ABCD";
    String result = name.toLowerCase();
	    System.out.println(result);

결과값 : "abcd"
```

2. 소문자 -> 대문자
- .toUpperCase();
```
    String name = "abcd";
    String result = name.toUpperCase();
	    System.out.println(result);

결과값 : "ABCD"
```

3. 앞 뒤 공백삭제
- .trim();
```
	String id = " scoups ";
	String result = id.trim();
        System.out.println(result);
    
결과값 : "scoups"	
```

4. 배열지정
- .split();
    - 특정기호로 나눔
    - 문자가 긴 데이터를 DB에 저장할 때 특수문자 포함시켜 저장함
    - 핸드폰번호, 주민등록번호 등 체크할때 많이 쓰임 
```
    String phone = "010-1234-5678";
    String array[] = phone.split("-");
    	System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);

결과값0 : "010"
결과값1 : "1234"
결과값2 : "5678"
```

5. 문자 길이
- length();
```
    String nickName = "seventeen";
    int len = nickName.length();
		System.out.println(len);

결과값 : 9

		if (len >= 4) {
			System.out.println("닉네임은 4글자 이하로만 작성 가능합니다");
		}

결과값 : "닉네임은 4글자 이하로만 작성 가능합니다"
```

6. 특정 문자나 기호 대체
- .replace( "바꿀 대상" , "바뀔 대상" );
```
    String password = "1234@";
    String result = password.replace("@", "");
        System.out.println(result);
		
결과값 : "1234"
```
- replace를 이용해 중간 공백제거
```
	String password = "123 123 123";
	String result = password.replace(" ", "");
		System.out.println(result);

결과값 : "123123123"
```

7. 숫자를 문자로 전환
- Integer.toString();
```
    int i = 1;
    String s = Integer.toString(i);
```
8. 문자를 숫자로 전환
- Integer.parseInt();
```
    String s = "123456"
    int i = Integer.parseInt(s);
```