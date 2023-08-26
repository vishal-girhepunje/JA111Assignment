package Problem3;

public class Student2 {
	int rollNo; // instance variables
	float marks;

	
	/*
	 * void set(int rollNo, float marks) { // local variables
		rollNo = rollNo; // local variable assigns value to itself
		marks = marks; // local variable assigns value to itself
	}
	*/
	
	void set(int rollNo, float marks) { //local variables
		  this.rollNo = rollNo;
		  this.marks= marks;
		}

	void show() {
		System.out.println(rollNo + " " + marks);
	}

	public static void main(String... args) {
		Student2 sOne = new Student2();
		Student2 sTwo = new Student2();
		sOne.set(10, 45.25f);
		sTwo.set(15, 65.25f);
		sOne.show();
		sTwo.show();
	}
}
