package Fabris.Dominichelli.Ferreira.Henrique.Pedro;
import  java.util.Scanner;

public class Conta {

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    String titular;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    String cpf;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    int numero;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double saldo;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    private int senha;


    void visualizarSaldo() {
        System.out.println(getSaldo());
    }

    void sacar() {
        System.out.println("Digite o valor a ser sacado");
        Scanner valorSacado = new Scanner(System.in);

        double novoSaldo = getSaldo() - valorSacado.nextDouble();

        setSaldo(novoSaldo);
    }

    void depositar(){

        System.out.println("Digite o valor a ser sacado");
        Scanner valorDepositado = new Scanner(System.in);

        double novoSaldo = getSaldo() - valorDepositado.nextDouble();

        setSaldo(novoSaldo);

    }

    void transferirDinheiro(){
        System.out.println("Escolha uma conta para transferir dinheiro:");
        System.out.println("");

    }

}
