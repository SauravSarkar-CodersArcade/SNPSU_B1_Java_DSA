package com.cs_is.oops.staticExample;
public class Account {
    int accountNo;
    static int totalAccounts;
    Account(){
        totalAccounts++;
        accountNo = totalAccounts;
    }
    static void showTotalAccounts(){
        System.out.println("Total Accounts: " + totalAccounts);
    }
}
class StaticExample{
    public static void main(String[] args) {
        new Account();
        new Account();
        new Account();
        Account.showTotalAccounts();
    }
}
