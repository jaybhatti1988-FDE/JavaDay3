package com.overriding.operator.bankintrstcalculation.example.day3;

public class CurrentBankingAccount extends BankAccount {
	private double overDraftLimit,transactionCharges;
	
	public CurrentBankingAccount(String bankAccountNumber, String accountHolderName, double principal,
			double rateOfInterest, double overDraftLimit) {
		super(bankAccountNumber, accountHolderName, principal, 0.0, 0, "Current Account");
		this.overDraftLimit=overDraftLimit;
		this.transactionCharges=transactionCharges;
	}
	
	@Override
	public double CalculateInterest() {
		return 0.0;
	} 
	
	public double getAvailableBalance() {
		return principal+overDraftLimit;
	}
	
	@Override
	public void DisplayAccountHolderDetails() {
		System.out.println("--------------------------------------------------");
		System.out.println("		 	BANK ACCOUNT STATEMENT 				  ");	
		System.out.println("--------------------------------------------------");	
		System.out.println("Account Number      : " + bankAccountNumber);
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Type        : " + accountType);
		System.out.printf("Account Balance      : ₹%.2f%n" , principal);
		System.out.printf("Overdraft Limit      : ₹%.2f%n" , overDraftLimit);
		System.out.printf("Available Balance    : ₹%.2f%n" , getAvailableBalance());
		System.out.printf("Transaction Charges  : ₹%.2f%n" , transactionCharges );
		System.out.printf("Interest Earned 	    : ₹%.2f%n", CalculateInterest());
		System.out.println("Interest Type 	    : No Interest on Current Account ");
		System.out.println("----------------------------------------------------");
	} 
}
