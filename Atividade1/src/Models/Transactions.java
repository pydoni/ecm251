package Models;

import java.util.Random;

public class Transactions {

    
    //TODO implementar a classe de transações



    public static int getRandomNumberInRange(){
        Random r = new Random();
        return r.nextInt((9999-1000)) + 1000 ;
    }
}
