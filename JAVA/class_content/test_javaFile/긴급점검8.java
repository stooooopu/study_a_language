package test;

import java.util.ArrayList;
import java.util.List;

class Movie{
	// Movie class의 movieName은 private타입
	// set get으로만 호출 가능
	private String movieName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
}


public class 긴급점검8 {
	// static / returnType : List<Movie> / 파라미터 : 없음
	public static List<Movie> getMovieList(){
		
		// 새로운 ArrayList생성
		List<Movie> list = new ArrayList<Movie>();
		
		// Movie class를 인스턴스화 한 후 setMovieName
		Movie movie1 = new Movie();
		movie1.setMovieName("로스트시티");
		Movie movie2 = new Movie();
		movie2.setMovieName("공기살인");
		
		// dataType이 Movie인 ArrayList에 set해준 movie.movieName을 add
		list.add(movie1);
		list.add(movie2);
		
		// list를 return
		return list;
	}
	public static void main(String[] args) {

	// getMovieList는 static이 붙은 함수로 따로 호출 없이
	// 데이터타입을 맞춘 list에 대입
	List<Movie> list = getMovieList();

	System.out.println(getMovieList().get(0).getMovieName());
	
	// 출력
	for(Movie m : list) {
		System.out.println(m.getMovieName());
	}
	
	}
}
