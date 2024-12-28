package org.example;

import java.util.Scanner;

public class App {

    public static int countDigits(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int digitCount = countDigits(input);

        System.out.println("Количество цифр в строке: " + digitCount);
        scanner.close();
    }
}
