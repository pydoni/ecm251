package Fabris.Dominichelli.Ferreira.Henrique.Pedro;

public class basico2 {
    public static void main(String[] args) {
        int ano = 2020;

        if (ano % 2 == 0) {
            System.out.println("Ano Par");
        } else {
            System.out.println("Ano Impar!");
        }

        switch (ano) {
            case 2020:
                System.out.println("Vixi!");
                break;
            case 1996:
                System.out.println("Pokemon!");
                break;
            default:
                System.out.println("Segue!");
                break;
        }
    }
}
