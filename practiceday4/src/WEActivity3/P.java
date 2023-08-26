package WEActivity3;

public class P {
	int i;
	  static int j;
	  
	  void show(){
	    System.out.println(i + " " + j);
	  }

	  static{
	    System.out.println("Inside static block");
	    j = 20;
	  }

	  P(){
	    System.out.println("Inside constructor");
	    i = 10;
	  }

	  public static void main(String args[]){
	    System.out.println("Inside main");
	    P p1 = new P();
	    p1.show();
	    j = 200;
	    p1.show();

	    P p2 = new P();
	    p2.show();
	    P.j = 20;
	    p1.show();
	  }
}
