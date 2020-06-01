package com.tomaszkot.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class GUICalculator extends Calculator {
    private static final int WINDOW_WIDTH = 410;
    private static final int WINDOW_HEIGHT = 600;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 70;
    private static final int MARGIN_X = 20;
    private static final int MARGIN_Y = 60;

    private JFrame window;
    private JTextField inText;
    private JButton btnDiv, btn7, btn8, btn9,
            btnMul, btn4, btn5, btn6, btnSub, btn1, btn2, btn3, btnAdd, btnPoint, btn0, btnEqual;
    private String opt;
    private boolean go = true;
    private boolean addWrite = true;
    private double val = 0;
    private Font btnFont;
    private Font smallTxtBtnFont;
    private int j = -1;
    private int k = -1;
    private int[] x = {MARGIN_X, MARGIN_X + 90, 200, 290, 380};
    private int[] y = {MARGIN_Y, MARGIN_Y + 100, MARGIN_Y + 180, MARGIN_Y + 260, MARGIN_Y + 340, MARGIN_Y + 420};


    public GUICalculator() {
        window = new JFrame("main.java.com.tomaszkot.calculator.Calculator");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Set the width and the Height of the window
        window.setLocationRelativeTo(null); // Move Window To Center

        initializeButtons();
        configureBtnFonts();
        configureNumbersBtnListeners();
        configureFunctionalBtnListeners();
        drawButtonsInWindow();

        inText = new JTextField("0");
        inText.setBounds(x[0], y[0], 350, 70);
        inText.setEditable(false);
        inText.setBackground(Color.WHITE);
        inText.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        window.add(inText);
    }

    private void configureBtnFonts() {
        btnFont = new Font("Comic Sans MS", Font.PLAIN, 28);
        smallTxtBtnFont = new Font("Comic Sans MS", Font.PLAIN, 24);
    }

    private void initializeButtons() {
        btn0 = new JButton("0");
        btn3 = new JButton("3");
        btn2 = new JButton("2");
        btn4 = new JButton("4");
        btn7 = new JButton("7");
        btn1 = new JButton("1");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btnDiv = new JButton("/");
        btnMul = new JButton("*");
        btnSub = new JButton("-");
        btnAdd = new JButton("+");
        btnPoint = new JButton(".");
        btnEqual = new JButton("=");
    }

    private void drawButtonsInWindow() {
        window.add(btn0);
        window.add(btn1);
        window.add(btn2);
        window.add(btn3);
        window.add(btn4);
        window.add(btn5);
        window.add(btn6);
        window.add(btn7);
        window.add(btn8);
        window.add(btn9);
        window.add(btnDiv);
        window.add(btnMul);
        window.add(btnSub);
        window.add(btnAdd);
        window.add(btnPoint);
        window.add(btnEqual);

    }

    private void configureNumbersBtnListeners() {
        calculatorBtnListenerConfig(btn0, x[1], y[5], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("0");
                } else {
                    inText.setText(inText.getText() + "0");
                }
            } else {
                inText.setText("0");
                addWrite = true;
            }
            go = true;
        });

        calculatorBtnListenerConfig(btn3, x[2], y[4], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("3");
                } else {
                    inText.setText(inText.getText() + "3");
                }
            } else {
                inText.setText("3");
                addWrite = true;
            }
            go = true;
        });

        calculatorBtnListenerConfig(btn2, x[1], y[4], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
                    if (addWrite) {
                        if (Pattern.matches("[0]*", inText.getText())) {
                            inText.setText("2");
                        } else {
                            inText.setText(inText.getText() + "2");
                        }
                    } else {
                        inText.setText("2");
                        addWrite = true;
                    }
                    go = true;
        });

        calculatorBtnListenerConfig(btn4, x[0], y[3], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("4");
                } else {
                    inText.setText(inText.getText() + "4");
                }
            } else {
                inText.setText("4");
                addWrite = true;
            }
            go = true;
        });

        calculatorBtnListenerConfig(btn7, x[0], y[2], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("7");
                } else {
                    inText.setText(inText.getText() + "7");
                }
            } else {
                inText.setText("7");
                addWrite = true;
            }
            go = true;
        });

        calculatorBtnListenerConfig(btn1, x[0], y[4], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("1");
                } else {
                    inText.setText(inText.getText() + "1");
                }
            } else {
                inText.setText("1");
                addWrite = true;
            }
            go = true;
        });

        calculatorBtnListenerConfig(btn8, x[1], y[2], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("8");
                } else {
                    inText.setText(inText.getText() + "8");
                }
            } else {
                inText.setText("8");
                addWrite = true;
            }
            go = true;
        });

        calculatorBtnListenerConfig(btn9, x[2], y[2], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("9");
                } else {
                    inText.setText(inText.getText() + "9");
                }
            } else {
                inText.setText("9");
                addWrite = true;
            }
            go = true;
        });

        calculatorBtnListenerConfig(btn5, x[1], y[3], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("5");
                } else {
                    inText.setText(inText.getText() + "5");
                }
            } else {
                inText.setText("5");
                addWrite = true;
            }
            go = true;
        });

        calculatorBtnListenerConfig(btn6, x[2], y[3], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("6");
                } else {
                    inText.setText(inText.getText() + "6");
                }
            } else {
                inText.setText("6");
                addWrite = true;
            }
            go = true;
        });
    }

    private void calculatorBtnListenerConfig(JButton btn, int x, int y, int width, int height, ActionListener al) {
        btn.setBounds(x, y, width, height);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn.addActionListener(al);

    }

    private void configureFunctionalBtnListeners() {
        calculatorBtnListenerConfig(btnDiv, x[0], y[1], 3*BUTTON_WIDTH + 20, BUTTON_HEIGHT, event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    opt = opt == null ? "+" : opt;
                    val = performOperataion(Double.toString(val), opt, inText.getText());
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }
                    opt = "/";
                    go = false;
                    addWrite = false;
                } else {
                    opt = "/";
                }
        });

        calculatorBtnListenerConfig(btnMul, x[3], y[1], BUTTON_WIDTH, 2*BUTTON_HEIGHT + 10, event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    opt = opt == null ? "+" : opt;
                    val = performOperataion(Double.toString(val), opt, inText.getText());
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }
                    opt = "*";
                    go = false;
                    addWrite = false;
                } else {
                    opt = "*";
                }
        });

        calculatorBtnListenerConfig(btnSub, x[3], y[3], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            ;
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    opt = opt == null ? "-" : opt;
                    val = performOperataion(Double.toString(val), opt, inText.getText());
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }

                    opt = "-";
                    go = false;
                    addWrite = false;
                } else {
                    opt = "-";
                }
        });

        calculatorBtnListenerConfig(btnAdd, x[3], y[4], BUTTON_WIDTH, 2*BUTTON_HEIGHT+10, event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    opt = opt == null ? "+" : opt;
                    val = performOperataion(Double.toString(val), opt, inText.getText());
                    String elo = inText.getText();
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }
                    opt = "+";
                    go = false;
                    addWrite = false;
                } else {
                    opt = "+";
                }
        });

        calculatorBtnListenerConfig(btnPoint, x[0], y[5], BUTTON_WIDTH,  BUTTON_HEIGHT, event -> {
            if (addWrite) {
                inText.setText(inText.getText() + ".");
            } else {
                inText.setText("0.");
                addWrite = true;
            }
            go = true;
        });

        calculatorBtnListenerConfig(btnEqual, x[2], y[5], BUTTON_WIDTH, BUTTON_HEIGHT, event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    opt = opt == null ? "=" : opt;
                    val = performOperataion(Double.toString(val), opt, inText.getText());
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }
                    opt = "=";
                    addWrite = false;
                }
        });
    }

    @Override
    protected double performOperataion(String arg11, String optt, String arg22) {
        Double arg1 = str2Double(arg11);
        Double arg2 = str2Double(arg22);

        inText.setFont(inText.getFont().deriveFont(Font.BOLD));
        if (optt.equals("+")) {
            return arg1 + arg2;
        } else if (optt.equals("-")) {
            return arg1 - arg2;
        } else if (optt.equals("*")) {
            return arg1 * arg2;
        } else if (optt.equals("/")) {
            return arg1 / arg2;
        }
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
        return arg2;
    }

    @Override
    public void runCalculator() {
        window.setLayout(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If Click into The Red Button => End The Processus
        window.setVisible(true);
    }

    public JButton getBtnDiv() {
        return btnDiv;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public JButton getBtnMul() {
        return btnMul;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public JButton getBtnSub() {
        return btnSub;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JButton getBtnPoint() {
        return btnPoint;
    }

    public JButton getBtn0() {
        return btn0;
    }

    public JButton getBtnEqual() {
        return btnEqual;
    }

    public JTextField getInText() {
        return inText;
    }
}
