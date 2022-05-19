package 생성자;

public class MovieVO {
	 String name; 
	 String location; 
	 int count; 
	 
	 
	 public MovieVO() {
		 //디폴트생성자 없이 파라미터가 있는 생성자를 만들면
		 //디폴트생성자는 없어짐
		 //디폴트생성자를 사용하고 싶으면 이렇게 새로 만들어야 함
	 }
	 public MovieVO(String location) {
		 this.location = location;
	 }
	 public MovieVO(String name, String location, int count) {
		 this.name = name;
		 this.location = location;
		 this.count = count;
	 }
	 public int getMovie() {
		 return 0;
	 }
	
	
}