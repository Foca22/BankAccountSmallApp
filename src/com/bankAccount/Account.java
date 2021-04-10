package com.bankAccount;

public abstract class Account implements Printable{
    private String description;
    private String IBAN;
    private double balance;

    public Account(String description, String IBAN, double balance) {
        this.description = description;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
