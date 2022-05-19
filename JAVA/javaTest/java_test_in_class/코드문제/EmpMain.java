package final_test;
import java.util.ArrayList;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		List<EmpVO> list = new ArrayList<EmpVO>();
		list.add(new EmpVO(100, "ALLEN", 100));
		list.add(new EmpVO(110, "SMITH", 100));
		list.add(new EmpVO(120, "WILLSON", 200));
		list.add(new EmpVO(130, "SANGWON", 50));
		list.add(new EmpVO(140, "BRIAN", 600));
		list.add(new EmpVO(150, "KING", 3000));

		EmpServiceImpl service = new EmpService();
		
		//1번. 전체 사원 200달러 급여 인상하고 사원 리스트를 리턴 하시오. 
		for(EmpVO vo : service.getEmpList(list)) {
			System.out.println("1.사원이름 : "+vo.getEname()+" 급여 : "+vo.getSal());
		}
		//2번. 급여가 가장 높은 사원을 리턴 하시오. (단, 급여 중복이 없다고 가정)
		System.out.println("2.사원이름 : "+service.getEmp(list).getEname());
		
		
		//3번. 사원 중 급여를 300이하로 받고 있는 사원 수를 구하시오.
		int count = service.getCount(list, 300);
		System.out.println("3.사원수 : "+count);
		
		//4번. 특정 사원에 부서번호 10, 부서이름 SALES 부서를 추가하고 사원을 리턴하시오.
		int empno = 150;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getEmpno()==empno) {
				service.setDept(list.get(i));
				System.out.println("4."+list.get(i).getEname()+" "+list.get(i).getList().get(0).getDname());
				System.out.println("4."+list.get(i).getEname()+" "+list.get(i).getList().get(0).getDeptno());
			}
		}
	}
}
	