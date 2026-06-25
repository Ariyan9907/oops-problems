package com.bridgelabz;

import java.util.Scanner;

public class MainClass {

    // Starts the Stock Account application.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StockAccount account = new StockAccount("stockAccount.txt");

        int choice;

        do {
            System.out.println("1. Buy Shares");
            System.out.println("2. Sell Shares");
            System.out.println("3. Print Report");
            System.out.println("4. Total Shares");
            System.out.println("5. Save");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Company Symbol : ");
                    String buySymbol = sc.next();

                    System.out.print("Enter Shares : ");
                    int buyShares = sc.nextInt();

                    account.buy(buyShares, buySymbol);

                    break;

                case 2:

                    System.out.print("Enter Company Symbol : ");
                    String sellSymbol = sc.next();

                    System.out.print("Enter Shares : ");
                    int sellShares = sc.nextInt();

                    account.sell(sellShares, sellSymbol);

                    break;

                case 3:

                    account.printReport();

                    break;

                case 4:

                    System.out.println("Total Shares = "
                            + account.valueOf());

                    break;

                case 5:

                    account.save("stockAccount.txt");

                    break;

                case 6:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 6);

        sc.close();
    }
}