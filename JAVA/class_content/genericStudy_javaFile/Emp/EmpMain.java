package 컬렉션즈;

import java.util.ArrayList;

public class EmpMain {
	
	// 1. 모든 사원 번호, 이름 출력 method로 풀어보기
	public static ArrayList<EmpVO> getEmpList(ArrayList<EmpVO> list){ //EmpVO를 담고있는 ArrayList를 파라미터로 받는 중
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("method1. 사원번호 : "+list.get(i).empno+" ,사원이름 : "+list.get(i).ename);
		}
		return list;
	}
	
	public static String getValue(String name) {
		System.out.println("너의 이름은? "+name);
		return name;
	}

	public static void main(String[] args) {
		String name = "최승철";
		getValue(name);
		String result = getValue(name);
		// 크기가 무한정인 배열
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO emp = new EmpVO();
		System.out.println("EmpVO의 메모리 주소 ==>"+emp);
		
//		EmpVO emp를 add(emp)하는 것과 add(new ---)하는것은 같은 의미
//		EmpVO emp = new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20);
//		list.add(emp);
		list.add(new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20,0));
		list.add(new EmpVO(7499,"ALLEN","SALESMAN","1981-02-20",1600,30,300));
		list.add(new EmpVO(7521,"WARD","SALESMAN","1981-02-22",1250,30,500));
		list.add(new EmpVO(7566,"JONES","MANAGER","1981-04-02",2975,20,0));
		list.add(new EmpVO(7654,"MARTIN","SALESMAN","1981-09-28",1250,30,1400));
		list.add(new EmpVO(7698,"BLAKE","MANAGER","1981-05-01",2850,30,0));
		list.add(new EmpVO(7782,"CLARK","MANAGER","1981-06-09",2450,10,0));
		list.add(new EmpVO(7788,"SCOTT","ANALYST","1987-06-28",3000,20,0));
		list.add(new EmpVO(7839,"KING","PRESIDENT","1981-11-17",5000,10,0));
		list.add(new EmpVO(7844,"TURNER","SALESMAN","1981-09-08",1500,30,0));
		list.add(new EmpVO(7876,"ADAMS","CLERK","1987-07-13",1100,20,0));
		list.add(new EmpVO(7900,"JAMES","CLERK","1981-12-03",950,30,0));
		list.add(new EmpVO(7902,"FORD","ANALYST","1981-12-03",3000,20,0));
		list.add(new EmpVO(7934,null,"CLERK","1982-01-23",1300,10,0));
		
		getEmpList(list);
		
		int max = 0;
		int count = 0;
		int index = 0;
		int deptnoCount20 = 0;
		int deptnoCount30 = 0;
		int personCount = 0;
		int commCount = 0;
		int totalSum = 0;
		int len = list.size();
		
		// 비즈니스 로직
		// 1. 모든 사원 번호, 이름 출력
		for(int i=0; i<len; i++) {
			System.out.println("1. 사원번호 : "+list.get(i).empno+" ,사원이름 : "+list.get(i).ename);
			
		} // 1 end
		System.out.println("----------------------------------------------------");
		
		//2. 급여가 1300달러 이상을 받는 사원의 이름,직업 조회
		for(int i=0; i<len; i++) {
			if(list.get(i).sal >= 1300) {
				System.out.println("2. 사원이름 : "+list.get(i).ename+" ,사원직업 : "+list.get(i).job);
			}
		} // 2 end
		System.out.println("----------------------------------------------------");
		
		//3. 직업이 SALESMAN인 사원 중 급여가 1400달러 이상 받는 사원의 번호,이름 조회
		for(int i=0; i<len; i++) {
			if(list.get(i).job.equals("SALESMAN") && list.get(i).sal >= 1400) {
				System.out.println("3. 사원번호 : "+list.get(i).empno+" ,사원이름 : "+list.get(i).ename);
			}
		} // 3 end
		System.out.println("----------------------------------------------------");
		
		//4. 입사년도가 1981년도인 사원의 번호,이름 조회
		for(int i=0; i<len; i++) {
			// split의 return type : 배열
			// String hireYear = list.get(i).hiredate.split("-")[0]; 으로도 가능
			String hireYear[] = list.get(i).hiredate.split("-");
			if(hireYear[0].equals("1981")) {
				System.out.println("4. 사원번호 : "+list.get(i).empno+" ,사원이름 : "+list.get(i).ename);
			}
		} // 4 end
		System.out.println("----------------------------------------------------");
		
		//5. 직업이 MANAGER인 사원 수 조회
		for(int i=0; i<len; i++) {
			if(list.get(i).job.equals("MANAGER")) {
				++count;
			}
		} // 5 end
		System.out.println("5. "+count);
		System.out.println("----------------------------------------------------");
		
		//6. 사원 중 급여를 가장 많이 받는 사원의 번호,이름,입사년도 조회
		for(int i=0; i<len; i++) {
			if(max < list.get(i).sal) {
				max = list.get(i).sal;
				index = i;	
			}
				} // 6 end
		System.out.println("6. 사원번호 : "+list.get(index).empno+" ,이름 : "+list.get(index).ename+" ,입사년도 : "+list.get(index).hiredate);
		System.out.println("----------------------------------------------------");
		
		//7. 부서번호별 수 조회 ex) 20 : 2명, 30: 3명
		for(int i=0; i<len; i++) {
			if(list.get(i).deptno==20) {
				++deptnoCount20;
			}
			if(list.get(i).deptno==30) {
				++deptnoCount30;
			}
		} //7 end
		System.out.println("7. deptno=20 : "+deptnoCount20+" ,deptno=30 : "+deptnoCount30);
		System.out.println("----------------------------------------------------");
		
		//8. 입사월이 02월인 사원 수 조회
		for(int i=0; i<len; i++) {
			String hireMonth[] = list.get(i).hiredate.split("-");
			if(hireMonth[1].equals("02")) {
				++personCount;
			}
		} //8 end
		System.out.println("8. 입사월이 2월인 사원수 : "+ personCount);
		
		System.out.println("----------------------------------------------------");
		System.out.println("B문제");
		System.out.println("----------------------------------------------------");
		
		
		//1. comm을 받은 사원 수와 직업,이름을 조회하시오.
		for(int i=0; i<len; i++) {
			if(list.get(i).comm!=0) {
				System.out.println("1. 직업 : "+list.get(i).job+" ,사원이름 : "+list.get(i).ename);
				++commCount;
			}
		} //1 end
		System.out.println("1. 사원수 : "+commCount);
		System.out.println("----------------------------------------------------");
		
		//2. emp에 있는 급여 평균을 구하시오.
		for(int i=0; i<len; i++) {
			totalSum += list.get(i).sal;
		} //2 end
		System.out.println("2. 급여 평균 : "+totalSum/len);
		System.out.println("----------------------------------------------------");
		
		//3. 사원번호가 7844, 7876인 사원에게 comm 200을 지급하시오.
		for(int i=0; i<len; i++) {
			if(list.get(i).empno==7844 || list.get(i).empno==7876) {
				list.get(i).comm = 200;
				System.out.println("3. comm 200 지급 : "+list.get(i).empno+"  "+list.get(i).comm);
			}
		} // 3 end
		System.out.println("----------------------------------------------------");

		//4. 사원이름이 null인 사원이름에 '데이터 없음' 으로 수정하시오. 
		for(int i=0; i<len; i++) {
			if(list.get(i).ename==null) {
				list.get(i).ename = "데이터 없음";
				System.out.println("4. 사원번호 : "+list.get(i).empno+" ,사원이름 : null-> "+list.get(i).ename);
			}
		} //4 end
		System.out.println("----------------------------------------------------");
		
//		// 5. 20번 부서가 올해 실적이 좋지 않습니다. 20번부서를 모두 해고(제거) 하십시오.
//		for(int i=0; i<len; i++) {
//			if(list.get(i).deptno==20) {
//				list.remove(i);
//			}
//			System.out.println("5. 20번부서 모두 해고 : "+list.get(i).deptno);
//		} // 5 end
		
	}
}
