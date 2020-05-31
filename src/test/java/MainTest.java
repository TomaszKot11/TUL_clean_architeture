import com.tomaszkot.calculator.GUICalculator;
import com.tomaszkot.calculator.Main;
import com.tomaszkot.calculator.TextCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class MainTest {

    @Test
    public void shouldInitializeCalculatorWithTextCalulcatorWhenCmdProvided() {
        Main.scanner = new Scanner("cmd\nN\n");
        Main.main(null);
        Assert.assertTrue(Main.calculator instanceof TextCalculator);
    }


    @Test
    public void shouldInitializeCalculatorWithGUICalulcatorWhenGUIProvided() {
        Main.scanner = new Scanner("GUI");
        Main.main(null);
        Assert.assertTrue(Main.calculator instanceof GUICalculator);
    }
}
