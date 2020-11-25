package com.company;

public class LimitExeption extends Exception {


    String message;

    double remainingAmount;


    public LimitExeption(String message, double remainingAmount) {
        super(message= "ВВеденная сумма превышает остаток средств на счете");

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRemainingAmount() {
        remainingAmount = (double)(amount - sum);
        return remainingAmount;
    }
}
