package Assignment3;

public class JoyInfocomTester {
	 public static void main(String args[]) {
	        JoyInfocom joy = new JoyInfocom();
	        System.out.println("Your bill amount is: " + joy.getBillAmount(true, true, false));
	        System.out.println("Your bill amount is: " + joy.getBillAmount(true, false, false));
	        System.out.println("Your bill amount is: " + joy.getBillAmount(true, true, true));
	    }
}


/*Your bill amount is: 425.0
Your bill amount is: 300.0
Your bill amount is: 475.0*/