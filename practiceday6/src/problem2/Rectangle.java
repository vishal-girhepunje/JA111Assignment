package problem2;

public class Rectangle {
	double length;
	  double breadth;

	  Rectangle(double length, double breadth){
	    System.out.println("inside constructor");
	    this.length = length;
	    this.breadth = breadth;
	  }

	  double getArea(){
	    return (length * breadth);
	  }
}
