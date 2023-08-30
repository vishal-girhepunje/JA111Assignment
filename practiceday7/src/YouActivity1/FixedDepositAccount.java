package YouActivity1;

public class FixedDepositAccount {
	private double depositAmount;
    private double fdInterestRate;

    public FixedDepositAccount(double depositAmount, double fdInterestRate) {
        this.depositAmount = depositAmount;
        this.fdInterestRate = fdInterestRate;
    }

    protected double getDepositAmount() {
        return depositAmount;
    }

    protected double getFdInterestRate() {
        return fdInterestRate;
    }

    public double calculateMaturityValue() {
        double maturityValue = depositAmount * (1 + fdInterestRate / 100);
        return Math.round(maturityValue * 100) / 100.0; // Rounding to 2 decimal places
    }
}
