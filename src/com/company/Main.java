package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount Klient1 = new BankAccount("Счет",20.000);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Сумма на счете:"+Klient1.getRemainingAmount());
            System.out.println("Введите сумму к выдаче:");


             try {
                 int sum=sc.nextInt();
                 Klient1.setAmount(20.000);
                 Klient1.setSum(6000);
             }
             catch (LimitExeption exeption){

                 System.out.println("  Вы можете получить остаток средств:" + getRemainingAmount());
                 System.out.println("Введите сумму к выдаче:");
                 int sum=sc.nextInt();
                 withDraw();


            };

        }

    }
}
