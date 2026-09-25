package com.overriding.operator.bankaccounttypes.example.day3;

import java.util.Scanner;
public class BankingSystem {

	public static void main(String[] args) {
		
	Scanner newBankScan=new Scanner(System.in);	
		
		System.out.print("Enter Bank Account Number :- ");
		String bankAccnt=newBankScan.nextLine();
		
		System.out.print("Enter Account Holder Name :- ");
		String accntName=newBankScan.nextLine();
		
		System.out.print("Enter initial Balance :- ");
		double initialBalance=newBankScan.nextDouble();
		newBankScan.nextLine();
		
		System.out.print("Enter Interest Rate :- ");
		double intrstRate=newBankScan.nextDouble();
		newBankScan.nextLine();
		
		System.out.print("Enter Required Minimum Balance :- ");
		double minBalance=newBankScan.nextDouble();
		newBankScan.nextLine();
		
		SavingBankingAccount savAccnt=new SavingBankingAccount(bankAccnt, accntName, initialBalance,intrstRate,minBalance);
		savAccnt.DisplayAccountHolderDetails();
		
		System.out.print("Enter amount you want to withdrawl :- ");
		double withdrawAmt=newBankScan.nextDouble();
		newBankScan.nextLine();
		
		savAccnt.withdraw(withdrawAmt);
		savAccnt.DisplayAccountHolderDetails();
		
		System.out.println("********** Current Account Holder Details **********");
		
		System.out.print(" Enter Current Bank Account Number :- ");
		String bankCurrentAccnt=newBankScan.nextLine();
		
		System.out.print("Enter Account Holder Name :- ");
		String currentAccntName=newBankScan.nextLine();
				
		System.out.print("Enter Current Account initial Balance :- ");
		double currentInitialBalance=newBankScan.nextDouble();
		newBankScan.nextLine();
		
		System.out.print("Enter Demand Draft limit :- ");
		double demandDraft=newBankScan.nextDouble();
		newBankScan.nextLine();
		
		CurrentBankingAccount curaccnt=new CurrentBankingAccount(bankCurrentAccnt, currentAccntName, currentInitialBalance, demandDraft); 
		curaccnt.DisplayAccountHolderDetails();
		
		curaccnt.withdraw(demandDraft);
		curaccnt.DisplayAccountHolderDetails();
				
		newBankScan.close();
	}
}
