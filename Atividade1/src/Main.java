import Models.User;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        User ac1;
        User ac2;
        User ac3;
        String ac1n;
        String ac2n;
        String ac3n;

        ac1 = new User();
        ac2 = new User();
        ac3 = new User();

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o nome do usuario 1:");
        ac1n = read.next();
        ac1.createUser(ac1n, 192, ac1n+"@hotmail.com",0001,1000);

        System.out.println("Digite o nome do usuario 2:");
        ac2n = read.next();
        ac2.createUser(ac1n, 651, ac2n+"@hotmail.com",0002,1000);

        System.out.println("Digite o nome do usuario 3:");
        ac3n = read.next();
        ac3.createUser(ac1n, 938, ac3n+"@hotmail.com",0003,1000);
    }


}

