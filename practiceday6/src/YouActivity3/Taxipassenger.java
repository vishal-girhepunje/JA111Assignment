package YouActivity3;

public class Taxipassenger {
	private String name;
    private TaxiCar taxiCar;
    private double walletBalance;

    public Taxipassenger(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
        this.taxiCar = null;
    }

    public String getName() {
        return name;
    }

    public TaxiCar getTaxiCar() {
        return taxiCar;
    }

    public void setTaxiCar(TaxiCar taxiCar) {
        this.taxiCar = taxiCar;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}
