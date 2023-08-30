package problem4;

public class MobilePriceDemo {
	public static void main(String[] args) {
	    MobilePrice mp = new MobilePrice(10000, 7.5, 7.5, 9.5);
	    System.out.println("Price of mobile is " + mp.getSellingPrice());
	    LuxaryMobilePrice lmp = new LuxaryMobilePrice(45000, 2.5, 3.5, 4.5, 0.5);
	    System.out.println("Price of luxary mobile is " + lmp.getSellingPrice());
	  }
}
