package com.app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers to display in the loop? (default 5): ");
        String input = scanner.nextLine();

        int count = 5;
        try {
            if (!input.isEmpty()) {
                count = Integer.parseInt(input);
                if (count <= 0) {
                    System.out.println("Invalid number, using default 5.");
                    count = 5;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, using default 5.");
        }

        printNumbers(count);
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
        }
    }
}