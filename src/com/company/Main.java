package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitExeption {

        BankAccount Klient1 = new BankAccount();

        Klient1.deposit(20000);
        System.out.println("Ваш счет:  " + Klient1.getAmount() + "сом");


        while (true) {

            try {
                Scanner sc = new Scanner();
                int sum = sc.nextInt();
                System.out.println("Запрашиваемая сумма: " + sum);

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
