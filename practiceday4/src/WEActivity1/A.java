package WEActivity1;

public class A {
	int i; // instance variable
	float f; // instance variable
	static double d; // class variable

	public static void main(String[] args){
	    System.out.println(A.d); //0.0
	    A aOne = new A();
	    aOne.i = 10;
	    aOne.f = 10.5f;
	    aOne.d = 1000;
	    System.out.println(aOne.i + " " + aOne.f + " " + aOne.d); //10 10.5 1000.0
	    System.out.println(A.d); //1000.0

	    A aTwo = new A();
	    aTwo.i = 15;
	    aTwo.f = 15.5f;
	    aTwo.d = 2000;
	    System.out.println(aOne.i + " " + aOne.f + " " + aOne.d); //10 10.5 2000.0
	    System.out.println(aTwo.i + " " + aTwo.f + " " + aTwo.d); //15 15.5 2000.0
	    System.out.println(A.d); //2000.0

	    A.d = 3000;
	    System.out.println(aOne.d + " " + aTwo.d + " " + d); //3000.0 3000.0 3000.0
	    //static double k = 10; Error, local variable cannot be static
	  }
}
