package oo;

public class Account {
    // Data    
        int account_number = 22221;
        int account_balance = 141000;
            
    // Function
        void show(){
        System.out.println("Thong tin tai khoan: ");
        System.out.println("Account Number: " +account_number);
        System.out.println("Account Balance: " +account_balance);
        }
    
        void deposite (int depositeAmount){
            account_balance +=depositeAmount;
        }
    
        void withdraw (int withdrawAmount){
            account_balance -=withdrawAmount;
        }
    }