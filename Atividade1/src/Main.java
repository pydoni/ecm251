// Created by:
// Pedro Henrique Ferreira Dominichelli Fabris 19.02482-7
// Gabriel Marques Rangel da Silva 19.01288-8

import Models.User;
import Models.Transactions;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        // Creating all the accounts
        User ac1;
        User ac2;
        User ac3;
        String ac1n;
        String ac2n;
        String ac3n;

        Transactions transactions = new Transactions();

        ac1 = new User();
        ac2 = new User();
        ac3 = new User();

        Scanner read = new Scanner(System.in);

        System.out.println("Type the name of the first user:");
        ac1n = read.next();
        ac1.createUser(ac1n, 192, ac1n+"@hotmail.com",0001,1000);

        System.out.println("Type the name of the second user:");
        ac2n = read.next();
        ac2.createUser(ac2n, 651, ac2n+"@hotmail.com",0002,250);

        System.out.println("Type the name of the third user:");
        ac3n = read.next();
        ac3.createUser(ac3n, 938, ac3n+"@hotmail.com",0003,3000);


        //Exibition of the accounts in their primary state
        System.out.println("Initial state:");
        ac1.showProfile();
        System.out.println(" ");
        ac2.showProfile();
        System.out.println(" ");
        ac3.showProfile();

        //All transactions fot testing

        String qrCode1 = transactions.QRCodeGenerator(ac1, 250);
        System.out.println(qrCode1);
        transactions.paymentByQRCode(ac2, ac1, qrCode1);
        transactions.paymentByQRCode(ac3, ac1, qrCode1);
        transactions.paymentByQRCode(ac2, ac1, qrCode1);
        String qrCode2 = transactions.QRCodeGenerator(ac2, 1000);
        transactions.paymentByQRCode(ac3, ac2, qrCode2);

        //Exibition of updated balance value from the accounts
        System.out.println("Final state:");
        ac1.showProfile();
        System.out.println(" ");
        ac2.showProfile();
        System.out.println(" ");
        ac3.showProfile();

    }



}

