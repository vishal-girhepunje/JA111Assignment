package Problem3;

public class Student3 {
	  String name;
	  float marks;
	  int rollNo;

	  Student3(){
	    name = "kapil";
	  }
	  
	  Student3(float m, int r){
	    this(); //will call default constructor of Student class
	    marks = m;
	    rollNo = r;
	  }

	  void display(){
	    System.out.println("Name = " + name + " marks = " + marks + " rollno = " + rollNo);
	  }

	  public static void main(String args[]){
	    Student3 sTwo = new Student3(55.05f, 12);
	    sTwo.display();
	  }
}
