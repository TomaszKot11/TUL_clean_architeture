package com.tomaszkot.calculator;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Calculator calculator;

    public static void main(String[] args) {
        System.out.println("[Cmd/GUI] ?:");
        String mode = scanner.next().toLowerCase();
        // by default GUI mode
        calculator = mode.equals("cmd") ? new TextCalculator(scanner) : new GUICalculator();

        calculator.runCalculator();
        scanner.close();
    }
}