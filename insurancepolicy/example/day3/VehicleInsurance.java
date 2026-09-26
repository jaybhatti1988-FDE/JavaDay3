package com.overriding.operator.insurancepolicy.example.day3;

public class VehicleInsurance extends InsurancePolicy {
	
	private String vehicleNumber;
	private String vehicleType;
	private boolean hasZeroDepriciation;

	public VehicleInsurance(String policyNumber, String policyHolderName,double policyCoverageAmount,double policyPremiumAmount,String vehicleNumber,String vehicleType,boolean hasZeroDepriciation) {
		super(policyNumber, policyHolderName, policyCoverageAmount,policyPremiumAmount);
		this.vehicleNumber=vehicleNumber;
		this.vehicleType=vehicleType;
		this.hasZeroDepriciation=hasZeroDepriciation;
	}
		
	public void DisplayPolicyAccountHolderDetails() {
		super.DisplayPolicyAccountHolderDetails();
		System.out.println("------------- Vehicle Insurance Policy User Details -------------");
		System.out.println("Enter Policy Number :- " + this.policyNumber);
		System.out.println("Enter Policy Holder Name :- " + this.policyHolderName);
		System.out.printf("Policy holder Coverage Amount :- ₹%.2f%n", this.policyCoverageAmount);
		System.out.printf("Policy holder Policy premium Amount :- ₹%.2f%n", this.policyPremiumAmount);
		System.out.println("Policy holder Vehicle Number :- " + vehicleNumber);
		System.out.println("Policy holder Vehicle Type :- " + vehicleType);
		System.out.println("Policy holder has any Depriciation in vehicle ? :- " + hasZeroDepriciation);
		System.out.println("Type of Policy ? :- " + "Vehical");

	} 
}
