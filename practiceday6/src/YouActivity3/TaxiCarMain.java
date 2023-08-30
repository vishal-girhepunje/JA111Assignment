package YouActivity3;

public class TaxiCarMain {
	public static void main(String[] args) {
	    TaxiCar[] taxiCar = BookTaxi.getTaxiArray();
	    
	    String names[] = {"Ram", "Shyam", "Mohan", "Geeta", "Sam", "Soniya", "Raj", "Faizal", "Safal", "Ved"};
	    int arr[] = {2000, 3000, 1500, 1200, 1400, 2100, 800, 2100, 4000, 2330};
	    
	    Taxipassenger[] taxipassenger = BookTaxi.getTaxipassengerArray(names, arr);
	    
	    int i = 0;
	    for(Taxipassenger currentPassenger: taxipassenger) {
	      int result = BookTaxi.bookTaxi(taxiCar[i], currentPassenger);
	      i = (i == 0) ? 1 : 0;
	      System.out.print("Dear " + currentPassenger.getName() + "! ");
	      if(result == 0) {
	        System.out.print("Taxi Model: " + currentPassenger.getTaxiCar().getTaxiModel());
	      }else if(result == 1) {
	        System.out.print("Taxi fully occupied");
	      }else {
	        System.out.print("Insufficient balance");
	      }
	      System.out.println("\tWallet Balance: " + currentPassenger.getWalletBalance());
	    }
	    
	    System.out.println("\nThe total revenue collected is " + BookTaxi.getTotalRevenue());
	  }
}
