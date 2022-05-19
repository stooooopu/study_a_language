package shopping;

//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ShoppingService implements ShoppingServiceImpl{
	
	@Override //1,6. 포인트가 가장 높은 회원 조회.(단, 중복데이터는 없다고 가정)
	public UserVO getPointRankerUser(List<UserVO> list) {
		int max = 0;
		int temp = 0;
		for(int i=0; i<list.size(); i++) {
			int point = list.get(i).getPoint();
			if(max<point){
				max=point;
				temp = i;
			}
		}
		return list.get(temp);
	}
	

	@Override //2. 회원 중 앞글자에 S가 들어간 회원 정보 조회.
	public List<UserVO> getFindByName(List<UserVO> list, String word) {
		List<UserVO> newList = new ArrayList<UserVO>();
		for(int i=0; i<list.size(); i++) {
				String name = list.get(i).getUserName();
				if(name.substring(0, 1).equals(word)) {
					newList.add(list.get(i));
				}
			}
		return newList;
	}
	
	@Override //3. 현재날짜 기준으로 90일동안 방문 없었던 회원 휴먼 계정으로 수정.
	//true = 휴먼
	public List<UserVO> updateNotSleeperToSleeper(List<UserVO> list, int days) {
//		Date d = new Date(); //현재 시간
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		String strToday = formatter.format(Calendar.getInstance().getTime()); // 오늘날짜 리턴
		Date today = null; // 오늘 날짜
		Date visit = null; // 방문 날짜
		try {
			for(int i=0; i<list.size(); i++) {
				String strVisitAt = list.get(i).getVisitAt(); // 마지막 방문 날짜 시간
				today = formatter.parse(strToday); // simpleDateFormat으로 바꾼 오늘날짜
				visit = formatter.parse(strVisitAt); // simpleDateFormat으로 바꾼  마지막 방문 날짜
				long diffDay = (today.getTime() - visit.getTime()) / (1000*60*60*24); //일 구하기
				if(diffDay >= days) {
					list.get(i).setSleeper(true);
				}else {
					list.get(i).setSleeper(false);
				}
			}
		} catch(ParseException e) {
			e.printStackTrace(); // 에러를 추적하겠다
		}
//		
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.DATE, -days);
//		java.util.Date weekago = cal.getTime();
//		long longDays = weekago.getTime();
//		
//		for(int i=0; i<list.size(); i++) {
//			try { 
//				String strDate = list.get(i).getVisitAt();
//				// 일반date로 날짜 조회시 , Locale.KOREA로 꼭 해야함
//				SimpleDateFormat transDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//				java.util.Date intDate = transDate.parse(strDate);
//				long longDate = intDate.getTime();
//				if(longDate<longDays) {
//					list.get(i).setSleeper(true);
//				}
//			}
//			catch (Exception e){
//	            System.out.println(e.toString());
//	        }
//		}
		return list;
	}

	@Override  //4. 휴먼계정 인원 수 조회.
	public int getSleeperUserCount(List<UserVO> list) {
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).isSleeper()) {
				++count;
			}
		}
		return count;
	}
	
	@Override //5. 휴먼계정이 아닌 회원에게 100포인트 추가 지급. 
	public List<UserVO> updatePoint(List<UserVO> list, int point) {
		for(int i=0; i<list.size(); i++) {
			if(!list.get(i).isSleeper()) {
				int exsitingPoint = list.get(i).getPoint();
				list.get(i).setPoint(exsitingPoint+point);
			}
		}
		return list;
	}

	@Override // 7. 특정 회원에게 상품구매 발생. 구매한 상품의 가격 5%가 포인트로 지급. 
	public List<UserVO> getPurchaseRankerUser(List<UserVO> list, ProductVO vo, int userNo) {
		List<ProductVO> productList = new ArrayList<ProductVO>();
		double pointPercent = 0.05;
		for(int i=0; i<list.size(); i++) {
			if(userNo == list.get(i).getUserNo()) {
				productList.add(vo);
				int productPrice = vo.getPrice();
				int point = (int)(productPrice * pointPercent);
				list.get(i).setList(productList);
				list.get(i).setPoint(list.get(i).getPoint()+point);
			}
		}
		
		return list;
	}
	
	@Override //8. 구매이력이 있는 회원만 조회.
	public List<UserVO> getUserList(List<UserVO> list) {
		List<UserVO> newList = new ArrayList<UserVO>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getList() != null) {
				newList.add(list.get(i));
			}
		}
		return newList;
	}
}
