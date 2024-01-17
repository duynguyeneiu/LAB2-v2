/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccountmanagement;

import java.util.*;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class BankAccountManagement {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Account> list=new ArrayList<Account>();
        System.out.print("Enter Number Account: ");
        int numberOfAccount=sc.nextInt();
        for(int i=0;i<numberOfAccount;i++){
            Account acc  =new Account();
            acc.InputAccount();
            list.add(acc);
        }
        PrintListAccount(list);
        list.get(0).Deposit(10000);
        list.get(1).Withdraw(20000);
        list.get(0).TranferMoney(list.get(1),50000 );
        PrintListAccount(list);
    }
    public static void PrintListAccount(ArrayList<Account> list){
        for (Account acc:list)
            acc.PrintAccount();
    }
    
}