package org.example;

import org.example.encapsulamento.versao3.Veiculo;

import java.util.Scanner;

public class TesteVeiculo3{
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        double pesoCaixa;
        double pesoTotal;
        char resposta = 0;

        System.out.println("Insira a carga máxima do veículo: ");
        pesoTotal = leitorTeclado.nextDouble();

        Veiculo veiculo = new Veiculo(pesoTotal);

        System.out.println("Criando veículo com carga máxima de:  " + veiculo.getCargaMaxima() + "kg.");

        do{
            System.out.println("Você deseja adicionar uma nova caixa? (S - SIM) , (N - NÃO): ");

            resposta = (char) leitorTeclado.next().trim().charAt(0);
            if(resposta == 'N'){
                break;
            }

            System.out.println("Informe o peso da caixa a ser adicionada (kg):  ");
            pesoCaixa = leitorTeclado.nextDouble();
            if(pesoCaixa > 0.0) {
                if (veiculo.adicionarCaixa(pesoCaixa)) {
                    System.out.println("Adicionando caixa com peso: " + pesoCaixa + "kg.");
                } else {
                    System.out.println("O veículo não pode receber essa caixa, pois ultrapassaria sua capacidade máxima!");
                }
            }else{
                System.out.println("É impossível que uma caixa não possua nenhum peso!");
            }
        }while(resposta != 'N');

        System.out.println("A carga total do veículo é: " + veiculo.getCarga() + "kg.");
    }
}