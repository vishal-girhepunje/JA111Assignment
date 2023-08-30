package YouActivity3;

public class TaxiCar {
	private int passengerCapacity;
    private int currentOccupancy;
    private double farePerPassenger;
    private String taxiModel;

    public TaxiCar(int passengerCapacity, double farePerPassenger, String taxiModel) {
        this.passengerCapacity = passengerCapacity;
        this.farePerPassenger = farePerPassenger;
        this.taxiModel = taxiModel;
        this.currentOccupancy = 0;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getFarePerPassenger() {
        return farePerPassenger;
    }

    public String getTaxiModel() {
        return taxiModel;
    }

    public int getCurrentOccupancy() {
        return currentOccupancy;
    }

    public void setCurrentOccupancy(int currentOccupancy) {
        this.currentOccupancy = currentOccupancy;
    }
}
