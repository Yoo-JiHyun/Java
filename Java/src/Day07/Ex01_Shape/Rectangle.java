package Day07.Ex01_Shape;

public class Rectangle extends Shape {

	double width, heigth;
	
	
	public Rectangle() {
		this(0.0, 0.0);
	}

	
	public Rectangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}


	@Override
	double area() {
		// 사각형의 넓이 = ( 가로 )x( 세로 )
		return width * heigth;
	}

	@Override
	double round() {
		// 정사각형
		// 사각형의 둘레 = 2 * (a+b)
		return 2 * (width + heigth);
		
		
	}

	//getter, setter
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeigth() {
		return heigth;
	}


	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	// toString
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", heigth=" + heigth + "]";
	}
	

}
