package com.mbarra.exercises.exerciseone;

public class AccountLogic {

    public static void exerciseOne() {
        Account accountOne = new Account("Martha Barra");
        Account accountTwo = new Account("Gustavo Claros", 1000);

        accountOne.deposit(1000);
        accountTwo.deposit(1000);

        accountOne.withdraw(500);
        accountTwo.withdraw(500);

        System.out.println(accountOne);
        System.out.println(accountTwo);

    }
}
