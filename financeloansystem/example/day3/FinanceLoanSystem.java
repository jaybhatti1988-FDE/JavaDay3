package com.overloading.operator.financeloansystem.example.day3;
import java.util.Scanner;

public class FinanceLoanSystem {

	public static void main(String[] args) {
		
		LoanAccount loan=new LoanAccount();
		Scanner newScan=new Scanner(System.in);
		
		System.out.print(" Enter Loan Amount :- ");
		double loanAmount=newScan.nextDouble();
		newScan.nextLine();
		double loanamt1=loan.LoanEMI(loanAmount);
		System.out.printf("EMI  %.2f%n" , loanamt1);
				
		System.out.print(" Enter Tenture (In Months) :- ");
		int tentureMths=newScan.nextInt();
		newScan.nextLine();
		double loanamt2=loan.LoanEMI(loanAmount,tentureMths);
		System.out.printf("Tenture (In Months)  %.2f%n" , loanamt2);
		
		System.out.print(" Enter Interest Rate (%) :- ");
		double intrestRate=newScan.nextDouble();
		newScan.nextLine();
		double loanamt3=loan.LoanEMI(loanAmount, intrestRate, tentureMths);
		System.out.printf("Balance (After Interest Rate)  %.2f%n" , loanamt3 , "%");
		
		
		System.out.print(" Enter Processing fees :- ");
		double processFees=newScan.nextDouble();
		newScan.nextLine();
		double loanamt4=loan.LoanEMI(loanAmount, intrestRate, tentureMths, processFees);
		System.out.printf("EMI (loan amount + rate + tenure + processing fee): %.2f%n", loanamt4);
		newScan.close();
	}

}
