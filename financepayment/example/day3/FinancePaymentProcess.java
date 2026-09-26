package com.overriding.operator.financepayment.example.day3;

import java.util.Scanner;
public class FinancePaymentProcess {

	public static void main(String[] args) {
		
		Scanner newFinanceScan=new Scanner(System.in);	
		
		System.out.println("===== Finance Payment Application: =====");

		// ---- Credit Card Payment ----
		System.out.println("\n-- Credit Card Payment --");
		System.out.print("Enter Payment Reference Number :- ");
		String ccRef = newFinanceScan.nextLine();
		System.out.print("Enter Sender Name :- ");
		String ccSender = newFinanceScan.nextLine();
		System.out.print("Enter Receiver Name :- ");
		String ccReceiver = newFinanceScan.nextLine();
		System.out.print("Enter Payment Amount :- ");
		double ccAmount = newFinanceScan.nextDouble();
		newFinanceScan.nextLine();
		System.out.print("Enter Card Number :- ");
		String ccNumber = newFinanceScan.nextLine();
		System.out.print("Enter CVV :- ");
		String ccCvv = newFinanceScan.nextLine();

		CreditCard creditCard = new CreditCard(ccRef, ccSender, ccReceiver, ccAmount, "Pending", ccNumber, ccCvv);
		creditCard.processPayment();
		creditCard.DisplayFinancePaymentProcessDetails();

		// ---- Debit Card Payment ----
		System.out.println("\n-- Debit Card Payment --");
		System.out.print("Enter Payment Reference Number :- ");
		String dcRef = newFinanceScan.nextLine();
		System.out.print("Enter Sender Name :- ");
		String dcSender = newFinanceScan.nextLine();
		System.out.print("Enter Receiver Name :- ");
		String dcReceiver = newFinanceScan.nextLine();
		System.out.print("Enter Payment Amount :- ");
		double dcAmount = newFinanceScan.nextDouble();
		newFinanceScan.nextLine();
		System.out.print("Enter Card Number :- ");
		String dcNumber = newFinanceScan.nextLine();
		System.out.print("Enter Available Balance :- ");
		double dcBalance = newFinanceScan.nextDouble();
		newFinanceScan.nextLine();

		DebitCard debitCard = new DebitCard(dcRef, dcSender, dcReceiver, dcAmount, "Pending", dcNumber, dcBalance);
		debitCard.processPayment();
		debitCard.DisplayFinancePaymentProcessDetails();

		// ---- Net Banking Payment ----
		System.out.println("\n-- Net Banking Payment --");
		System.out.print("Enter Payment Reference Number :- ");
		String nbRef = newFinanceScan.nextLine();
		System.out.print("Enter Sender Name :- ");
		String nbSender = newFinanceScan.nextLine();
		System.out.print("Enter Receiver Name :- ");
		String nbReceiver = newFinanceScan.nextLine();
		System.out.print("Enter Payment Amount :- ");
		double nbAmount = newFinanceScan.nextDouble();
		newFinanceScan.nextLine();
		System.out.print("Enter Bank Name :- ");
		String bankName = newFinanceScan.nextLine();
		System.out.print("Enter Account Number :- ");
		String nbAccount = newFinanceScan.nextLine();

		NetBanking netBanking = new NetBanking(nbRef, nbSender, nbReceiver, nbAmount, "Pending", bankName, nbAccount);
		netBanking.processPayment();
		netBanking.DisplayFinancePaymentProcessDetails();

		// ---- UPI Payment ----
		System.out.println("\n-- UPI Payment --");
		System.out.print("Enter Payment Reference Number :- ");
		String upiRef = newFinanceScan.nextLine();
		System.out.print("Enter Sender Name :- ");
		String upiSender = newFinanceScan.nextLine();
		System.out.print("Enter Receiver Name :- ");
		String upiReceiver = newFinanceScan.nextLine();
		System.out.print("Enter Payment Amount :- ");
		double upiAmount = newFinanceScan.nextDouble();
		newFinanceScan.nextLine();
		System.out.print("Enter UPI ID :- ");
		String upiId = newFinanceScan.nextLine();

		UPI upi = new UPI(upiRef, upiSender, upiReceiver, upiAmount, "Pending", upiId);
		upi.processPayment();
		upi.DisplayFinancePaymentProcessDetails();

		System.out.println("\n===== End of Finance Payment Processing =====");

		newFinanceScan.close();
	}
}

