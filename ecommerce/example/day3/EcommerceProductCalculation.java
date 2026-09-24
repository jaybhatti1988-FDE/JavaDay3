package com.overloading.operator.ecommerce.example.day3;
import java.util.Scanner;

public class EcommerceProductCalculation {

	public static void main(String[] args) {
		
		EcommerceAccount ecomm=new EcommerceAccount();
		Scanner newScan=new Scanner(System.in);
		
		System.out.print(" Enter Base Product Price :- ");
		double prodPrice=newScan.nextDouble();
		newScan.nextLine();
		double prod1=ecomm.calculatePrice(prodPrice);
		System.out.printf("Product Base Price is  ₹%.2f%n" , prod1);
				
		System.out.print(" Enter Base Product Price :- ");
		double prodPrice2=newScan.nextDouble();
		newScan.nextLine();
		System.out.print(" Enter Discount percent :- ");
		float discount2 = newScan.nextFloat();
		double prod2 = ecomm.calculatePrice(prodPrice2,discount2);
		System.out.printf("Product Final Price after discount is  ₹%.2f%n" , prod2);
		
		 System.out.print("Enter base price: ");
	     double prodPrice3 = newScan.nextDouble();
	     System.out.print("Enter discount percent: ");
	     double discount3 = newScan.nextDouble();
	     System.out.print("Enter tax percent: ");
	     double tax3 = newScan.nextDouble();
		 double prod3=ecomm.calculatePrice(prodPrice3, discount3, tax3);
		 System.out.printf("Product Final Price after tax is  ₹%.2f%n" , prod3 , "%");
		
		
		 System.out.print("Enter base price: ");
	     double prodPrice4 = newScan.nextDouble();
	     System.out.print("Enter discount percent: ");
	     double discount4 = newScan.nextDouble();
	     System.out.print("Enter tax percent: ");
	     double tax4 = newScan.nextDouble();
	     System.out.print("Enter quantity: ");
	     int quantity4 = newScan.nextInt();
		 newScan.nextLine();
		 double prod4=ecomm.calculatePrice(prodPrice4, discount4, tax4,quantity4);
		 System.out.printf("Product Final Price after Quantity is  ₹%.2f%n" , prod4 , "%");
		newScan.close();
	}
}
