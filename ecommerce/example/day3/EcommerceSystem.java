package com.overloading.operator.ecommerce.example.day3;

class EcommerceAccount {

   
    double calculatePrice(double productPrice) {
        System.out.println("Calculating base price");
        return productPrice;
    }

    
    double calculatePrice(double productPrice, float discountPercent) {
        System.out.println("Calculating base price with discount");
        double discountAmt=productPrice*(discountPercent/100);
        return productPrice- discountAmt;
    }

   
    double calculatePrice(double productPrice, double discountPercent, double taxpayer) {
        System.out.println("Calculating price with base price and discount");
    	double priceAfterDiscount=productPrice-(productPrice*(discountPercent/100));
        double taxAmount=priceAfterDiscount*(taxpayer/100);
    	return priceAfterDiscount+taxAmount; 
    }
   
    double calculatePrice(double productPrice, double discountPercent, double taxpayer, int qty) {
        System.out.println("Total Price for Quantity"+qty);
    	double priceAfterDiscount = productPrice-(productPrice*(discountPercent/100));
        double priceAftertax = priceAfterDiscount+(priceAfterDiscount*(taxpayer/100));
        return priceAftertax*qty;
    }
}