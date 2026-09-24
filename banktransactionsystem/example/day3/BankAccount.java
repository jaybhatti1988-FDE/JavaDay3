package com.overloading.operator.banktransactionsystem.example.day3;



class BankTransaction {
	
	void processTransaction(String accountNo) {
		System.out.println("Account Number" + accountNo);
		System.out.println("Transaction Type : Balance Inquiry (default) ");
		System.out.println("Status : Account details fetched successfully.");
	}
	
	void processTransaction(String accountNumber, double amount) {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Amount : " + amount);
        System.out.println("Transaction Type : Transfer (default)");
        System.out.println("Status : Amount " + amount + " transferred successfully.");
    }
	 	
	void processTransaction(String accountNumber, double amount, String transactionType) {
		  System.out.println("Account Number : " + accountNumber);
	        System.out.println("Amount : " + amount);
	        System.out.println("Transaction Type : " + transactionType);
	        switch (transactionType.toLowerCase()) {
            case "deposit":
                System.out.println("Status : Amount " + amount + " deposited successfully.");
                break;
            case "withdrawal":
                System.out.println("Status : Amount " + amount + " withdrawn successfully.");
                break;
            case "transfer":
                System.out.println("Status : Amount " + amount + " transferred successfully.");
                break;
            default:
                System.out.println("Status : Unknown transaction type. Please verify.");
        }
	}
	
	void processTransaction(String senderAccount, String receiverAccount, double amount, String transactionType) {
		 System.out.println("Sender Account : " + senderAccount);
	        System.out.println("Receiver Account : " + receiverAccount);
	        System.out.println("Amount : " + amount);
	        System.out.println("Transaction Type : " + transactionType);
	        System.out.println("Status : Amount " + amount + " " + transactionType + " from "
	                + senderAccount + " to " + receiverAccount + " completed successfully.");
		
	}
}

	

