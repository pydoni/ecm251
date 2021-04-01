package Models;

import java.util.Random;

public class Transactions {


    public String QRCodeGenerator(User account, double value){

        // Function to generate QR code that get account id,name,
        // value of the transaction and generates a random transaction number


        int transactionNumber = getRandomNumberInRange();
        return account.getAccountId() + "; " + account.getName() + "; " + value + "; " + transactionNumber;
    }

    public void paymentByQRCode(User acc_payer, User acc_receiver, String qrcode){

        //Function that splits the qdcode info to transfer the value from the payer account to the receiver account

        String array[] = new String[4];
        array = qrcode.split(";");
        double bill = Double.parseDouble(array[2]);        

        if (verifyBalance(acc_payer, bill)){
            acc_receiver.setBalance(bill+acc_receiver.getBalance());
            acc_payer.setBalance(acc_payer.getBalance()-bill);

        } else System.out.println("Não há saldo para pagar!");

    }

    private boolean verifyBalance(User acc, double bill){

        // Function that verifies if the payer account has enough money to pay

        if (acc.getBalance() >= bill){
            return true;
        }
        else{
            return false;
        }
    }

    private static int getRandomNumberInRange(){

        // Function that generates a random integer

        Random r = new Random();
        return r.nextInt((9999-1000)) + 1000 ;
    }
}
