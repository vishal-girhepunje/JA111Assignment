package Problem1;

public class RectanlgeDemo {
 public static void main(String[] args) {
	 Rectanlge rectOne= new Rectanlge();
     rectOne.length = 10.0;
     rectOne.breadth = 4.5;

     Rectanlge rectTwo = new Rectanlge();
     rectTwo.length = 5.5;
     rectTwo.breadth = 6.5;
     System.out.println("Area of first rectangle is " + (rectOne.length * rectOne.breadth));
     System.out.println("Area of second rectangle is " + (rectTwo.length * rectTwo.breadth));
     
     
     Rectanlge rectThree = new Rectanlge();
     rectThree.length = 10.0;
     rectThree.breadth = 4.5;

     Rectanlge rectFour = rectThree;
     rectFour.length = 5.5;
     rectFour.breadth = 6.5;
     System.out.println("Area for rectThree is " + (rectThree.length * rectThree.breadth));
     System.out.println("Area for rectFour is " + (rectFour.length * rectFour.breadth));

     rectThree = null;
     System.out.println("Bye Bye");

 }
}
