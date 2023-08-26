package YouActivity2;

public class Tester {
	public static void main(String args[]) {
        Point p1 = new Point(10, 8);
        Point p2 = new Point(15, 18);
        System.out.println("The length of line for point (10, 8) & (15, 18) is " +
                Shape.getLineLength(p1, p2));

        Point p3 = new Point(8, 8);
        Point p4 = new Point(20, 8);
        Point p5 = new Point(14, 14);
        System.out.println("The area of triangle for point (8, 8), (20, 8) & (14,14) is " +
                Shape.getTriangleArea(p3, p4, p5));

        Point p6 = new Point(20, 20);
        System.out.println("The area of quadrilateral for point (8, 8), (20, 8), (14, 14) & (20, 20) is " +
                Shape.getQuadrilateralArea(p3, p4, p5, p6));

        Point p7 = new Point(32, 8);
        System.out.println("Are points (8, 8), (20, 8) & (32, 8) collinear? " +
                Shape.isCollinear(p3, p4, p7));
    }
}
