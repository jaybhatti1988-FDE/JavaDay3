package com.overriding.operator.bankintrstcalculation.example.day3;

public class LoanBankingAccount extends BankAccount {

	private double processingFees;
	private int emiMonths;
	
	public LoanBankingAccount(String bankAccountNumber, String accountHolderName, double principal,
			double rateOfInterest, int timeOfPeriods, double processingFees,int emiMonths) {
		super(bankAccountNumber, accountHolderName, principal, rateOfInterest, timeOfPeriods, "Loan Account");
				this.processingFees=processingFees;
				this.emiMonths=emiMonths;
	}

	@Override
	public double CalculateInterest() {
		
		return (calculateEMI() * emiMonths) - principal;
	}
	
	public double calculateEMI() {
		double monthlyRate = rateOfInterest / (12.0 * 100.0); 
        double power       = Math.pow(1 + monthlyRate, emiMonths);
        return (principal * monthlyRate * power) / (power - 1);
	}
	
	@Override
	public void DisplayAccountHolderDetails() {	
		super.DisplayAccountHolderDetails();
		System.out.printf ("Processing Fee     : ₹%.2f%n", processingFees);
        System.out.printf ("Monthly EMI        : ₹%.2f%n", calculateEMI());
        System.out.println("EMI Months         : " + emiMonths + " Months");
        System.out.println("Interest Type      : Reducing Balance Method");
        System.out.println("========================================");
	}
}
