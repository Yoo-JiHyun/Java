package Day07.Ex01_Shape;

public class Triangle extends Shape {
	
	double width, heigth;
	
	// 생성자
	public Triangle() {
		this(0.0, 0.0);
	}
	
	
	public Triangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}


	@Override
	double area() {
		// 삼각형의 넓이 = ( 가로 )x( 세로 )/2
		return width * heigth / 2;
	}

	@Override
	double round() {
		// * 정삼각형
		// 삼각형의 둘레 = 3 * width
		return 3 * width;
	}

	// getter, setter
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
		return "Triangle [width=" + width + ", heigth=" + heigth + "]";
	}
	
	

}
