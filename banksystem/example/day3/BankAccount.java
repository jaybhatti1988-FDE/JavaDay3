package com.overloading.operator.banksystem.example.day3;



class BankAccount {
	
	double calculateAccountBalance(double initialAccountBalance) {
		return initialAccountBalance;
	}
	
	double calculateAccountBalance(double depositAmount,double initialAccountBalance) {
		return depositAmount+initialAccountBalance;
	}
	
	double calculateAccountBalance(double depositAmount,double initialAccountBalance,double depositAmountInterest) {
		double beforeInterestrate=initialAccountBalance+depositAmount;
		double Interest=beforeInterestrate*(initialAccountBalance*100);
		return beforeInterestrate+Interest;
	}
	
	double calculateAccountBalance(double initialAccountBalance,int noOfDeposits,double eachDepositAmount) {
		return initialAccountBalance+(noOfDeposits*eachDepositAmount);
		
	}
}

	

