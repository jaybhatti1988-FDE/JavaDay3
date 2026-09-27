package com.overriding.operator.bankintrstcalculation.example.day3;

public class SavingBankingAccount extends BankAccount {
	
	private double minimumBalance;
	
	public SavingBankingAccount(String bankAccountNumber, String accountHolderName, 
			double principal,double rateOfInterest, int yrs,double minimumBalance) {
		super(bankAccountNumber, accountHolderName, principal, rateOfInterest, yrs, "Saving Accounts");
		this.minimumBalance=minimumBalance;
	}
	
	@Override
	public double CalculateInterest() {
		int n=4;
		double amount=principal*Math.pow((1+rateOfInterest/(n*100)),n*timeOfPeriods);
		return amount-principal;
	} 
	
	@Override
	public void DisplayAccountHolderDetails() {	
		super.DisplayAccountHolderDetails();
		System.out.printf("Minimum Balance  : ₹%.2f%n", minimumBalance);
		System.out.println("Interest Type   : Compound Interest (Quartely) ");
		System.out.println("---------------------------------------------------");
	}
}