package org.example;

import org.example.banco.Conta;

public class TesteBanco {
    public static void main(String[] args) {
        Conta conta = new Conta(1000.0);

        System.out.println("Criando a primeira conta com saldo de: R$" + conta.getSaldo());

        System.out.println("\nSacando R$250,00");
        conta.sacar(250.0);
        System.out.println("Depositando R$320,50");
        conta.depositar(320.50);
        System.out.println("Sacando R$120");
        conta.sacar(120.0);

        System.out.println("\nO saldo da conta é: " + conta.getSaldo());

        Conta conta2 = new Conta(50000.0);

        System.out.println("\nCriando a segunda conta com saldo de: R$" + conta2.getSaldo());

        System.out.println("\nSacando R$20000");
        conta2.sacar(20000.0);

        System.out.println("O saldo da conta é: R$" + conta2.getSaldo());
    }
}