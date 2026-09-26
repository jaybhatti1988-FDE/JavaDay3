package com.overriding.operator.insurancepolicy.example.day3;

public class HealthInsurance extends InsurancePolicy {
	
	private String hospitalNetworks;
	private int noOfDependents;
	private boolean isCashless;

	public HealthInsurance(String policyNumber, String policyHolderName,double policyCoverageAmount,double policyPremiumAmount,String hospitalNetworks,int noOfDependents,boolean isCashless) {
		super(policyNumber, policyHolderName, policyCoverageAmount,policyPremiumAmount);
		this.hospitalNetworks=hospitalNetworks;
		this.noOfDependents=noOfDependents;
		this.isCashless=isCashless;
	}
	
	
	public void DisplayPolicyAccountHolderDetails() {
		super.DisplayPolicyAccountHolderDetails();
		System.out.println("------------- Health Insurance Policy User Details -------------");
		System.out.println("Enter Policy Number :- " + this.policyNumber);
		System.out.println("Enter Policy Holder Name :- " + this.policyHolderName);
		System.out.printf("Policy holder Coverage Amount :- ₹%.2f%n", this.policyCoverageAmount);
		System.out.printf("Policy holder Policy premium Amount :- ₹%.2f%n", this.policyPremiumAmount);
		System.out.println("Policy holder Hospital Network Area :- " + hospitalNetworks);
		System.out.println("Policy holder Number of Dependents :- " + noOfDependents);
		System.out.println("Is Policy holder Cashless :- " + isCashless);
		System.out.println("Type of Policy ? :- " + "Medical");
	} 

}
