package com.overriding.operator.financepayment.example.day3;

public class DebitCard extends FinancePayment {
	
	private String cardNumber;
	private double availableBalance;

	public DebitCard(String paymentRefNumber, String paymentSenderName, String paymentReceiverName,
			double paymentAmount, String paymentStatus,String cardNumber,Double availableBalance) {
		super(paymentRefNumber, paymentSenderName, paymentReceiverName, paymentAmount, paymentStatus);
		this.cardNumber=cardNumber;
		this.availableBalance=availableBalance;
		}
	
	@Override
	void processPayment() {
		if (paymentAmount<=availableBalance) {
			availableBalance-=paymentAmount;
			System.out.println("Process Via Debit Card");
			System.out.println("Card Number in masked(XXXX-XXXX-XXXX) :- " + cardNumber.substring(Math.max(0, cardNumber.length()-4)));
			System.out.printf("Remaning Balance :- ₹%.2f%n" , availableBalance);
		} else {
			paymentStatus=" Failed- Insufficient Balance";
			System.out.println(" Payment Failed Insufficient Balance in linked Account :- ");
		}			
	} 

	public void DisplayFinancePaymentProcessDetails() {
		super.DisplayFinancePaymentProcessDetails();
		System.out.println("-------------Debit Card User Details -------------");
		System.out.printf("Remaning Balance :- ₹%.2f%n" , availableBalance);
		System.out.println("Payment  Mode : Debit Card ");
	}
} 