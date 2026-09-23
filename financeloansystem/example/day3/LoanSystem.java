package com.overloading.operator.financeloansystem.example.day3;

class LoanAccount {

   
    double LoanEMI(double loanAmount) {
        double defaultRate = 10.0;   // default annual interest rate (%)
        int defaultTenure = 12;      // default tenure in months
        return LoanEMI(loanAmount, defaultRate, defaultTenure);
    }

    
    double LoanEMI(double loanAmount, int tenureMonths) {
        double defaultRate = 10.0;
        return LoanEMI(loanAmount, defaultRate, tenureMonths);
    }

   
    double LoanEMI(double loanAmount, double annualInterestRate, int tenureMonths) {
        double monthlyRate = annualInterestRate / 12 / 100;

        if (monthlyRate == 0) {
            return loanAmount / tenureMonths;
        }

        double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths))
                      / (Math.pow(1 + monthlyRate, tenureMonths) - 1);
        return emi;
    }

   
    double LoanEMI(double loanAmount, double annualInterestRate, int tenureMonths, double processingFeePercent) {
        double processingFee = loanAmount * (processingFeePercent / 100);
        double adjustedLoanAmount = loanAmount + processingFee; // fee added to principal
        return LoanEMI(adjustedLoanAmount, annualInterestRate, tenureMonths);
    }
}