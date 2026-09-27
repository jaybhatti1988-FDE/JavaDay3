package com.overriding.operator.ecommerceorderprocess.example.day3;

public class ExpressDelivery extends Ecommerce {

	private double expressFees;
	
	public ExpressDelivery(String orderId, String orderItem, String orderType, String orderPaymentType,
			double PayAmount, String deliveryStatus,double expressFees) {
		super(orderId, orderItem, orderType, orderPaymentType, PayAmount, deliveryStatus);
		this.expressFees=expressFees;
	}
		
	@Override
	void processOrder() {
		verifyPayment();
		deliveryStatus="Processed Express Order Processing..... ";
		PayAmount +=expressFees;
		
		switch (orderType.toLowerCase()) {
		case "express":
			deliveryStatus="Express delivery Schedule";
			break;

		default:
			deliveryStatus="Express Processing....";
		 }
		 System.out.printf("Express Fees       :  ₹%.2f%n", expressFees );
		 System.out.println("Shipping Method    : Priority Courier (rush handling)");
	} 

	@Override
	public void DisplayOrderPaymentProcessDetails() {
		System.out.println("------------- Express Order Details -------------");
		super.DisplayOrderPaymentProcessDetails();
		//System.out.printf("Express Fees :- ₹%.2f%n",  expressFees );
		System.out.println("Order Category     :Express Order");
	} 
} 