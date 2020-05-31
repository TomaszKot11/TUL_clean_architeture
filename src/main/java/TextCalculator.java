import java.util.Scanner;

public class TextCalculator extends Calculator {
    private Scanner scanner = new Scanner(System.in);

    public double runCalculator() {
        System.out.println("Prosze wpisac pierwszy argument operacji:");
        String arg1 = scanner.next();
        System.out.println("Proszę wybrać operację (+, -, *, /)");
        String operation = scanner.next();
        System.out.println("Prosze wpisac drugi argument operacji:");
        String arg2 = scanner.next();
        return performOperataion(arg1, operation, arg2);
    }
}
