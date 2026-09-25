package com.overriding.operator.bankaccounttypes.example.day3;

public class SavingBankingAccount extends BankAccount {
	
	private double minimumBalance,interestRate;

	SavingBankingAccount(String bankAccount, String accountHolderName,double balance,double interestRate,double minimumBalance) {
		super(bankAccount, accountHolderName, balance);
		this.minimumBalance=minimumBalance;
		this.interestRate=interestRate;
	}
	
	@Override
	double CalculateInterest() {
		return balance*(interestRate/100);
	} 
	
	@Override
	void withdraw(double amount) {
		if (balance-amount<=minimumBalance) {
			System.out.printf("Unable Withdrawl Amount Unsufficient Balance and Minimum Balance is ₹%.2f%n " , minimumBalance);
		} else {
			balance=balance-amount;
			System.out.printf("Withdraw Amount Successfully and Amount is ₹%.2f%n " , amount);
		}
	}

	public void DisplayAccountHolderDetails() {
		super.DisplayAccountHolderDetails();
		System.out.println("------------- My Saving Account Details -------------");
		System.out.println("Enter Account Number " + this.bankAccount);
		System.out.println("Enter Account Holder Name " + this.accountHolderName);
		System.out.printf("Account holder initial Balance ₹%.2f%n" , this.balance);
		System.out.println("Account User Interest Earned " +this.CalculateInterest() +"%");
	} 

}
