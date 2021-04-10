package com.bankAccount;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class AccountHolder implements Printable{
    private String firstName;
    private String lastName;
    private List<Account> accounts;

    public AccountHolder(String firstName, String lastName, List<Account> accounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = accounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public void print() {
        System.out.println("The following person - " + getFirstName() + " " + getLastName()
                + " has the following accounts: ");
        Iterator<Account> accountIterator = accounts.iterator();
        for (Account account : accounts) {
            System.out.println(accountIterator.next().getDescription());

        }
    }

}
