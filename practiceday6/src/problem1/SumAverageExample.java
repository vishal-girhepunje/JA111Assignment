package problem1;

import java.util.Scanner;

public class SumAverageExample {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a, b, c, d, e;

	    System.out.print("Enter marks of five scholars ");
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    d = sc.nextInt();
	    e = sc.nextInt();

	    int sum = a + b + c + d + e;
	    float average = (float)sum/5;

	    System.out.println("Sum = " + sum);
	    System.out.println("Average= " + average);

	    sc.close();
	  }
}
