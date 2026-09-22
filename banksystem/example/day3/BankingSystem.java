package com.overloading.operator.banksystem.example.day3;
import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		
		BankAccount bankac=new BankAccount();
		Scanner newScan=new Scanner(System.in);
		
		System.out.print(" Enter initial Balance :- ");
		double initialAccountBalance=newScan.nextDouble();
		newScan.nextLine();
		double balance1=bankac.calculateAccountBalance(initialAccountBalance);
		System.out.println("Balance (No Deposit) " + balance1);
		

		System.out.print(" Enter Deposit :- ");
		double depositAmt=newScan.nextDouble();
		newScan.nextLine();
		double balance2=bankac.calculateAccountBalance(initialAccountBalance,depositAmt);
		System.out.println("Balance (After Deposit) " + balance2);
		
		System.out.print(" Enter Interest Rate :- ");
		double intrestRate=newScan.nextDouble();
		newScan.nextLine();
		double balance3=bankac.calculateAccountBalance(initialAccountBalance,depositAmt,intrestRate);
		System.out.println("Balance (After Interest Rate) " + balance3);
		
		
		System.out.print(" Enter Number of recurring deposite :- ");
		double noofDeposits=newScan.nextDouble();
		newScan.nextLine();
		System.out.print(" Enter amount per deposite :- ");
		double amtDeposits=newScan.nextDouble();
		newScan.nextLine();
		double balance4=bankac.calculateAccountBalance(initialAccountBalance,noofDeposits,amtDeposits);
		System.out.println("Balance (After Interest Rate) " + balance4);
		newScan.close();
	}

}
