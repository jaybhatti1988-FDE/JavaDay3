package com.overriding.operator.financepayment.example.day3;

public class NetBanking extends FinancePayment {
	
	private String bankName;
	private String accountNumber;
	

	public NetBanking(String paymentRefNumber, String paymentSenderName, String paymentReceiverName,
			double paymentAmount, String paymentStatus,String bankName,String accountNumber) {
		super(paymentRefNumber, paymentSenderName, paymentReceiverName, paymentAmount, paymentStatus);
		this.bankName=bankName;
		this.accountNumber=accountNumber;
	}
	
	@Override
	void processPayment() {
		System.out.println("Processed Via Net Banking....");
		System.out.println("Redirecting to " + bankName + " Secure login Successfully ");
		System.out.println("Linked Account (masked) : XXXXXX" + accountNumber.substring(Math.max(0, accountNumber.length() - 4)));
	} 
		
	public void DisplayFinancePaymentProcessDetails() {
		super.DisplayFinancePaymentProcessDetails();
		System.out.println("-------------Net Banking User Details -------------");
		System.out.println("Bank Name :-" + bankName );
		System.out.println("Payment  Mode : Net Banking ");
	} 
}
