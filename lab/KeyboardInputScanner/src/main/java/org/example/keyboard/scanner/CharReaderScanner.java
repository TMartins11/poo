package org.example.keyboard.scanner;

import java.util.Scanner;

/**
 * Este programa demonstra como ler um caractere inserido pelo usuário usando a classe Scanner.
 * O loop continua até o usuário digitar a letra 'q' para sair.
 */
public class CharReaderScanner {
    public static void main(String[] args) {
        // Variável para armazenar o caractere digitado pelo usuário
        char input = 0;

        // Loop Do-While: o programa continuará até o usuário digitar 'q' para sair
        do {
            // Criação de um objeto Scanner, que lê dados de (System.in) - Método padrão para obter entrada do teclado.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a char (q to exit): ");

            // Lê o próximo caractere inserido pelo usuário
            // .next() lê a próxima palavra
            // .trim() remove espaços extras
            // .charAt(0) pega o primeiro caractere da palavra lida
            input = (char) scanner.next().trim().charAt(0);

            System.out.println(input);
        } while (input != 'q');
    }
}