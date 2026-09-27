package com.overriding.operator.bankintrstcalculation.example.day3;

public class FixedDepositBankingAccount extends BankAccount{
	
	private double penaltyOnEarlyWithdrawl;
	
	public FixedDepositBankingAccount(String bankAccountNumber, String accountHolderName, double principal,
			double rateOfInterest, int timeOfPeriods,double penaltyOnEarlyWithdrawl) {
		super(bankAccountNumber, accountHolderName, principal, rateOfInterest, timeOfPeriods, "Fixed Deposit Account");
		
		this.penaltyOnEarlyWithdrawl=penaltyOnEarlyWithdrawl;
	}

	@Override
	public double CalculateInterest() {
		double amount=principal*Math.pow((1+rateOfInterest/100),timeOfPeriods);
		return amount-principal;
	}
	
	@Override
	public void DisplayAccountHolderDetails() {	
		super.DisplayAccountHolderDetails();
		System.out.printf("Early Withdrawl  : ₹%.2f%n" , penaltyOnEarlyWithdrawl);
		System.out.println("Interest Type   : Compound Interest (Annualy) ");
		System.out.println("---------------------------------------------------");
	}
}
