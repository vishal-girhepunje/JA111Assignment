package Problem4;

public class Triangle {
	double calculateArea(double base, double height) {
        double area = 0.5 * base * height;
        return area;
    }

    double calculateArea(double a, double b, double c) {
        double s = (a + b + c)/2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    public static void main(String args[]) {
        Triangle t = new Triangle();
        System.out.println("Area of traingle for base 12 cm and perpendicular 5 cm is " + t.calculateArea(5, 12));
        System.out.println("Area of traingle for sides 7, 49 and 50 cm is " + t.calculateArea(7, 49, 50));
    }
}


/*Output
Area of traingle for base 12 cm and perpendicular 5 cm is 30.0
Area of traingle for sides 7, 49 and 50 cm is 171.0438540258024*/