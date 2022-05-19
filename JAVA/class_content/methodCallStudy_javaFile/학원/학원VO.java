package 생성자;

public class 학원VO {
	int 학생수;//필드변수는 디폴트로 0
	String 교사이름;//필드변수는 디폴트로 null
	
	public 학원VO() {//디폴트생성자
		
		
	}

	public 학원VO(int 학생수, String 교사이름) {//int와 String받는 생성자
		this.학생수 = 학생수; //이게 필드변수 초기화
		this.교사이름 = 교사이름; //이게 필드변수 초기화
	}
}
