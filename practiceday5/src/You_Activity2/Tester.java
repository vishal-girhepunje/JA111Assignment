package You_Activity2;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.print("Please enter username & password ");
			String username = sc.nextLine(); // Must not have space
			String password = sc.nextLine(); // May have space
			System.out.println(PasswordChecker.isValidPassword(username, password));
		}
		sc.close();
	}
}
