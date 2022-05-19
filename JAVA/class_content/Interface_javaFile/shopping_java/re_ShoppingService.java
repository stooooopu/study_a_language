package shopping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ShoppingService implements ShoppingServiceImpl {
	
	@Override //1,6. 포인트가 가장 높은 회원 조회.(단, 중복데이터는 없다고 가정)
	public UserVO getPointRankerUser(List<UserVO> list) {
		int max = 0;
		int index = 0;
		for(int i=0; i<list.size(); i++) {
			int point = list.get(i).getPoint();
			if(max < point) {
				max = point;
				index = i;
			}
		}
		return list.get(index);
	}
	
	@Override//2. 회원 중 앞글자에 S가 들어간 회원 정보 조회.
	public List<UserVO> getFindByName(List<UserVO> list, String word) {
		List<UserVO> sUserName = new ArrayList<UserVO>();
		for(int i=0; i<list.size(); i++) {
			String userName = list.get(i).getUserName();
			if(userName.substring(0, 1).equals(word)) {
				sUserName.add(list.get(i));
			}
		}
		return sUserName;
	}
	
	@Override //3. 현재날짜 기준으로 90일동안 방문 없었던 회원 휴먼 계정으로 수정.
	public List<UserVO> updateNotSleeperToSleeper(List<UserVO> list, int days) {
		//현재 시간
        //	Date d = new Date();
		// SimpleDateFormat을 이용해서 한국시간단위로 맞추고 원하는 데이트포맷 틀 잡음
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		
		// StringType으로 지정
		// .format() : 문자열 형식 지정
		// 위에서 지정한 formatter틀에 맞춰서 오늘날짜 리턴
		String strToday = formatter.format(Calendar.getInstance().getTime()); //getInstance()
		
		Date today = null;
		Date visit = null;
		
		try {
			for(int i=0; i<list.size(); i++) {
				// 방문시간 String변수에 담음
				String strVisitAt = list.get(i).getVisitAt();
				
				// parse(StringTypeDATE) : StringType을 DateType으로 바꿔줌
				today = formatter.parse(strToday); // String오늘날짜 -> DateType오늘날짜
				visit = formatter.parse(strVisitAt); // String방문날짜 -> DateType방문날짜
				
				// 오늘날짜밀리세컨드 - 방문날짜밀리세컨드
				long diffDay = (today.getTime() - visit.getTime()) / (1000*60*60*24);
				
				if(diffDay >= days) {
					list.get(i).setSleeper(true);
				}else {
					list.get(i).setSleeper(false);
				}
			}
		}catch(ParseException e){
			e.printStackTrace();
		}
		return list;
	}
	
	@Override //4. 휴먼계정 인원 수 조회.
	public int getSleeperUserCount(List<UserVO> list) {
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).isSleeper()) {
				++count;
			}
		}
		return count;
	}
	
	@Override  //5. 휴먼계정이 아닌 회원에게 100포인트 추가 지급. 
	public List<UserVO> updatePoint(List<UserVO> list, int point) {
	
		for(int i=0; i<list.size(); i++) {
			if(!list.get(i).isSleeper()) {
				list.get(i).setPoint(list.get(i).getPoint()+point);
			}
		}
		return list;
	}
	
	@Override // 7. 특정 회원에게 상품구매 발생. 구매한 상품의 가격 5%가 포인트로 지급. 
	public List<UserVO> getPurchaseRankerUser(List<UserVO> list, ProductVO vo, int userNo) {
		
		// list.productList안에 담을 ArrayList생성
		List<ProductVO> pro = new ArrayList<ProductVO>();
		// 5%포인트 변수 지정
		double bonus = 0.05;
		
		for(int i=0; i<list.size(); i++) {
			// point변수 지정
			int point = list.get(i).getPoint();
			if(list.get(i).getUserNo()==userNo) {
				// 위에서 생성한 ArrayList에 ProductVOType의 데이터 추가
				pro.add(vo);
				// list.productList에 ArrayListType의 pro세팅
				list.get(i).setList(pro);
				
				bonus = point*bonus;
				list.get(i).setPoint((int)(point+bonus));
			}
		}
		return list;
	}
	
	@Override //8. 구매이력이 있는 회원만 조회.
	public List<UserVO> getUserList(List<UserVO> list) {
		List<UserVO> newList = new ArrayList<UserVO>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getList()!=null) {
				newList.add(list.get(i));
			}
		}
		return newList;
	}
}
