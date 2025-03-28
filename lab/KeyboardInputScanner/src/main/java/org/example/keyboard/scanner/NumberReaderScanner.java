package org.example.keyboard.scanner;

import java.util.Scanner;

/**
 * Esse programa demonstra como ler números de diferentes tipos: byte, short, int, long, float e double,
 * fazendo o uso da classe Scanner.
 * */
public class NumberReaderScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // -127 to 128
        System.out.print("Enter an integer number of type byte (8 bits): ");
        byte integerNumberByte = scanner.nextByte();
        System.out.println(integerNumberByte);

        // -32.768 to 32.767
        System.out.print("Enter an integer number of type short (16 bits): ");
        short integerNumberShort = scanner.nextShort();
        System.out.println(integerNumberShort);


        System.out.print("Enter an integer number of type int (32 bits): ");
        int integerNumberInt = scanner.nextInt();
        System.out.println(integerNumberInt);

        // -2.147.483.648 to 2.147.483.647
        System.out.print("Enter an integer number of type long (64 bits): ");
        long integerNumberLong = scanner.nextLong();
        System.out.println(integerNumberLong);

        // 1.175494351 E - 38 to 3,402823466 E + 38
        System.out.print("Enter an decimal number of type float (32 bits): ");
        float decimalNumberFloat = scanner.nextFloat();
        System.out.println(decimalNumberFloat);

        // ±1.7976931348623157 × 10^308
        System.out.print("Enter an decimal number of type double (64 bits): ");
        double decimalNumberDouble = scanner.nextDouble();
        System.out.println(decimalNumberDouble);
    }
}
