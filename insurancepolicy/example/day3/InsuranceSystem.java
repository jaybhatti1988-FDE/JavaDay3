package com.overriding.operator.insurancepolicy.example.day3;

import java.util.Scanner;
public class InsuranceSystem {

	public static void main(String[] args) {
		
	Scanner newPolicyScan=new Scanner(System.in);	
		
		System.out.println("-- Create Health Insurance Policy --\n");
	
		System.out.print("Enter Policy Holder Number :- ");
		String policyNo=newPolicyScan.nextLine();
		
		System.out.print("Enter Policy Holder Name :- ");
		String PolicyHolderName=newPolicyScan.nextLine();
		
		System.out.print("Enter Policy Coverage Amount :- ");
		double covrageAmt=newPolicyScan.nextDouble();
		newPolicyScan.nextLine();
		
		System.out.print("Enter Policy Premium Amount :- ");
		double premiumAmt=newPolicyScan.nextDouble();
		newPolicyScan.nextLine();
		
		System.out.print("Enter Policy Hospital Network Area :- ");
		String hospitalNetwrk=newPolicyScan.nextLine();
		
		System.out.print("Enter Number of Dependents of Policy holder (including Policy holder) :- ");
		int noPolicyHolder=newPolicyScan.nextInt();
		newPolicyScan.nextLine();
		
		System.out.print("Is Medical Policy holder cashless ? :- ");
		boolean isCashless=newPolicyScan.nextBoolean();
		newPolicyScan.nextLine();
		
		HealthInsurance hlthinsrnce=new HealthInsurance(policyNo, PolicyHolderName, covrageAmt, premiumAmt, hospitalNetwrk, noPolicyHolder,isCashless);
		hlthinsrnce.DisplayPolicyAccountHolderDetails();
		
		System.out.println("\n-- Create Vehicle Insurance Policy --\n");
						
		System.out.print("Enter Vehicle Policy Holder Number :- ");
		String vehiclePolicyNo=newPolicyScan.nextLine();
		
		System.out.print("Enter Vehicle Policy Holder Name :- ");
		String vehiclePolicyHolderName=newPolicyScan.nextLine();
		
		System.out.print("Enter Vehicle Policy Coverage Amount :- ");
		double vehicleCovrageAmt=newPolicyScan.nextDouble();
		newPolicyScan.nextLine();
		
		System.out.print("Enter Vehicle Policy Premium Amount :- ");
		double vehiclePremiumAmt=newPolicyScan.nextDouble();
		newPolicyScan.nextLine();
		
		System.out.print("Enter Vehicle Number of Policy Holder  :- ");
		String vehicleNo=newPolicyScan.nextLine();
		
		System.out.print("Enter Vehicle Type of Policy Holder  :- ");
		String vehicleType=newPolicyScan.nextLine();
		
		System.out.print("Enter any Vehicle Depriciation of Policy Holder  :- ");
		boolean vehicleDepriciation=newPolicyScan.nextBoolean();
		newPolicyScan.nextLine();
		
		VehicleInsurance vehcleInsurance=new VehicleInsurance(vehiclePolicyNo, vehiclePolicyHolderName, vehicleCovrageAmt, vehiclePremiumAmt, vehicleNo, vehicleType, vehicleDepriciation); 
		vehcleInsurance.DisplayPolicyAccountHolderDetails();
						
		newPolicyScan.close();
	}
}
