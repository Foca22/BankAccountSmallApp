package com.bankAccount;

import java.util.PriorityQueue;

public class CurrentAccount extends Account implements Printable {
    private boolean overdraft;

    public CurrentAccount(String description, String IBAN, double balance, boolean overdraft) {
        super(description, IBAN, balance);
        this.overdraft = overdraft;
    }

    public boolean isOverdraft() {
        return overdraft;
    }

    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void print() {
        if(isOverdraft() == true){
            System.out.println("The current account has an IBAN " + getIBAN()
                    + " having the following description: '" + getDescription() + "'. With a balance of " + getBalance()
                    + " and an enabled overdraft.");
        }
        else {
            System.out.println("The current account has an IBAN " + getIBAN()
                    + " having the following description '" + getDescription() + "'. With a balance of " + getBalance()
                    + " and an disabled overdraft.");
        }

    }
}
