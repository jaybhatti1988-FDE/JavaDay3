package com.overloading.operator.banktransactionsystem.example.day3;
import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		
		BankTransaction banktrnsction=new BankTransaction();
		Scanner newScan=new Scanner(System.in);
		
		System.out.print("\nEnter account number: ");
        String accountNumber = newScan.nextLine();
        banktrnsction.processTransaction(accountNumber);
		

        System.out.print("\nEnter transaction amount: ");
        double amount = newScan.nextDouble();
        newScan.nextLine(); // clear buffer
        banktrnsction.processTransaction(accountNumber, amount);
		
        System.out.print("\nEnter transaction type (Deposit/Withdrawal/Transfer): ");
        String transactionType = newScan.nextLine();
        banktrnsction.processTransaction(accountNumber, amount, transactionType);
		
		
        System.out.print("\nEnter receiver account number: ");
        String receiverAccount = newScan.nextLine();
        banktrnsction.processTransaction(accountNumber, receiverAccount, amount, transactionType);

      
		newScan.close();
	}

}
