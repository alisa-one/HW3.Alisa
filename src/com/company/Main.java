package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount Klient1 = new BankAccount();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Сумма на счете:"+Klient1.getRemainingAmount());
            System.out.println("Введите сумму к выдаче:");
            int sum=sc.nextInt();
             try {Klient1.setAmount(20000)}
             catch {
                throw new LimitExeption()

            };
            Klient1.setSum(6000);
        }
    }
}
