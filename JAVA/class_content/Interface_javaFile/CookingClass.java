package 추상화;

// interface 상속받을 때 implements사용
public class CookingClass implements ServiceImple, UserImple{
//public class CookingClass extends Object implements ServiceImple, UserImple도 가능 차이점은 override	
	@Override
	public void 라면끓이는방법() { // ServiceImple override
		
	}
	@Override
	public void 찌개끓이는방법() { // ServiceImple override
		
	}
	
	@Override
	public void 요리를맛보다() { // UserImple override

	}
	
	@Override
	public void 요리를평가하다() { // UserImple override
		
	}
	
}
