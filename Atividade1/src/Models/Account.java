package Models;

public abstract class Account {

    // this is an abstract class that carries two attributes

    private int account_id;
    private double balance;



    // Attributes encapsulation

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }






}
