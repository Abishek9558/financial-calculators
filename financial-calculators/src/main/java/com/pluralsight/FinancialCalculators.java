package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Loan amount (principle): $");
        double principle = scanner.nextDouble();
        System.out.println("Intrest rate(in %): ");
        double Intrestrate = scanner.nextDouble() / 100;
        System.out.println("Years: ");
        int Years = scanner.nextInt();

        int months = Years * 12;
        double monthlyrate = Intrestrate / 12;

        double monthlypayment = principle * (monthlyrate *Math.pow(1 + monthlyrate, months) / (Math.pow(1 + monthlyrate,  months) -1));
        double totalIntrest = (monthlypayment * months) - principle;


        System.out.printf("Monthly Payment: $%.2f", monthlypayment);
        System.out.printf("Total Intrest Paid; $%.2f", totalIntrest);
            }
}
