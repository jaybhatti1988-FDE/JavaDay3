package com.overriding.operator.bankintrstcalculation.example.day3;

class BankAccount {
	
	protected String bankAccountNumber,accountHolderName,accountType;
	protected double principal,rateOfInterest;
	protected int timeOfPeriods;
	
	public BankAccount(String bankAccountNumber,String accountHolderName,
			double principal,double rateOfInterest,
			int yrs,String accountType) {
		this.bankAccountNumber=bankAccountNumber;
		this.accountHolderName=accountHolderName;
		this.principal=principal;
		this.rateOfInterest=rateOfInterest;
		this.timeOfPeriods=yrs;
		this.accountType=accountType;
	}
		
	public double CalculateInterest() {
		return (principal*rateOfInterest*timeOfPeriods)/100;
	}
	

	
	public void DisplayAccountHolderDetails() {
		double interest = CalculateInterest();
		System.out.println("--------------------------------------------------");
		System.out.println("		 	BANK ACCOUNT STATEMENT 				  ");	
		System.out.println("--------------------------------------------------");
		System.out.println("Account Number      : " + bankAccountNumber);
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Type        : " + accountType);
		System.out.printf("Principal Amount    : ₹%.2f%n" , principal);
		System.out.printf("Rate of Interest    : %.2f%%%n" , rateOfInterest);
		System.out.println("Time of Periods     : " + timeOfPeriods + "Year(s)");
		System.out.printf("Interest Earned 	    : ₹%.2f%n", interest);
		System.out.printf("Total Amount 	    : ₹%.2f%n", principal+interest);
		System.out.println("------------------------------------------------------------");
	}
}

	

