package com.overriding.operator.ecommerceorderprocess.example.day3;

class Ecommerce {
	
	protected String orderId;
	protected String orderItem;
	protected String orderType;
	protected String orderPaymentType;
	protected double PayAmount;
	protected String deliveryStatus;
	
	public Ecommerce(String orderId,String orderItem,String orderType,String orderPaymentType,double PayAmount,String deliveryStatus) {
		this.orderId=orderId;
		this.orderItem=orderItem;
		this.orderType=orderType;
		this.orderPaymentType=orderPaymentType;
		this.PayAmount=PayAmount;
		this.deliveryStatus="Pending";
	}
	
	protected void verifyPayment() {
		switch (orderPaymentType.toLowerCase()) {
		
		case "cod":
			System.out.println("Payment Mode :- Cash On Delivery - Amount to be collected on delivery. ");
			break;
		
		case "credit":
			System.out.println("Payment Mode :- Payment via Credit Card - Payment through Authorization Successfully. ");
			break;	
		
		case "debit":
			System.out.println("Payment Mode :- Payment via Debit Card - Payment via Card Deduct from balance Successfully. ");
			break;	
		
		case "netbanking":
			System.out.println("Payment Mode :- Payment via Online Net Banking - Payment via Net Banking NEFT transfer and deduct amount from linked Account Successfully. ");
			break;	
			
		case "upi":
			System.out.println("Payment Mode :- Payment via UPI - Payment via UPI transfer and deduct amount from linked Account Successfully. ");
			break;	

		default:
			System.out.println("Unknown Payment Mode Please select valid Payment Mode ");
		}
	}
	
	void processOrder() {
		verifyPayment();
		deliveryStatus="Processed (Generic Payment)";
		System.out.println("\nProcessing generic payment... no specific gateway used.");
	}
		
	public void DisplayOrderPaymentProcessDetails() {
		//System.out.println("\n------------- Order Details -------------");
		System.out.println("Order ID           : " + orderId);
		System.out.println("Order Item         : " + orderItem);
		System.out.println("Order Type         : " + orderType);
		System.out.println("Payment Type       : " + orderPaymentType);
		System.out.printf("Amount Paid        :₹%.2f%n", PayAmount);
		System.out.println("Delivery Status    : " + deliveryStatus);
	}
}