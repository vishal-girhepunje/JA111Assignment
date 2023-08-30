### Question-1

Create a class named FixedDepositAccount that contains

2 instance variables
depositeAmount of type double to contain the amount in fixed deposite account
fdInterestRate of type double to contain the annual interest rate on FD

Constructor to initialize both he instance variable

One method calculateMaturityValue() to calculate and return the maturity value of fd (up to 2 decimal places) according to following formula
depositeAmount * (1 + fdInterestRate/100);

Create a class LoanAgainstFixedDepositAccount (sub class of FixedDepositAccount) that contains

2 instance variables
loanAmount of double data type to have total loan amount
loanInterestRate of double data type to have interest rate applicable on loan

Constructor to initialize the instance variable of this class and of super class

One method calculateTotalPayment() to calculate and return the total payment of fd (up to 2 decimal places) according to following formula

amount = loanAmount + (loanAmount * loanInterestRate) / 100;

This is main method, Do not touch this code

package com.masai.assignment;
public class FDMain {
  public static void main(String[] args) {
    LoanAgainstFixedDepositAccount accountOne = new
    LoanAgainstFixedDepositAccount(100000, 6.75, 85000, 7.75);
    double maturityAmount = accountOne.calculateMaturityValue();
    double loanPaymentAmount = accountOne.calculateTotalPayment();
    System.out.println("Maturity amount of FD is " + maturityAmount);
    System.out.println("Total loan payment amount is " + loanPaymentAmount);
    if(loanPaymentAmount > maturityAmount) {
      System.out.println("Your loss is " + (loanPaymentAmount - maturityAmount) + "/-");
    }else {
      System.out.println("Your gain is " + (maturityAmount - loanPaymentAmount) + "/-");
    }
    
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    LoanAgainstFixedDepositAccount accountTwo = new
    LoanAgainstFixedDepositAccount(90000, 6.75, 88000, 9.75);
    maturityAmount = accountTwo.calculateMaturityValue();
    loanPaymentAmount = accountTwo.calculateTotalPayment();
    System.out.println("Maturity amount of FD is " + maturityAmount);
    System.out.println("Total loan payment amount is " + loanPaymentAmount);
    if(loanPaymentAmount > maturityAmount) {
      System.out.println("Your loss is " + (loanPaymentAmount - maturityAmount) + "/-");
    }else {
      System.out.println("Your gain is " + (maturityAmount - loanPaymentAmount) + "/-");
    }
  }
}

Output
Maturity amount of FD is 106750.0
Total loan payment amount is 91587.5
Your gain is 15162.5/-
-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Maturity amount of FD is 96075.0
Total loan payment amount is 96580.0
Your loss is 505.0/-