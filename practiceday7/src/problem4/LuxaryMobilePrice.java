package problem4;

public class LuxaryMobilePrice extends MobilePrice {
	private double cessPercentage;

	public LuxaryMobilePrice(double purchaseCost, double cgstPercentage, double sgstPercentage, double profitPercentage,
			double cessPercentage) {
		super(purchaseCost, cgstPercentage, sgstPercentage, profitPercentage);
		this.cessPercentage = cessPercentage;
	}

	@Override
	public double getSellingPrice() {
		double sellingPrice = super.getSellingPrice() + (getPurchaseCost() * cessPercentage / 100.0);
		return sellingPrice;
	}
}
