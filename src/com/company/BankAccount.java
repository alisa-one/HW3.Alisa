package com.company;

public class BankAccount {

    double amount;


    public int getAmount() {
        return (int) amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;

    }


    public void deposit(int sum) {

        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitExeption {
        if (sum >( int) (amount)) {
            String message = "Запрашиваемая сумма выше остатка на счете";
            throw new LimitExeption(message, sum);
        }
        amount = amount - sum;
        System.out.println("Снята сумма:"+sum);

    }


}

