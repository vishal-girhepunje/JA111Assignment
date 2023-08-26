package Assignment2;

public class WatchPriceTester {
	public static void main(String args[]) {
        WatchPriceCalculator wcOne = new WatchPriceCalculator();

        // for watch type = Titan, gender = "female", age = 25
        System.out.println("The total bill amount is " + wcOne.getWatchPrice("Titan", 25, "female"));

        // for watch type = Rolex, gender = "male", age = 65
        System.out.println("The total bill amount is " + wcOne.getWatchPrice("Rolex", 65, "male"));

        // for watch type = Rolex, gender = "female", age = 61
        System.out.println("The total bill amount is " + wcOne.getWatchPrice("Rolex", 61, "female"));

        // for watch type = Titan, gender = "male", age = 25
        System.out.println("The total bill amount is " + wcOne.getWatchPrice("Titan", 25, "male"));
    }
}
