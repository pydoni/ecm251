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
