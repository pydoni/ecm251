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

        System.out.println("Digite o nome do usuario 1:");
        ac1n = read.next();
        ac1.createUser(ac1n, 192, ac1n+"@hotmail.com",0001,1000);

        System.out.println("Digite o nome do usuario 2:");
        ac2n = read.next();
        ac2.createUser(ac2n, 651, ac2n+"@hotmail.com",0002,250);

        System.out.println("Digite o nome do usuario 3:");
        ac3n = read.next();
        ac3.createUser(ac3n, 938, ac3n+"@hotmail.com",0003,3000);


        //Exibition of the accounts in their primary state
        System.out.println("Estado Inicial:");
        ac1.showProfile();
        System.out.println(" ");
        ac2.showProfile();
        System.out.println(" ");
        ac3.showProfile();

        //All transactions fot testing

        String qr_code1 = transactions.QRCodeGenerator(ac1, 250);
        System.out.println(qr_code1);
        transactions.paymentByQRCode(ac2, ac1, qr_code1);
        transactions.paymentByQRCode(ac3, ac1, qr_code1);
        transactions.paymentByQRCode(ac2, ac1, qr_code1);
        String qr_code2 = transactions.QRCodeGenerator(ac2, 1000);
        transactions.paymentByQRCode(ac3, ac2, qr_code2);

        //Exibition of updated balance value from the accounts
        System.out.println("Estado Final:");
        ac1.showProfile();
        System.out.println(" ");
        ac2.showProfile();
        System.out.println(" ");
        ac3.showProfile();

    }



}

