package Assignment2;

public class WatchPriceCalculator {
	double getWatchPrice(String watchType, int age, String gender) {
        double costPrice, profitPercentage, gst, discount;

        if (watchType.equals("Titan")) {
            costPrice = 7999;
            profitPercentage = 12.5;
            gst = 7.5;
        } else if (watchType.equals("Rolex")) {
            costPrice = 10999;
            profitPercentage = 13.5;
            gst = 12.5;
        } else {
            return 0; // Invalid watch type
        }

        double totalPrice = costPrice + (costPrice * (profitPercentage / 100)) + (costPrice * (gst / 100));

        if (gender.equalsIgnoreCase("female") && age >= 60) {
            discount = 0.03; // 3% discount for senior female citizens
        } else if (gender.equalsIgnoreCase("female")) {
            discount = 0.02; // 2% discount for female citizens
        } else if (age >= 60) {
            discount = 0.03; // 3% discount for senior citizens
        } else {
            discount = 0; // No discount for others
        }

        double discountedPrice = totalPrice - (totalPrice * discount);
        return Math.round(discountedPrice * 100) / 100.0;
    }
}
