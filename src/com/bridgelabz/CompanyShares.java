package com.bridgelabz;

import java.time.LocalDateTime;

public class CompanyShares {
    private String symbol;
    private int numberOfShares;
    private LocalDateTime transaction;

    public CompanyShares(String symbol, int numberOfSharesn) {
        this.symbol = symbol;
        this.numberOfShares = numberOfShares;
        this.transaction = LocalDateTime.now();
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares){
        this.numberOfShares=numberOfShares;
    }

    public LocalDateTime getTransaction() {
        return transaction;
    }

    public void updateTransaction(){
        transaction=LocalDateTime.now();
    }

    @Override
    public String toString() {
        return symbol + "," + numberOfShares + "," + transaction;
    }

}
