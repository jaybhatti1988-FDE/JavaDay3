package com.overriding.operator.financepayment.example.day3;

public class CreditCard extends FinancePayment {
	
	private String crdNumber;
	private String cvv;
	private int rewardsoints;

	public CreditCard(String paymentRefNumber, String paymentSenderName, String paymentReceiverName,
			double paymentAmount, String paymentStatus,String crdNumber,String cvv) {
		super(paymentRefNumber, paymentSenderName, paymentReceiverName, paymentAmount, paymentStatus);
		this.crdNumber=crdNumber;
		this.cvv=cvv;
		}
	
	private String maskNumbers() {
		return "XXXX-XXXX-XXXX"+ crdNumber.substring(Math.max(0, crdNumber.length()-4));
	}
	
	private String maskCVV() {
		return "*".repeat(cvv.length());
	}
		
	@Override
	void processPayment() {
		rewardsoints=(int)this.paymentAmount/100;
		System.out.println(" Processing via Credit Card...... ");
		System.out.println(" Card Number in masked(XXXX-XXXX-XXXX) :- " + maskNumbers());
		System.out.println(" Card Number CVV in masked(XXXX-XXXX-XXXX) :- " + maskCVV());
		System.out.println(" Rewards Points :- " + rewardsoints);
		} 
		
	public void DisplayFinancePaymentProcessDetails() {
		super.DisplayFinancePaymentProcessDetails();
		System.out.println("-------------Credit Card User Details -------------");
		System.out.println(" Card Number (XXXX-XXXX-XXXX) :- " + maskNumbers());
		System.out.println("  CVV (XXX) :- " + maskCVV());
		System.out.println(" Rewards Points Earned :- " + rewardsoints);
		System.out.println(" Payment  Mode : Credit Card ");

	} 
}