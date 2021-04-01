// Created by:
// Pedro Henrique Ferreira Dominichelli Fabris 19.02482-7
// Gabriel Marques Rangel da Silva 19.01288-8

package Models;

public abstract class Account {

    // this is an abstract class that carries two attributes

    private int accountId;
    private double balance;



    // Attributes encapsulation

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int account_id) {
        this.accountId = account_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }






}
