package problem1;

public class B extends A {
	int c;

	void setB(int c) {
		this.c = c;
	}

	void showB() {
		System.out.println("c is " + c);
	}

	void average() {
		System.out.println("Average is " + (float) (a + b + c) / 3);
	}
}
