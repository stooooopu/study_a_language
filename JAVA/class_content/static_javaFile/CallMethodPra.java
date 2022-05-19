package test;
class egg{
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

public class callMethod {
	
	public static egg call() {
		egg e = new egg();
		e.setName("구운 계란");
		return e;
	}
	
	public static void main(String[] args) {
		egg e = call();
		System.out.println(e.getName());
		
		e.setName("부활절 계란");
		System.out.println(e.getName());
		
	}	

}
