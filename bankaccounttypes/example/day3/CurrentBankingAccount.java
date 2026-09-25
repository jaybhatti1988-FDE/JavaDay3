package com.overriding.operator.bankaccounttypes.example.day3;

public class CurrentBankingAccount extends BankAccount {
	
	private double overDraftLimit;

	CurrentBankingAccount(String bankAccount, String accountHolderName,double balance,double overDraftLimit) {
		super(bankAccount, accountHolderName, balance);
		this.overDraftLimit=overDraftLimit;
	}
	
	@Override
	double CalculateInterest() {
		return 0.0;
	} 
	
	@Override
	void withdraw(double amount) {
		if (amount<=balance+overDraftLimit) {
			balance=balance-amount;
			System.out.printf("Withdraw Amount Successfully and Amount is ₹%.2f%n " , amount);
		} else {
			System.out.printf("Unable Withdrawl Amount Unsufficient Balance and Overdraft Limit" );
		}
	}
	
	public void DisplayAccountHolderDetails() {
		super.DisplayAccountHolderDetails();
		System.out.println("------------- My Current Account Details -------------");
		System.out.println("Enter Account Number " + this.bankAccount);
		System.out.println("Enter Account Holder Name " + this.accountHolderName);
		System.out.printf("Account holder initial Balance ₹%.2f%n", this.balance);
		System.out.println("Account User Demanded Draft Value  " +this.overDraftLimit);
	} 
}
