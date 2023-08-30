package YouActivity1;

public class FDMain {
	public static void main(String[] args) {
        LoanAgainstFixedDepositAccount accountOne = new LoanAgainstFixedDepositAccount(100000, 6.75, 85000, 7.75);
        double maturityAmount = accountOne.calculateMaturityValue();
        double loanPaymentAmount = accountOne.calculateTotalPayment();
        System.out.println("Maturity amount of FD is " + maturityAmount);
        System.out.println("Total loan payment amount is " + loanPaymentAmount);
        if (loanPaymentAmount > maturityAmount) {
            System.out.println("Your loss is " + (loanPaymentAmount - maturityAmount) + "/-");
        } else {
            System.out.println("Your gain is " + (maturityAmount - loanPaymentAmount) + "/-");
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        LoanAgainstFixedDepositAccount accountTwo = new LoanAgainstFixedDepositAccount(90000, 6.75, 88000, 9.75);
        maturityAmount = accountTwo.calculateMaturityValue();
        loanPaymentAmount = accountTwo.calculateTotalPayment();
        System.out.println("Maturity amount of FD is " + maturityAmount);
        System.out.println("Total loan payment amount is " + loanPaymentAmount);
        if (loanPaymentAmount > maturityAmount) {
            System.out.println("Your loss is " + (loanPaymentAmount - maturityAmount) + "/-");
        } else {
            System.out.println("Your gain is " + (maturityAmount - loanPaymentAmount) + "/-");
        }
    }
}