package com.bankAccount;

public class SavingsAccount extends Account implements Printable{
    private int interestRate;

    public SavingsAccount(String description, String IBAN, double balance, int interestRate) {
        super(description, IBAN, balance);
        this.interestRate = interestRate;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void print() {
        System.out.println("The current account has an IBAN " + getIBAN()
                + " having the following description '" + getDescription() + "'. With a balance of " + getBalance()
                + " and an interest rate of " + getInterestRate());
    }


}
