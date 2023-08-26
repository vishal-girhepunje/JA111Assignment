package problem2;

public class Rectangle {
	double length;
	double breadth;

	Rectangle(double l, double b) {
		length = l;
		breadth = b;
	}

	double getArea() {
		double area = length * breadth;
		return area;
	}
}
