package com.company;

public class LimitExeption extends Exception{

    private final String message;
    private int amountKlient;
    int sum;
    private double remainingAmount;


    public LimitExeption(String message, double remainingAmount) {
        super(message);
        this.message ="Сумма запроса к выдаче  больше остатка средств на счете";
        if (sum> amountKlient){
            System.out.println(this.message);
            System.out.println("Остаток средств:"+getRemainingAmount());
        }

    }

    public double getRemainingAmount() {
        remainingAmount= amountKlient- sum;
        return remainingAmount ;
    }
}
