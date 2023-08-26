package InputMethod;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter your first name: ");
	    String name = sc.next();
	    System.out.print("Enter age: ");
	    int age = sc.nextInt();
	    System.out.print("You are indian citizen (true/false): ");
	    boolean isIndian = sc.nextBoolean();
	    System.out.println("Your details are as follow-");
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Indian? " + isIndian);
	    
	    
	    sc.close();
	  }
}
