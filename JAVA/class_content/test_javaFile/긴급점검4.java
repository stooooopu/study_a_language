package test;

import java.util.ArrayList;
import java.util.List;

class FruitVO{
	private String fruitName;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
}

class FruitService{
	public FruitVO getFruit(List<FruitVO> list, String fruitName) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getFruitName().equals(fruitName)) {
				return list.get(i);
			}
		}
		return null;
	}
}

public class 긴급점검4 {
	public static void main(String[] args) {
		List<FruitVO> list = new ArrayList<FruitVO>();
		
		FruitVO f1 = new FruitVO();
		f1.setFruitName("포도");
		FruitVO f2 = new FruitVO();
		f2.setFruitName("수박");
		FruitVO f3 = new FruitVO();
		f3.setFruitName("참외");
		
		list.add(f1);
		list.add(f2);
		list.add(f3);
		
		for(FruitVO vo : list) {
			System.out.println(vo.getFruitName());
		}
		
		FruitService service = new FruitService();
		f1 = service.getFruit(list, "수박");
		System.out.println(f1.getFruitName());
		
	}
}
