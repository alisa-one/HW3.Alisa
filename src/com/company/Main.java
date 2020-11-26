package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitExeption {

        BankAccount Klient1 = new BankAccount();


        for (int i = 0; ; i++) {


            Klient1.deposit(20000);
            System.out.println("Рады приветствовать Вас!");
            System.out.println("----------------------------------------");

            for (int j = 0; ; j++) {
            System.out.println("Ваш текущий счет:  " + Klient1.getAmount() + " сом");
            System.out.println("----------------------------------------");
            System.out.println("Положите деньги на счет");
            System.out.println("Вносимая на счет сумма (сом):  ");
            Scanner AddSum = new Scanner(System.in);
            int AddSumm = AddSum.nextInt();
            Klient1.deposit(AddSumm);
            System.out.println("Ваш текущий счет:  " + Klient1.getAmount() + " сом");
            System.out.println("----------------------------------------");

                while (true) {
                    System.out.println("Запрашиваемая к выдаче сумма(сом) :  ");

                    try {
                        Scanner sc = new Scanner(System.in);
                        int sum = sc.nextInt();

                        Klient1.withDraw(sum);

                    } catch (LimitExeption exeption) {
                        System.out.println(exeption.getMessage());
                        Klient1.withDraw(Klient1.getAmount());
                        break;
                    }
                }
            }


        }
    }
}

