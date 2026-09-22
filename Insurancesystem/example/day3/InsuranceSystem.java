package com.overloading.operator.Insurancesystem.example.day3;
import java.util.Scanner;

public class InsuranceSystem {

	public static void main(String[] args) {
		
		InsurancePremium insrprmium=new InsurancePremium();
		Scanner newScan=new Scanner(System.in);
		
		System.out.print(" Enter Age :- ");
		int age=newScan.nextInt();
		newScan.nextLine();
		double premium1=insrprmium.calculatePremium(age);
		System.out.println("Policy User Age :- " + premium1);
		

		System.out.print(" Enter Policy Type :- ");
		String policyType=newScan.nextLine();
		double premium2=insrprmium.calculatePremium(age,policyType);
		System.out.println("Policy type " + premium2);
		
		System.out.print(" Enter Coverage Amount :- ");
		double coverageAmount=newScan.nextDouble();
		newScan.nextLine();
		double premium3=insrprmium.calculatePremium(age,policyType,coverageAmount);
		System.out.println("Coverage Amount " + premium3);
		
		
		System.out.print(" Is the Customer Smoker ? (yes/no):- ");
		boolean isSmoker=newScan.nextBoolean();
		newScan.nextLine();
		double premium4=insrprmium.calculatePremium(age,policyType,coverageAmount);
		System.out.println("Premium (age + coverage + smoker status): " + premium4);
		newScan.close();
	}

}
