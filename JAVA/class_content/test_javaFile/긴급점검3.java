package test;

import java.util.ArrayList;
import java.util.List;

class Singer{
	public String SingerName; //가수 이름
	
	public Singer(String singerName) {
		this.SingerName = singerName;
	}
}


public class 긴급점검3 {
	
	// 파라미터가 없은 아이들은 받아올 데이터가 없으니 안에서 정의
	public static List<Singer> getListSinger(){
		List<Singer> s = new ArrayList<Singer>(); // 강한관계 Strong 
		s.add(new Singer("김종국"));
		s.add(new Singer("서인국"));
		s.add(new Singer("방용국"));
		return s;
	}
	
	public static List<Singer> getListSinger(List<Singer> list){
		
		return list;
	}
	
	public static Singer getSinger(){
		
		return new Singer("김종국");
	}
	public static Singer getSinger(Singer s){
		
		return s;
	}
	
	public static void main(String[] args) {
		
		//1. getListSinger()이용해서 김종국, 서인국, 방용국 list 출력!
		System.out.println(getListSinger().size());
		for(int i=0; i<getListSinger().size(); i++) {
			System.out.println(getListSinger().get(i).SingerName);
		}
			
		//2. getSinger()이용해서 김종국만 출력!
		System.out.println(getSinger().SingerName);
		
		
		// -----------
		List<Singer> list = new ArrayList<Singer>(); // 강한관계 Strong 
		list.add(new Singer("김종국"));
		list.add(new Singer("서인국"));
		list.add(new Singer("방용국"));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(getListSinger(list).get(i).SingerName);
		}
		
		Singer s = new Singer("김종국");
		getSinger(s);
		System.out.println(s.SingerName);
		
	}
}
