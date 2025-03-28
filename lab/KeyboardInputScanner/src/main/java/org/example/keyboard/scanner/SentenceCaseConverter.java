package org.example.keyboard.scanner;

import java.util.Scanner;

/**
 * Esse programa demonstra como ler uma frase digitada pelo usuário, utilizando a classe Scanner.
 * Também converte a frase lida para minúsculas e maiúsculas, passando a frase como objeto String,
 * para que seja possivel utilizar os métodos toUpperCase e toLowerCase.
 * */
public class SentenceCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence (phrase) to have all characters converted to lowercase and uppercase: ");
        String userInput = sc.nextLine();
        String lowerCasedSentence = userInput.toLowerCase();
        String upperCasedSentence = userInput.toUpperCase();

        System.out.println("The provided sentence: " + userInput);
        System.out.println("The transformed sentence with all the characters in lowercase: " + lowerCasedSentence);
        System.out.println("The transformed sentence with all the characters in uppercase: " + upperCasedSentence);
    }
}
