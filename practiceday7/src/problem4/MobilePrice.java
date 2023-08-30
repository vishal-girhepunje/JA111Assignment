package problem4;

public class MobilePrice {
	private double purchaseCost;
	private double cgstPercentage;
	private double sgstPercentage;
	private double profitPercentage;

	public MobilePrice(double purchaseCost, double cgstPercentage, double sgstPercentage, double profitPercentage) {
		this.purchaseCost = purchaseCost;
		this.cgstPercentage = cgstPercentage;
		this.sgstPercentage = sgstPercentage;
		this.profitPercentage = profitPercentage;
	}

	public double getPurchaseCost() {
		return purchaseCost;
	}

	public double getSellingPrice() {
		double sellingPrice = purchaseCost
				+ purchaseCost * (cgstPercentage + sgstPercentage + profitPercentage) / 100.0;
		return sellingPrice;
	}
}
