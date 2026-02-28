package com.cs_is.oops.innerClasses.memberInnerClass;
public class BankAccount {
    private double balance = 10000;
    // Member Inner Class
    class Transaction{
        void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }else {
                System.out.println("Insufficient Funds.");
            }
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        // Outer.Inner in_object = out_object.new Inner();
        BankAccount.Transaction tx = account.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(2000);
        System.out.println(account.balance);
    }
}
/*
ℹ Points to remember
⭐ Transaction belongs to specific account
⭐ Direct access to private variable balance
⭐ Clean encapsulation
 */
