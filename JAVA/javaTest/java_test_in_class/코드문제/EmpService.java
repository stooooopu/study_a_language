package final_test;

import java.util.ArrayList;
import java.util.List;

public class EmpService implements EmpServiceImpl{

	@Override
	public List<EmpVO> getEmpList(List<EmpVO> list) {
		for(int i=0; i<list.size(); i++) {
			int sal = list.get(i).getSal();
			list.get(i).setSal(sal+EmpCode.SPECIAL_BONUS);
		}
		return list;
	}

	@Override
	public EmpVO getEmp(List<EmpVO> list) {
		int temp = 0;
		for(int i=0; i<list.size(); i++) {
			int max = 0;
			int sal = list.get(i).getSal();
			if(max<sal) {
				max = sal;
				temp = i;
			}
			
		}
		return list.get(temp);
	}

	@Override
	public int getCount(List<EmpVO> list, int sal) {
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			int empSal = list.get(i).getSal();
			if(sal >= empSal) {
				++count;
			}
		}
		return count;
	}

	@Override
	public EmpVO setDept(EmpVO empVO) {
		DeptVO dept = new DeptVO(10, "SALES");
		List<DeptVO> list = new ArrayList<DeptVO>();
		list.add(dept);
		
		empVO.setList(list);

		return empVO;
	}

}
