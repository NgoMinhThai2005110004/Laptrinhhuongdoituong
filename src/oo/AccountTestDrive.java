package oo;

public class AccountTestDrive{

    public static void main(String[] args) {
        Account account = new Account();

        account.show();
        account.deposite(600000);
        account.show();
        account.withdraw(400000);
        account.show();
    }
}
