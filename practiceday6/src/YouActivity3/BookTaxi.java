package YouActivity3;

public class BookTaxi {
	private static double totalRevenue = 0.0;

    public static TaxiCar[] getTaxiArray() {
        TaxiCar[] taxiCars = new TaxiCar[2];
        taxiCars[0] = new TaxiCar(4, 1250.00, "ETIOS");
        taxiCars[1] = new TaxiCar(4, 1150.00, "EON");
        return taxiCars;
    }

    public static Taxipassenger[] getTaxipassengerArray(String[] names, int[] walletBalance) {
        Taxipassenger[] passengers = new Taxipassenger[10];
        for (int i = 0; i < 10; i++) {
            passengers[i] = new Taxipassenger(names[i], walletBalance[i]);
        }
        return passengers;
    }

    public static int bookTaxi(TaxiCar taxiCar, Taxipassenger taxiPassenger) {
        if (taxiCar.getCurrentOccupancy() < taxiCar.getPassengerCapacity()) {
            if (taxiPassenger.getWalletBalance() >= taxiCar.getFarePerPassenger()) {
                taxiCar.setCurrentOccupancy(taxiCar.getCurrentOccupancy() + 1);
                double fare = taxiCar.getFarePerPassenger();
                taxiPassenger.setWalletBalance(taxiPassenger.getWalletBalance() - fare);
                taxiPassenger.setTaxiCar(taxiCar);
                totalRevenue += fare;
                return 0; // Taxi is allotted
            } else {
                return 2; // Insufficient balance
            }
        } else {
            return 1; // Taxi fully occupied
        }
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }
}
