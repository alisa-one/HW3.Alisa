package com.company;

public class BankAccount {

    double amount;
    int sum;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        return amount + sum;
    }

    public double withDraw(int sum) {
        if (sum > amount) {

            BankAccount drow = new LimitExeption(String message, double remainingAmount);
        } else
        {return  amount - sum;    }

    }
}

