package test;

import java.util.ArrayList;
import java.util.List;

// 리턴타입과 파라미터 잘 확인
class MemberVO{
	private String memberNo;
	private int sal;
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}

class MemberCode{
	public static final double BONUS=0.1;
	public static final int MAX_VALUE=300;
}

class MemberService implements MemberServiceImpl{
	@Override
	public List<MemberVO> getMemberList(List<MemberVO> list){
		double bonus = MemberCode.BONUS;
		for(int i=0; i<list.size(); i++) {
			int sal = list.get(i).getSal();
			if(list.get(i).getMemberNo().equals("200")) {
				list.get(i).setSal((int) (sal+(sal*bonus)));
			}
		}
		return list;
	}
	
	@Override
	public String getMemberNo(List<MemberVO> list) {
		String memberNoString = null;
		for(int i=0; i<list.size(); i++) {
			int maxVal = MemberCode.MAX_VALUE;
			int sal = list.get(i).getSal();
			if(sal>=maxVal) {
				return list.get(i).getMemberNo();
			}
		}
		return null;
	}
}
public class 긴급점검10 {
	public static void main(String[] args) {
		
		MemberVO vo = new MemberVO();
		MemberVO vo2 = new MemberVO();
		MemberVO vo3 = new MemberVO();
		vo.setMemberNo("100");
		vo2.setMemberNo("200");
		vo3.setMemberNo("300");
		vo.setSal(100);
		vo2.setSal(200);
		vo3.setSal(300);
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		list.add(vo);
		list.add(vo2);
		list.add(vo3);
		
		MemberService service = new MemberService();
		service.getMemberList(list);
		for(MemberVO i : list) {
			System.out.println("멤버번호 "+i.getMemberNo());
			System.out.println("급여 "+i.getSal());
		}
		
		String memberNo = service.getMemberNo(list);
		System.out.println("급여가 300 이상인 멤버번호 "+memberNo);
	}
}
