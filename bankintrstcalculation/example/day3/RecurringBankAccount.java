package com.overriding.operator.bankintrstcalculation.example.day3;

public class RecurringBankAccount  extends BankAccount{
	
	private double monthlyDepositAmount;

	public RecurringBankAccount(String bankAccountNumber, String accountHolderName, double principal,
			double rateOfInterest, int timeOfPeriods) {
		super(bankAccountNumber, accountHolderName, principal, rateOfInterest, timeOfPeriods, "Recurring Deposit Account");
		
		this.monthlyDepositAmount=principal;
	}
	@Override
	public double CalculateInterest() {
		int n=timeOfPeriods*12;
		double totalDeposit=monthlyDepositAmount*n;
		double i=rateOfInterest / (4 * 100);
		double maturityAmount=monthlyDepositAmount * (Math.pow(1+rateOfInterest/(4*100),4*timeOfPeriods)-1)
				/(1-Math.pow(1+i,-1.0/3));
		return maturityAmount-totalDeposit;
	}
	@Override
	public void DisplayAccountHolderDetails() {
		double n=timeOfPeriods*12;
		double totalDeposit=monthlyDepositAmount*n;
		 System.out.println("\n========================================");
	        System.out.println("        BANK ACCOUNT STATEMENT          ");
	        System.out.println("========================================");
	        System.out.println("Account Number     : " + bankAccountNumber);
	        System.out.println("Account Holder     : " + accountHolderName);
	        System.out.println("Account Type       : " + accountType);
	        System.out.printf ("Monthly Deposit    : ₹%.2f%n", monthlyDepositAmount);
	        System.out.printf ("Total Deposited    : ₹%.2f%n", totalDeposit);
	        System.out.printf ("Rate of Interest   : %.2f%%%n", rateOfInterest);
	        System.out.println("Time Period        : " + timeOfPeriods + " Year(s)");
	        System.out.printf ("Interest Earned    : ₹%.2f%n", CalculateInterest());
	        System.out.printf ("Maturity Amount    : ₹%.2f%n", totalDeposit + CalculateInterest());
	        System.out.println("Interest Type      : RD Compound (Quarterly)");
	        System.out.println("========================================");
	}
}
