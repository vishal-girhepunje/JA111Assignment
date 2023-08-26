package YouActivity1;

public class MyClass {
	static int objectCount = 0; // Static variable to count objects

	MyClass() {
		objectCount++; // Increment the object count each time an object is created
	}

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); // Object created in main method
		obj1.someMethod(); // Object created in another method of the same class
		AnotherClass.anotherMethod(); // Object created in a method of another class

		System.out.println("Total objects created: " + objectCount);
	}

	void someMethod() {
		MyClass obj2 = new MyClass(); // Object created in another method of the same class
	}
}
