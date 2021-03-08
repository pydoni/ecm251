package Fabris.Dominichelli.Ferreira.Henrique.Pedro;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Conta c1 = new Conta();
        c1.setTitular("Vinicius Abe");
        c1.setCpf("939.382.213-93");
        c1.setNumero(6543);
        c1.setSaldo(1000.0);
        c1.setSenha(439);

        Conta c2 = new Conta();
        c2.setTitular("William Wonka");
        c2.setCpf("839.488.872-89");
        c2.setNumero(2643);
        c2.setSaldo(999999.99);
        c2.setSenha(908);

        Conta c3 = new Conta();
        c3.setTitular("Technoblade");
        c3.setCpf("143.298.398-13");
        c3.setNumero(1674);
        c3.setSaldo(135.32);
        c3.setSenha(198);

        ArrayList<Conta> listaDeContas = new ArrayList<>();

        listaDeContas.add(c1);
        listaDeContas.add(c2);
        listaDeContas.add(c3);

        System.out.println("Boa Tarde! Bem vindo ao banco!");
        System.out.println("Finja que tem um sistema de login funcional aqui");
        System.out.println("Número de conta:");
        Scanner contaValidada = new Scanner(System.in);
        System.out.println("Senha:");
        Scanner senhaValidada = new Scanner(System.in);


        /*boolean validacao = false;

        while(!validacao){
        for(int i=0; i<3;i++){
            if(listaDeContas.get(i).getNumero() == contaValidada.nextInt()){
                if(listaDeContas.get(i).getSenha() == senhaValidada.nextInt()){

                    validacao = true;



                }else{
                    System.out.println("Senha incorreta!!!");
                }

            }else{

                System.out.println("Conta não encontrada.");

            }
        }

        }*/



        System.out.println("Escolha a ação:");
        System.out.println("1-Ver saldo");
        System.out.println("2-Sacar dinheiro");
        System.out.println("3-Depositar dinheiro");
        System.out.println("4-transferir dinheiro");
        Scanner escolhaMenu = new Scanner(System.in);


        switch (escolhaMenu.nextInt()){
            case 1:
                System.out.println("Seu saldo é " + c1.getSaldo());
                break;
            case 2:
                c1.sacar();
            case 3:
                c1.depositar();
            case 4:
                c1.transferirDinheiro();
            default:
                System.out.println("");



        }
    }
}
