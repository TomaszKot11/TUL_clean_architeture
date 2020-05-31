package main.java.com.tomaszkot.calculator;

public abstract class Calculator {
    public abstract void runCalculator();

    protected double performOperataion(String arg1, String op, String arg2) {
        double arg1Double = str2Double(arg1); // c++ style in Java <3
        double arg2Double = str2Double(arg2);

        switch(op) {
            case "+":
                return arg1Double + arg2Double;
            case "*":
                return arg1Double * arg2Double;
            case "/":
                return arg1Double / arg2Double;
            case "-":
                return arg1Double - arg2Double;
            default:
                System.out.println("Nie ma takiej operacji jak" + op + "!");
                return 0.0;
        }
    }

    protected double str2Double(String arg) {
        double parsed = 0.0;
        try {
            parsed = Double.parseDouble(arg);
        } catch(NumberFormatException ex) {
            System.out.println("Argument is not numeric!");
            System.exit(1);
        }
        return parsed;
    }
}
