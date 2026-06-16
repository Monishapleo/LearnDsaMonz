package com.learn.oops.encapsulation;

public class BankAccount {
    private double balance;

    public void deposit(double amount){
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount of rupees : "+amount+"has deposited successfully");
            System.out.println("Current balance : "+balance);
        }
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Amount of rupees : "+amount+" has withdraw successfully");
            System.out.println("Current balance : "+balance);

        }else{
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}
