package com.overriding.operator.bankintrstcalculation.example.day3;

import java.util.Scanner;

public class BankingApplicationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continueApp = true;

        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║   WELCOME TO FINANCE BANKING SYSTEM     ║");
        System.out.println("╚═════════════════════════════════════════╝");

        while (continueApp) {

            System.out.println("\n========= SELECT ACCOUNT TYPE =========");
            System.out.println(" 1. Savings Account");
            System.out.println(" 2. Current Account");
            System.out.println(" 3. Fixed Deposit Account");
            System.out.println(" 4. Loan Account");
            System.out.println(" 5. Recurring Deposit Account");
            System.out.println(" 6. Exit");
            System.out.println("=======================================");
            System.out.print("Enter Your Choice :- ");

            int choice = sc.nextInt();
            sc.nextLine(); // ✅ flush after choice

            if (choice == 6) {
                System.out.println("\n Thank you for using Finance Banking System. Goodbye!");
                break;
            }

            // --- Common Inputs ---
            System.out.print("Enter Bank Account Number   :- ");
            String bankAccnt = sc.nextLine();

            System.out.print("Enter Account Holder Name   :- ");
            String accntName = sc.nextLine();

            System.out.print("Enter Principal Amount      :- ");
            double principal = sc.nextDouble();
            sc.nextLine(); // ✅ flush

            // Current Account doesn't need rate & period
            double rate = 0.0;
            int years = 0;

            if (choice != 2) {
                System.out.print("Enter Interest Rate (%)     :- ");
                rate = sc.nextDouble();
                sc.nextLine(); // ✅ flush

                System.out.print("Enter Period of Time (Yrs)  :- ");
                years = sc.nextInt();
                sc.nextLine(); // ✅ KEY FIX — flush \n after nextInt
            }

            switch (choice) {

                case 1: // Savings Account
                    System.out.print("Enter Minimum Balance (₹)   :- ");
                    double minBal = sc.nextDouble();
                    sc.nextLine(); // ✅ flush

                    SavingBankingAccount savings = new SavingBankingAccount(
                        bankAccnt, accntName, principal, rate, years, minBal
                    );
                    savings.DisplayAccountHolderDetails();
                    break;

                case 2: // Current Account
                    System.out.print("Enter OverDraft Limit (₹)     :- ");
                    double odLimit = sc.nextDouble();
                    sc.nextLine(); // ✅ flush

                    System.out.print("Enter Transaction Charges (₹)  :- ");
                    double txnCharges = sc.nextDouble();
                    sc.nextLine(); // ✅ flush

                    CurrentBankingAccount curntbnk = new CurrentBankingAccount(
                        bankAccnt, accntName, principal, odLimit, txnCharges
                    );
                    curntbnk.DisplayAccountHolderDetails();
                    break;

                case 3: // Fixed Deposit
                    System.out.print("Enter Early Withdrawal Penalty (₹) :- ");
                    double penalty = sc.nextDouble();
                    sc.nextLine(); // ✅ flush

                    FixedDepositBankingAccount fd = new FixedDepositBankingAccount(
                        bankAccnt, accntName, principal, rate, years, penalty
                    );
                    fd.DisplayAccountHolderDetails();
                    break;

                case 4: // Loan Account
                    System.out.print("Enter Processing Fee (₹)    :- ");
                    double fee = sc.nextDouble();
                    sc.nextLine(); // ✅ flush

                    System.out.print("Enter EMI Duration (Months) :- ");
                    int emiMonths = sc.nextInt();
                    sc.nextLine(); // ✅ flush

                    LoanBankingAccount loan = new LoanBankingAccount(
                        bankAccnt, accntName, principal, rate, years, fee, emiMonths
                    );
                    loan.DisplayAccountHolderDetails();
                    break;

                case 5: // Recurring Deposit
                    System.out.println("(Note: Principal = Monthly Deposit Amount for RD)");
                    RecurringBankAccount rd = new RecurringBankAccount(
                        bankAccnt, accntName, principal, rate, years
                    );
                    rd.DisplayAccountHolderDetails();
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please select 1 to 6.");
            }

            // ✅ This now works correctly
            System.out.print("\n Do you want to calculate for another account? (yes/no) :- ");
            String again = sc.nextLine();
            if (!again.equalsIgnoreCase("yes")) {
                continueApp = false;
                System.out.println("\n Thank you for using Finance Banking System. Goodbye!");
            }
        }

        sc.close();
    }
}