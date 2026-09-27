package com.overriding.operator.ecommerceorderprocess.example.day3;

import java.util.Scanner;
public class FinancePaymentProcess {

	public static void main(String[] args) {
		
		Scanner newFinanceScan=new Scanner(System.in);	
		
		System.out.println("===== E-Commerce Order Processing Payment Application =====");

		// ---- Normal Delivery Payment ----
		System.out.println("\n-- Normal Delivery Payment --");
		
		System.out.print("Enter Order Id :- ");
		String ordId = newFinanceScan.nextLine();
		
		System.out.print("Enter Order Item Name :- ");
		String ordItem = newFinanceScan.nextLine();
				
		System.out.print("Enter Payment Type(COD/CreditCard/DebitCard/NetBanking/UPI) :- ");
		String nrmlPaymntType = newFinanceScan.nextLine();
				
		System.out.print("Enter Payment Amount :- ");
		double payAmt = newFinanceScan.nextDouble();
		newFinanceScan.nextLine();
		
		System.out.print("Enter Estimated Delivery Days :- ");
		int estDays = newFinanceScan.nextInt();
		newFinanceScan.nextLine();
		
		NormalDelivery nrmdelvry = new NormalDelivery(ordId, ordItem, "normal", nrmlPaymntType, payAmt, "Pending", estDays);
		nrmdelvry.processOrder();
		nrmdelvry.DisplayOrderPaymentProcessDetails();

		// ---- Express Delivery Payment ----
		System.out.println("\n-- Express Delivery Payment --");
		
		System.out.print("Enter Order Id :- ");
		String expOrdId = newFinanceScan.nextLine();
				
		System.out.print("Enter Order Item Name :- ");
		String expOrdItem = newFinanceScan.nextLine();
				
		System.out.print("Enter Payment Type(COD/CreditCard/DebitCard/NetBanking/UPI) :- ");
		String expPaymntType = newFinanceScan.nextLine();
				
		System.out.print("Enter Payment Amount :- ");
		double expPayAmt = newFinanceScan.nextDouble();
		newFinanceScan.nextLine();
		
		System.out.print("Enter Express Fees :- ");
		double expPayFees = newFinanceScan.nextDouble();
		newFinanceScan.nextLine();

		ExpressDelivery expdelvry = new ExpressDelivery(expOrdId, expOrdItem, "Express", expPaymntType, expPayAmt,"Pending",expPayFees);
		expdelvry.DisplayOrderPaymentProcessDetails();
		expdelvry.processOrder();
		System.out.println("\n===== End E-Commerce Order Processing Payment Application Process =====");	
		newFinanceScan.close();
	}
}

