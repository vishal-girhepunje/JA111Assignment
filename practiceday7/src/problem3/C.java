package problem3;

public class C extends B {
	int i = 1000;
	int j = 2000;

	void showC() {
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("super.i = " + super.i);
		System.out.println("super.j = " + super.j);
		// System.out.println("super.super.i = " + super.super.i);
	}
}
