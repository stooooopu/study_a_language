//☆★☆★☆★정말 많이 씀
	public static void main(String[] args) {

		String name = "ABCD";
		String 소문자 = "abcd";
		String result = "";
		//대문자->소문자 전환 .toLowerCase();
		result = name.toLowerCase();//. 하고 뜨는 리스트 = String class에서 구현된 함수들
		//이때 파라미터값이 문자이기 때문에 String result로 변수지정
		System.out.println(result);
		
		//소문자->대문자 전환 .toUpperCase();
		result=소문자.toUpperCase();
		System.out.println(result);

		//☆★☆★☆ 공백삭제 .trim();
		String id = " scoups";//scoups앞에 스페이스바로 공백있음 이걸 삭제하는 문자함수 문자 앞이나 뒤의 공백만 가능
		result = id.trim();
		System.out.println(result);
		

		//☆★☆★☆ 특정 기호를 기준으로 배열지정 .split();
		String phone = "010-3434-8310";//-앞과 뒤로 숫자가 잇는데 이걸 찾아낼거야
		String array[] = phone.split("-");
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		//문자가 긴 데이터를 나눌 때 특정된 특수문자를 빨리 퀘치! 여기에서는 '-' 처럼 특정 문단마다 오는 특수기호
		//반대로 문자가 긴 데이터를 DB에 저장할때 특문포함 저장시켜야함
		//주민번호 체크할 때 많이 씀
		
		//☆★ 문자가 특정길이를 넘어갔을 때 .length();
		String 닉네임 = "ㅉ6ZiYoo";//너무길때 쓰는 함수
		int len = 닉네임.length();//리턴값 int 클래스 String
		System.out.println(len);
		if (len >= 4) {
			System.out.println("닉네임은 4글자 이하로만 작성 가능합니다");
		}
		
		//☆★☆★ 특정 문자나 기호 제거하고 대체 .replace(,);
		String password = "1234@";
		result = password.replace("@", "");//왼쪽이 바꿀 대상 오른쪽이 바꾸고싶은 무언가 지금은 아무것도 없음
		System.out.println(result);
		
		//☆★☆★☆ replace로 중간 공백 없애기 .replace(,);
		String password2 = "123 123 123";//현재 중간중간 공백이있음 이 공백을 없앨것
		result = password2.replace(" ", "");
		System.out.println(result);

//		번외
//		String = Integer.toString(숫자를 문자로 변환)
//		int = Integer.parseInt(문자를 숫자로 변환)
		
	}