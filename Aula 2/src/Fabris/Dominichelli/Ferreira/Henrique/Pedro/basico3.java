package Fabris.Dominichelli.Ferreira.Henrique.Pedro;

import java.util.Random;

public class basico3 {
    public static void main(String[] args) {

        int limite = 10;
        int contador;
        for(contador = 0; contador < limite; contador++){
            System.out.println("Contador:" + contador);
        }

        int senha = 42;

        Random sorteador = new Random();
        int chute = sorteador.nextInt(99);
        int tentativas = 0;
        while(chute != senha){
            System.out.println("Tentativa:" + tentativas);
            System.out.println("Chute:" + chute);
            chute = sorteador.nextInt(99);
            tentativas++;
        }
        System.out.println("Parabens Hackerman!");
    }
}
