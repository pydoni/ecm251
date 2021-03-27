package Models;

import java.util.Random;

public class Transactions {

    
    //TODO implementar a classe de transações
    public String QRCodeGenerator(User account, double value){
        int transaction_number = getRandomNumberInRange();
        return account.getAccount_id() + ", " + account.getName() + ", " + value + ", " + transaction_number;
    }

    private static int getRandomNumberInRange(){
        Random r = new Random();
        return r.nextInt((9999-1000)) + 1000 ;
    }
}
