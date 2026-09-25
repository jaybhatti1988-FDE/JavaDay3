package com.overriding.operator.bankaccounttypes.example.day3;

class BankAccount {
	
	protected String bankAccount;
	protected String accountHolderName;
	protected double balance;
	
	public BankAccount(String bankAccount,String accountHolderName,double balance) {
		this.bankAccount=bankAccount;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		
	}
		
	double CalculateInterest() {
		return 0.0;
	}
	
	void withdraw(double amount) {
		if (amount<=balance) {
			balance=balance-amount;
			System.out.printf("Withdrawl Amount Successfull ₹%.2f%n " , amount);
		} else {
			System.out.printf("Unable Withdrawl Amount Unsufficient Balance is ₹%.2f%n " , amount);
		}
	}
	
	public void DisplayAccountHolderDetails() {
		System.out.println("------------- My Account Details -------------");
		System.out.println("Enter Account Number " + bankAccount);
		System.out.println("Enter Account Holder Name " + accountHolderName);
		System.out.printf("Account holder initial Balance  ₹%.2f%n", balance);
		System.out.println("Account User Interest Earned " + CalculateInterest() +"%");
	}
}

	

