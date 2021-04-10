package com.bankAccount;

import java.util.Arrays;

public class AccountApp {

    public static void main(String[] args) {

        CurrentAccount currentAccountForJohnDoe = new CurrentAccount("Salary", "ROING1650561888", 200, true);
        CurrentAccount currentAccountForJaneDoe = new CurrentAccount("Salary", "ROING1659879489", 500, false);

        SavingsAccount savingsAccount = new SavingsAccount("Economies", "ROING2598654", 1000, 2);

        AccountHolder accountHolder1 = new AccountHolder("John", "Doe", Arrays.asList(currentAccountForJohnDoe, savingsAccount));
        AccountHolder accountHolder2 = new AccountHolder("Jane", "Doe", Arrays.asList(currentAccountForJaneDoe, savingsAccount));


        System.out.println("Print current account for John Doe: ");
        currentAccountForJohnDoe.print();
        System.out.println("=========================");

        System.out.println("Print current account for Jane Doe: ");
        currentAccountForJohnDoe.print();
        System.out.println("=========================");

        System.out.println("Print savings account: ");
        savingsAccount.print();
        System.out.println("=========================");

        System.out.println("Print account holder John: ");
        accountHolder1.print();
        System.out.println("=========================");

        System.out.println("Print account holder Jane: ");
        accountHolder2.print();
        System.out.println("=========================");


        System.out.println("The deposit of John and Jane has reached: " + printDeposit(savingsAccount));
    }

    private static double printDeposit(SavingsAccount savingsAccount) {
        double deposit;
        deposit = (savingsAccount.getBalance() + savingsAccount.getInterestRate()) * 3;
        return deposit;
    }
}
