package Problem1;

public class Rectangle1 {
	double length;
	double breadth;

	public Rectangle1() {
		System.out.println("Inside constructor");
		length = 10.0;
		breadth = 15.0;
	}



	public double getArea() {
		double area = length * breadth;
		return area;
	}

}
