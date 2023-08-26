package Problem3;

public class Rectangle3 {
	double length;
	double breadth;

	void setDimension(double l, double b) {
		length = l;
		breadth = b;
	}

	double getArea() {
		double area = length * breadth;
		return area;
	}
}
