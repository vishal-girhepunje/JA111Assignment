package problem1;

public class InheritanceDemo {
	  public static void main(String[] args) {
		    A aOne = new A();
		    aOne.setA(100,200);
		    aOne.showA();
		    System.out.println();
		    B bOne = new B();
		    bOne.setA(50, 95 );
		    bOne.showA();
		    bOne.setB(140);
		    bOne.showB();
		    System.out.println();
		    bOne.average();
		    //aOne.average();
		  }
}
