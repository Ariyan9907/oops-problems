package com.bridgelabz;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {
    private ArrayList<CompanyShares> shares=new ArrayList<CompanyShares>();

    //Creating stock
    public StockAccount(String path){
        File file = new File(path);
        if(!file.exists()){
            return;
        }

        try(Scanner sc=new Scanner(new FileReader(path))){
            while(sc.hasNextLine()){
                String line=sc.nextLine();

                if(line.trim().isEmpty()){
                    continue;
                }

                String data[]=line.split(",");

                String symbol=data[0];
                int quantity=Integer.parseInt((data[1]));

                shares.add(new CompanyShares(symbol,quantity));

            }
        } catch (FileNotFoundException e) {
            System.out.println("Error Reading file.");
        }
    }

    public double valueOf(){
        int total=0;

        for(CompanyShares company:shares){
            total+=company.getNumberOfShares();
        }
        return total;
    }

    // Buys shares of a company.
    public void buy(int amount, String symbol) {

        for (CompanyShares company : shares) {

            if (company.getSymbol().equalsIgnoreCase(symbol)) {

                company.setNumberOfShares(
                        company.getNumberOfShares() + amount);

                company.updateTransaction();

                System.out.println(amount + " Shares Purchased.");

                return;
            }
        }
        shares.add(new CompanyShares(symbol, amount));

        System.out.println("New Company Added.");
    }

    // Sells shares of a company.
    public void sell(int amount, String symbol) {

        for (CompanyShares company : shares) {

            if (company.getSymbol().equalsIgnoreCase(symbol)) {

                if (company.getNumberOfShares() >= amount) {

                    company.setNumberOfShares(
                            company.getNumberOfShares() - amount);

                    company.updateTransaction();

                    System.out.println(amount + " Shares Sold.");

                } else {

                    System.out.println("Not Enough Shares.");

                }

                return;
            }
        }

        System.out.println("Company Not Found.");
    }

    // Saves stock details into a file.
    public void save(String fileName) {

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {

            for (CompanyShares company : shares) {

                pw.println(company.getSymbol() + ","
                        + company.getNumberOfShares());
            }

            System.out.println("Data Saved Successfully.");

        } catch (IOException e) {

            System.out.println("Error Saving File.");

        }
    }

        // Prints the complete stock report.
        public void printReport(){

            System.out.println("\n--------- STOCK REPORT ---------");

            for (CompanyShares company : shares) {

                System.out.println("--------------------------------");

                System.out.println("Company : " + company.getSymbol());

                System.out.println("Shares  : "
                        + company.getNumberOfShares());

                System.out.println("Updated : "
                        + company.getTransaction());
            }

            System.out.println("--------------------------------");

            System.out.println("Total Shares : " + valueOf());

            System.out.println("--------------------------------");
        }
    }


