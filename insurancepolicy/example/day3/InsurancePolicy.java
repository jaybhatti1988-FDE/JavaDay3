package com.overriding.operator.insurancepolicy.example.day3;

class InsurancePolicy {
	
	protected String policyNumber;
	protected String policyHolderName;
	protected double policyCoverageAmount;
	protected double policyPremiumAmount;
	
	public InsurancePolicy(String policyNumber,String policyHolderName,double policyCoverageAmount,double policyPremiumAmount) {
		this.policyNumber=policyNumber;
		this.policyHolderName=policyHolderName;
		this.policyCoverageAmount=policyCoverageAmount;
		this.policyPremiumAmount=policyPremiumAmount;
	}
		
	public void DisplayPolicyAccountHolderDetails() {
		System.out.println("------------- Policy User Basic Details -------------");
		System.out.println("Enter Policy Number " + policyNumber);
		System.out.println("Enter Policy Holder Name " + policyHolderName);
		System.out.printf("Account holder initial Balance  ₹%.2f%n", policyCoverageAmount);
		System.out.printf("Account User Interest Earned ₹%.2f%n", policyPremiumAmount);
	}
}