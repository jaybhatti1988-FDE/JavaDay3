package com.overriding.operator.ecommerceorderprocess.example.day3;

public class NormalDelivery extends Ecommerce {


	private int estimatedDeliveryDays;

	public NormalDelivery(String orderId, String orderItem, String orderType, String orderPaymentType, double PayAmount,
			String deliveryStatus,int estimatedDeliveryDays) {
		super(orderId, orderItem, orderType, orderPaymentType, PayAmount, deliveryStatus);
		this.estimatedDeliveryDays=estimatedDeliveryDays;
	}
		
	@Override
	void processOrder() {
		deliveryStatus="Processed Normal Order Processing..... ";
		verifyPayment();
		
		switch (orderType.toLowerCase()) {
		case "normal":
			deliveryStatus="Standard delivery Schedule";
			break;

		default:
			deliveryStatus="Standard Processing....";
		 }
	} 
	
	public void DisplayOrderPaymentProcessDetails() {
	System.out.println("------------- Normal Order Details -------------");
		super.DisplayOrderPaymentProcessDetails();
		System.out.println("Estimated Delivery : " + estimatedDeliveryDays + " days ");
		System.out.println("Order Category     :   Normal Order");
	} 
}