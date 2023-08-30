package YouActivity1;

public class LoanAgainstFixedDepositAccount extends FixedDepositAccount {
	 private double loanAmount;
	    private double loanInterestRate;
	public LoanAgainstFixedDepositAccount(double depositAmount, double fdInterestRate) {
		super(depositAmount, fdInterestRate);
		// TODO Auto-generated constructor stub
		this.loanAmount = loanAmount;
        this.loanInterestRate = loanInterestRate;
	}
	
	public LoanAgainstFixedDepositAccount(double depositAmount, double fdInterestRate, double loanAmount, double loanInterestRate) {
	    super(depositAmount, fdInterestRate);
	    this.loanAmount = loanAmount;
	    this.loanInterestRate = loanInterestRate;
	}

	public double calculateTotalPayment() {
        double totalPayment = loanAmount + (loanAmount * loanInterestRate) / 100;
        return Math.round(totalPayment * 100) / 100.0; // Rounding to 2 decimal places
    }

}
