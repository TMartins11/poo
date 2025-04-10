package org.example;

import org.example.encapsulamento.versao2.Veiculo;

public class TesteVeiculo2{
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(10000.0);

        System.out.println("Criando um veículo com carga máxima de: " + veiculo.getCargaMaxima());

        System.out.println("Adicionando caixa número 1 (500kg): " + veiculo.adicionarCaixa(500.0));


        System.out.println("Adicionando caixa número 2 (250kg): " + veiculo.adicionarCaixa(250.0));

        System.out.println("Adicionando caixa número 3 (5000kg): " + veiculo.adicionarCaixa(5000.0));

        System.out.println("Adicionando caixa número 4 (4000kg): " + veiculo.adicionarCaixa(4000.0));

        System.out.println("Adicionando caixa número 5 (300kg): " + veiculo.adicionarCaixa(300.0));

        System.out.println("A carga do veículo é: " + veiculo.getCarga());

    }
}