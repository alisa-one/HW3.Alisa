package com.company;

public class BankAccount {

     int AddSumm ;
    int amount;


    public int getAmount() {
        return (int) amount;
    }


    public void setAmount(int amount) {
        this.amount = amount;

    }


    public void deposit(int AddSumm) {

        amount = amount +AddSumm;
    }

    public void withDraw(int sum) throws LimitExeption {
        if (sum >( int) (amount)) {
            String message = "Запрашиваемая сумма выше остатка на счете";
            throw new LimitExeption(message, sum);
        }
        amount = amount - sum;
        System.out.println("Снята сумма:"+sum);
        System.out.println("-------------------------------------");


    }


}

