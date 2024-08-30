package Day07.Ex01_Shape;

public class Circle extends Shape {
	
	double raidus;
	

	public Circle() {
		this(0);
	}
	

	public Circle(double raidus) {
		this.raidus = raidus;
	}


	@Override
	double area() {
		// 원의 넓이 : (원주율) x (반지름) x (반지름)
		return Math.PI * Math.pow(raidus, 2);
	}

	@Override
	double round() {
		// 원의 둘레 : 2 x (원주율) x (반지름)
		return 2 * Math.PI * raidus;
	}


	public double getRaidus() {
		return raidus;
	}


	public void setRaidus(double raidus) {
		this.raidus = raidus;
	}


	@Override
	public String toString() {
		return "Circle [raidus=" + raidus + "]";
	}
	
	

}
