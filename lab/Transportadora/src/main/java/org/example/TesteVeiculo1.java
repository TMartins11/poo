package org.example;

import org.example.encapsulamento.versao1.Veiculo;

public class TesteVeiculo1 {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo(10000.0);

        System.out.println("Criando um veículo com carga máxima de: " + veiculo.cargaMaxima);

        System.out.println("Adicionando caixa número 1 (500kg)");
        veiculo.carga = veiculo.carga + 500.0;

        System.out.println("Adicionando caixa número 2 (250kg)");
        veiculo.carga = veiculo.carga + 250.0;

        System.out.println("Adicionando caixa número 3 (5000kg)");
        veiculo.carga = veiculo.carga + 5000.0;

        System.out.println("Adicionando caixa número 4 (4000kg)");
        veiculo.carga = veiculo.carga + 4000.0;

        System.out.println("Adicionando caixa número 5 (300kg)");
        veiculo.carga = veiculo.carga + 300.0;

        System.out.println("A carga do veículo é: " + veiculo.carga);

    }
}