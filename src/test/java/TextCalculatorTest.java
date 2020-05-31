package test.java;
import com.tomaszkot.calculator.Calculator;
import com.tomaszkot.calculator.TextCalculator;
import org.junit.*;
import org.mockito.Mock;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TextCalculatorTest {
    private TextCalculator textCalculator;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Before
    public void beforeEachTestMethod() {
        textCalculator = new TextCalculator();
    }

    @Test
    public void performOperationForAdditionShouldReturnProperResult() {
        Scanner scanner = new Scanner("Y\n1\n+\n1\nN\n");
        textCalculator.setScanner(scanner);
        textCalculator.runCalculator();
        assertTrue(outContent.toString().contains("Result: 2.0"));
    }

    @Test
    public void performOperationForSubtractionShouldReturnProperResult() {
        Scanner scanner = new Scanner("Y\n3\n-\n2\nN\n");
        textCalculator.setScanner(scanner);
        textCalculator.runCalculator();
        assertTrue(outContent.toString().contains("Result: 1.0"));
    }

    @Test
    public void performOperationForMultiplicationShouldReturnProperResult() {
        Scanner scanner = new Scanner("Y\n3\n*\n2\nN\n");
        textCalculator.setScanner(scanner);
        textCalculator.runCalculator();
        assertTrue(outContent.toString().contains("Result: 6.0"));
    }


    @Test
    public void performOperationForDivisionShouldReturnProperResult() {
        Scanner scanner = new Scanner("Y\n6\n/\n2\nN\n");
        textCalculator.setScanner(scanner);
        textCalculator.runCalculator();
        assertTrue(outContent.toString().contains("Result: 3.0"));
    }


    @Test
    public void performOperationForUnknownShouldReturnProperResult() {
        Scanner scanner = new Scanner("Y\n3\n&\n2\nN\n");
        textCalculator.setScanner(scanner);
        textCalculator.runCalculator();
        assertTrue(outContent.toString().contains("Nie ma takiej operacji jak &!"));
    }

    @Test
    public void performOperationShouldRaiseExceptionWhenNotDoubleArguments() {
        Scanner scanner = new Scanner("Y\nT\nT\nT\nN\n");
        textCalculator.setScanner(scanner);
        textCalculator.runCalculator();
        assertTrue(outContent.toString().contains("Argument is not numeric!"));
    }

    @Test
    public void performOperationShouldReturnZeroForNotNumericArguments() {
        Scanner scanner = new Scanner("Y\nT\n+\nT\nN\n");
        textCalculator.setScanner(scanner);
        textCalculator.runCalculator();
        assertTrue(outContent.toString().contains("Result: 0.0"));
    }
}

