package com.tomaszkot.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Cmd/GUI] ?:");
        String mode = scanner.next().toLowerCase();
        // by default GUI mode
        Calculator calculator = mode.equals("cmd") ? new TextCalculator() : new GUICalculator();

        calculator.runCalculator();
    }
}