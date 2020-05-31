import com.tomaszkot.calculator.GUICalculator;
import com.tomaszkot.calculator.TextCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GUICalculatorTest {
    /*
    Testowanie GUI jest trudne stąd autor pozostawił
    klasę z jedynie podstawowymi testami
     */
    GUICalculator guiCalculator;
    @Before
    public void beforeEachTestMethod() {
        guiCalculator = new GUICalculator();
    }


    // przykładowy test mnozenia "z palca"
    @Test
    public void shouldProperlyAddTwoNumbers() {
        // when
        guiCalculator.getBtn2().doClick();
        guiCalculator.getBtnMul().doClick();
        guiCalculator.getBtn3().doClick();
        guiCalculator.getBtnEqual().doClick();

        // then
        assertTrue(guiCalculator.getInText().getText().equals("6"));
    }

    // przykład testowania dzielenia przez zero
    @Test
    public void shouldProperlyHandleDivisionByZero() {
        // when
        guiCalculator.getBtn2().doClick();
        guiCalculator.getBtnDiv().doClick();
        guiCalculator.getBtn0().doClick();
        guiCalculator.getBtnEqual().doClick();

        // then
        assertTrue(guiCalculator.getInText().getText().equals("Infinity"));
    }

    @Test
    public void numeric9BtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtn9());
    }

    @Test
    public void numeric8BtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtn8());
    }

    @Test
    public void numeric7BtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtn7());
    }

    @Test
    public void numeric6BtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtn6());
    }

    @Test
    public void numeric5BtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtn5());
    }

    @Test
    public void numeric4BtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtn4());
    }

    @Test
    public void numeric3BtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtn3());
    }

    @Test
    public void numeric2BtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtn2());
    }

    @Test
    public void numeric1BtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtn1());
    }

    @Test
    public void numeric0BtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtn0());
    }

    // function buttons
    @Test
    public void equalBtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtnEqual());
    }

    @Test
    public void divideBtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtnDiv());
    }

    @Test
    public void multiplyBtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtnMul());
    }

    @Test
    public void subtractBtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtnSub());
    }

    @Test
    public void addBtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtnAdd());
    }

    @Test
    public void pointBtnShouldBeInitialized() {
        assertNotNull(guiCalculator.getBtnPoint());
    }

    // test action listeners
    @Test
    public void btn0ListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtn0().getActionListeners().length == 1);
    }

    @Test
    public void btn9ListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtn9().getActionListeners().length == 1);
    }

    @Test
    public void btn8ListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtn8().getActionListeners().length == 1);
    }

    @Test
    public void btn7ListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtn7().getActionListeners().length == 1);
    }

    @Test
    public void btn6ListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtn6().getActionListeners().length == 1);
    }

    @Test
    public void btn5ListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtn5().getActionListeners().length == 1);
    }

    @Test
    public void btn4ListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtn4().getActionListeners().length == 1);
    }

    @Test
    public void btn3ListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtn3().getActionListeners().length == 1);
    }

    @Test
    public void btn2ListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtn2().getActionListeners().length == 1);
    }

    @Test
    public void btn1ListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtn1().getActionListeners().length == 1);
    }

    @Test
    public void btnEqualListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtnEqual().getActionListeners().length == 1);
    }

    @Test
    public void btnAddListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtnAdd().getActionListeners().length == 1);
    }

    @Test
    public void btnSubstractListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtnSub().getActionListeners().length == 1);
    }

    @Test
    public void btnPointListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtnPoint().getActionListeners().length == 1);
    }

    @Test
    public void btnDivideListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtnDiv().getActionListeners().length == 1);
    }

    @Test
    public void btnMultiplyListenerShouldBeInitialzied() {
        assertTrue(guiCalculator.getBtnMul().getActionListeners().length == 1);
    }
}
