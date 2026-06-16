package com.learn.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(2000);
        bankAccount.withdraw(5000);
        System.out.println("Account Balance : "+bankAccount.getBalance());

    }
}
