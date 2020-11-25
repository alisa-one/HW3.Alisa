package com.company;

public class BankAccount extends LimitExeption{





    public  BankAccount() {
        super.getAmount;
        super.getSum;
        super.getRemainingAmount();

    }

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

        return amount - sum;

    }
}

