package com.overriding.operator.financepayment.example.day3;

public class UPI extends FinancePayment {
	
	private String upiId;

	public UPI(String paymentRefNumber, String paymentSenderName, String paymentReceiverName,
			double paymentAmount, String paymentStatus,String upiId) {
		super(paymentRefNumber, paymentSenderName, paymentReceiverName, paymentAmount, paymentStatus);
		this.upiId=upiId;
	}
		
	@Override
	void processPayment() {
		System.out.println("Processed Via UPI....");
		System.out.println("UPI ID " + upiId);
		System.out.println("Instant transfer completed between bank accounts.");
	} 
		
	public void DisplayFinancePaymentProcessDetails() {
		super.DisplayFinancePaymentProcessDetails();
		System.out.println("-------------UPI User Details -------------");
		System.out.println("UPI ID :-" + upiId );
		System.out.println("Payment  Mode : UPI ");
	} 

}
