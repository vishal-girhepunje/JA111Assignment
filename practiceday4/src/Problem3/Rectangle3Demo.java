package Problem3;

public class Rectangle3Demo {
	public static void main(String[] args) {
		Rectangle3 rectOne = new Rectangle3();
		Rectangle3 rectTwo = new Rectangle3();
		rectOne.setDimension(10.5, 9.5);
		rectTwo.setDimension(4.5, 5.5);
		System.out.println("Area of rectOne is " + rectOne.getArea());
		System.out.println("Area of rectOne is " + rectTwo.getArea());
	}
}
