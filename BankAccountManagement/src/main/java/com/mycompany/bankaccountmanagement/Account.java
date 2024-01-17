/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccountmanagement;

import java.util.Scanner;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class Account {
     private int accNumber;
    private String accName;
    private double balance;

    public Account() {

    }

    public Account(int accNumber, String accName, double balance) {
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;
    }

    public void InputAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number:");
        accNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Name:");
        accName = sc.nextLine();
        System.out.print("Enter Account Balance:");
        balance = sc.nextDouble();
    }

    public int GetAccNum() {
        return accNumber;

    }

    public String GetAccName() {
        return accName;
    }

    public double GetBalace() {
        return balance;

    }

    public void Deposit(double money) {
        balance += money;
        System.out.println("Deposit successfull.Your balance:" + balance);
    }

    public void Withdraw(double money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("Withdraw successfull.Your balance:" + balance);
        } else {
            System.out.println("Your account does not have enough money");
        }
    }

    public void PrintAccount() {
        System.out.println("Account:" + accNumber + "-" + accName + "-" + balance);
    }

    public void TranferMoney(Account a, double money) {
        if (balance >= money) {
            balance -= money;
            a.balance += money;
            System.out.println("Tranfer successfull.Your balance:" + balance);
        } else {
            System.out.println("Your account does not have enough money");
        }
    }
}