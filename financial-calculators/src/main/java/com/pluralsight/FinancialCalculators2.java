package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("deposit amount: $");
        double principle = scanner.nextDouble();
        System.out.println("annual rate(in %): ");
        double annualrate = scanner.nextDouble() / 100;
        System.out.println("No of years: ");
        int years = scanner.nextInt();

        int daysperyear = 365;
        int totaldays =years * daysperyear;

        double futurevalue = principle * Math.pow((1+(annualrate / daysperyear)), totaldays);

        double totalintrest = futurevalue - principle;

        System.out.printf("future value: $%.2f\n", futurevalue);
        System.out.printf("total intrest earned: $%.2f\n", totalintrest);




    }
}
