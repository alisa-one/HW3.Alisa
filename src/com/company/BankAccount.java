package com.company;

public class BankAccount {
    double amount;
    int sum;


    public BankAccount(String message, double remainingAmount) {

        super(message, remainingAmount);
    }

    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;

    }

    public int getSum() {

        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double deposit(double sum) {

        return amount + sum;
    }

    public double withDraw(int sum) {
        if (sum>amount){
            throw new LimitExeption(String message,double remainingAmount);
        }

        return amount - sum;

    }


}

