package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitExeption {

        BankAccount Klient1 = new BankAccount();

        Klient1.deposit(20000);

        System.out.println("Ваш текущий счет:  " + Klient1.getAmount() + " сом");
        System.out.println("Вносимая на счет сумма (сом):  ");
        Scanner AddSum = new Scanner(System.in);
        int AddSumm = AddSum.nextInt();
        Klient1.deposit(AddSumm);


        while (true) {
            System.out.println("Запрашиваемая к выдаче сумма(сом) :  ");

            try {
                Scanner sc = new Scanner(System.in);
                int sum = sc.nextInt();

                Klient1.withDraw(sum);

            }
            catch (LimitExeption exeption) {
                System.out.println(exeption.getMessage());
                Klient1.withDraw(Klient1.getAmount());
                break;
            }
        }
    }
}
