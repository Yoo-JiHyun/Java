package Day13_14.Ex06_수강과정등록;

public class Person {

	private String name;
	
	// 생성자
	public Person(String name) {
		this.name = name;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [" + this.name + "]";
	}
	
	
	
	

}
