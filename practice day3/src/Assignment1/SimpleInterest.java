package Assignment1;

public class SimpleInterest {
	 private double principalAmount;
	    private double timePeriod;
	    private double interestRate;

	    void setValues(double pa, double tp, double ir) {
	        principalAmount = pa;
	        timePeriod = tp;
	        interestRate = ir;
	    }

	    double getInterestAmount() {
	        double interestAmount = (principalAmount * timePeriod * interestRate) / 100;
	        return Math.round(interestAmount * 100) / 100.0;
	    }
}
