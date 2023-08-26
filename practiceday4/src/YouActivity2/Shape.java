package YouActivity2;

public class Shape {
	public static double getLineLength(Point p1, Point p2) {
        int deltaX = p2.getX() - p1.getX();
        int deltaY = p2.getY() - p1.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static double getTriangleArea(Point p1, Point p2, Point p3) {
        double side1 = getLineLength(p1, p2);
        double side2 = getLineLength(p2, p3);
        double side3 = getLineLength(p3, p1);
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double getQuadrilateralArea(Point p1, Point p2, Point p3, Point p4) {
        double area1 = getTriangleArea(p1, p2, p3);
        double area2 = getTriangleArea(p1, p3, p4);
        return area1 + area2;
    }

    public static boolean isCollinear(Point p1, Point p2, Point p3) {
        return (p1.getX() * (p2.getY() - p3.getY()) +
                p2.getX() * (p3.getY() - p1.getY()) +
                p3.getX() * (p1.getY() - p2.getY())) == 0;
    }
}
