package com.tomaszkot.calculator;

import java.util.Scanner;

public class TextCalculator extends Calculator {
    private Scanner scanner;

    public TextCalculator(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runCalculator() {
        while (true) {
            System.out.println("Czy chcesz liczyc dalej [Y/N]");
            if(scanner.next().toLowerCase().equals("n"))
                break;
            System.out.println("Prosze wpisac pierwszy argument operacji:");
            String arg1 = scanner.next();
            System.out.println("Proszę wybrać operację (+, -, *, /)");
            String operation = scanner.next();
            System.out.println("Prosze wpisac drugi argument operacji:");
            String arg2 = scanner.next();
            System.out.println("Result: " + performOperataion(arg1, operation, arg2));
        }
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
