### Question-2

Create a class named Point that has
2 instance variables that are x and y of integer type to represent a coordinate

1 parameterized constructor that accept two parameters and initializes value of both instance variable

4 methods that are getter and setter method for both instance variables
Create another class named Shape that has following methods-
1. static double getLineLength(Point p1, Point p2) that returns distance between both points specified by
parameters
2. static double getTriangleArea(Point p1, Point p2, Point p3) that returns area of triangle formed using
three points specified by parameters
3. static double getQuadrilateralArea(Point p1, Point p2, Point p3, Point p4) that returns area of
quadrilateral formed using four points specified by parameters
4. static boolean isCollinear(Point p1, Point p2, Point p3) that returns true if all three points are collinear, false otherwise

class Tester contains the main method, do not touch this code

```java
package com.masai.assignment;
public class Tester {
  public static void main(String args[]){
    Point p1 = new Point(10, 8);
    Point p2 = new Point(15, 18);
    System.out.println("The length of line for point (10, 8) & (15, 18) is " +
    Shape.getLineLength(p1, p2));
    Point p3 = new Point(8, 8);
    Point p4 = new Point(20, 8);
    Point p5 = new Point(14, 14);
    System.out.println("The area of triangle for point (8, 8), (20, 8) & (14,14) is " + Shape.getTriangleArea(p3, p4, p5));
    Point p6 = new Point(20, 20);
    System.out.println("The area of quadrilateral for point (8, 8), (20, 8), (14, 14) & (20, 20) is " + Shape.getQuadrilateralArea(p3, p4, p5, p6));
    Point p7 = new Point(32, 8);
    System.out.println("Are points (8, 8), (20, 8) & (32, 8) collinear? " + Shape.isCollinear(p3, p4, p7));
  }
}

**Output**
The length of line for point (10, 8) & (15, 18) is 11.18
The area of triangle for point (8, 8), (20, 8) & (14, 14) is 36.0
The area of quadrilateral for point (8, 8), (20, 8), (14, 14) & (20, 20) is
108.0
Are points (8, 8), (20, 8) & (32, 8) collinear? true
```
