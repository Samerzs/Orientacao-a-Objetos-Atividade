package Atividade04;

import java.util.Scanner;

public class ContaBancaria {

    java.util.Scanner entrada = new Scanner(System.in);

    private String titular;
    private double saldo;


    public ContaBancaria() {

    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar() {
        System.out.println("Digite a quantia que deseja depositar na conta: ");
        double deposito = entrada.nextDouble();
        if(deposito >= 0) {
            this.saldo += deposito;
            System.out.println("Seu deposito foi de : R$ " +deposito);
        }else {
            System.out.println("não podemos fazer um depósito de número negativo!");
        }
    }
    public void sacar() {
        System.out.println("Digite a quantia que deseja sacar da conta: ");
        double saque = entrada.nextDouble();
        if(saque >= 0) {
            this.saldo -= saque;
            System.out.println("Seu saque foi de : R$ " +saque);
        }else {
            System.out.println("não podemos fazer um saque de número negativo!");
        }
    }

    public void exibirSaldo() {

        System.out.println("o saldo atual da conta é de: R$ " +getSaldo());
    }



}