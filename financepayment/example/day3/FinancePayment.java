package com.overriding.operator.financepayment.example.day3;

class FinancePayment {
	
	protected String paymentRefNumber;
	protected String paymentSenderName;
	protected String paymentReceiverName;
	protected String paymentStatus;
	protected double paymentAmount;
	
	public FinancePayment(String paymentRefNumber,String paymentSenderName,String paymentReceiverName,double paymentAmount,String paymentStatus) {
		this.paymentRefNumber=paymentRefNumber;
		this.paymentSenderName=paymentSenderName;
		this.paymentReceiverName=paymentReceiverName;
		this.paymentAmount=paymentAmount;
		this.paymentStatus=paymentStatus;
	}
	
	void processPayment() {
		paymentStatus="Processed (Generic Payment)";
		System.out.println("\nProcessing generic payment... no specific gateway used.");
	}
		
	public void DisplayFinancePaymentProcessDetails() {
		System.out.println("------------- Payment User Basic Details -------------");
		System.out.println("Payment User Refrence Number :- " + paymentRefNumber);
		System.out.println("Payment User Sender Name :- " + paymentSenderName);
		System.out.println("Payment User Receiver Name :- " + paymentReceiverName);
		System.out.printf("Amount ₹%.2f%n " , paymentAmount);
		System.out.println("Payment Status :- "+ paymentStatus);
	}
}