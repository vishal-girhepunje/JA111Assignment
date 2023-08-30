package problem2;

import java.util.Scanner;

public class RectanlgeArrayDemo {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Rectangle rectArr[]= new Rectangle[3];

	    for(int i = 0; i < rectArr.length; i++) {
	      System.out.print("Enter length and breadth ");
	      double l = sc.nextDouble();
	      double b = sc.nextDouble();
	      rectArr[i] = new Rectangle(l, b);
	    }

	    for(Rectangle rectTemp: rectArr) {
	      System.out.println("The area of rectangle is " + rectTemp.getArea());
	    }
	    sc.close();
	  }
}
