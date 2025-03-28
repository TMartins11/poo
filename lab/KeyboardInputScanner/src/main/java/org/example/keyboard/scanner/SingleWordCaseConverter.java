package org.example.keyboard.scanner;

import java.util.Scanner;

/**
 * Esse programa demonstra como ler uma única palavra digitada pelo usuário, com o uso da classe Scanner. Também
 * converte todos os caracteres da palavra para minúsculas e maiúsculas.*/
public class SingleWordCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to have all characters converted to lowercase and uppercase: ");
        String userInput = sc.next();
        String wordLowerCased = userInput.toLowerCase();
        String wordUpperCased = userInput.toUpperCase();

        System.out.println("Provided word: " + userInput);
        System.out.println("Provided word in lowercase: " + wordLowerCased);
        System.out.println("provided word in uppercase: " + wordUpperCased);
    }
}
