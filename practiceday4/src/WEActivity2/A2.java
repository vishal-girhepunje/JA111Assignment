package WEActivity2;

public class A2 {
	int i; //instance variable
	  static int j; //class variable

	  void set(){//instance method
	    i = 10; //instance method can access instance members
	    j = 20; //static variable can be accesses in non static method
	  }

	  static void show(){//class method
	    //System.out.println("i = " + i); Error non-static is not accessessible in static method
	    System.out.println("j = " + j); //static variable can be accesses in static method
	  }

	  public static void main(String args[]){
	    A2 a = new A2();
	    a.set();
	    a.show(); //ok... static memebers can be accessed using class name and object-name
	    //i = 100; Error non-static is not accessessible in static method
	    j = 200;
	    show(); //static member can be accesses in static method
	    a.j = 2000;
	    A2.show(); //static member can be accesses in static method
	  }
}
