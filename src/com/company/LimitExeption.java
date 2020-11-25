package com.company;

public class LimitExeption extends Exception {

    String message;
    double amount;
    int sum;
    double remainingAmount;


    public LimitExeption(String message, double remainingAmount) {
        super(message);

        if (sum > remainingAmount) {
            System.out.println("Сумма запроса к выдаче  больше остатка средств на счете");
            System.out.println("Остаток средств:" + getRemainingAmount());
        }

    }

    public double getRemainingAmount() {
        remainingAmount = amount - sum;
        return remainingAmount;
    }
}
