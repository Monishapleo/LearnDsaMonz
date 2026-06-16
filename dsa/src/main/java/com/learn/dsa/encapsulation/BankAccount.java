package com.learn.dsa.encapsulation;

public class BankAccount {
    private double balance = 2 ;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double deposit(double amount){
        return balance+amount;
    }

    private Object withdraw(double amount){
        if(amount<=0){
            return "Withdraw amount must be greater than 0";
        }
        if(amount>balance){
            return "Insufficient amount ";
        }
        return balance-amount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount();
        System.out.println(bankAccount.withdraw(10));
        System.out.println(bankAccount.deposit(10));
    }
}
