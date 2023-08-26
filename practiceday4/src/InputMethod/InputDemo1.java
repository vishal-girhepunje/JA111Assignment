package InputMethod;

import java.util.Scanner;

public class InputDemo1 {
	 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Inside age ");
	int age = sc.nextInt();
	System.out.print("Inside name ");
	String name = sc.nextLine();
	System.out.print("Inside state ");
	String state = sc.nextLine();
	System.out.println("Age = " + age + " Name = " + name + " State = " + state);
	sc.close();
	 }
}
