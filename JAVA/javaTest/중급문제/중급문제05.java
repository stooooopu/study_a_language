//    상원이는 깜빡하고 고객 핸드폰 번호를 암호화 하지 않고 저장 했다.  
//    핸드폰 번호 가운데와 뒷자리를 x로 변경하자.
//### 제한사항
//- 앞자리가 010이 아니라면 "핸드폰 번호를 변경해야 합니다." 출력.
//- 핸드폰 번호 중간자리와 끝자리가 4개이면 x4개, 3개면 x3개
//- ex) 010-333-0000 -> 010-xxx-xxxx
//	### 입출력 예
//    핸드폰 번호를 변경해야 합니다.
//    010-xxxx-xxxx


	public static void main(String[] args) {
        String phone = "017-404-1234";
        String array[] = phone.split("-");
        if(array[0].equals("010")) {
        	if(array[1].length() == 3) {
        		array[1] = "xxx";
        	}else if(array[1].length() == 4){
        		array[1] = "xxxx";
        	}if(array[2].length() == 3) {
        		array[2] = "xxx";
        	}else if(array[2].length() == 4){
        		array[2] = "xxxx";
        	}
        }else {
        	array[0] = "아님";
        	array[1] = "";
        	array[2] = "";
        }
        
		for(String str : array){
			System.out.print(str);
		}
		
		
		
	}