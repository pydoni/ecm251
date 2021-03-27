package Models;

import java.util.Random;

public class Transactions {

    
    //TODO implementar a classe de transações
    public String QRCodeGenerator(User account, double value){
        int transaction_number = getRandomNumberInRange();
        return account.getAccount_id() + "; " + account.getName() + "; " + value + "; " + transaction_number;
    }

    public void paymentByQRCode(User acc_payer, User acc_receiver, String qrcode){
        String array[] = new String[4];
        array = qrcode.split(";");
        double bill = Double.parseDouble(array[2]);        

        if (verifyBalance(acc_payer, bill)){
            acc_receiver.setBalance(bill+acc_receiver.getBalance());
            acc_payer.setBalance(acc_payer.getBalance()-bill);

        } else System.out.println("Não há saldo para pagar!");

    }

    private boolean verifyBalance(User acc, double bill){
        if (acc.getBalance() >= bill){
            return true;
        }
        else{
            return false;
        }
    }

    private static int getRandomNumberInRange(){
        Random r = new Random();
        return r.nextInt((9999-1000)) + 1000 ;
    }
}
