package Problem2;

public class Rectanlge  {
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
    
    public static void main(String[] args) {
   	 Rectanlge rectOne = new Rectanlge();
        rectOne.setDimension(10.5, 9.5);
        double area = rectOne.getArea();
        System.out.println("Area of rectOne is " + area);
        Rectanlge rectTwo = new Rectanlge();
        rectTwo.setDimension(4.5, 5.5);
        System.out.println("Area of rectOne is " + rectTwo.getArea());
    }
}
