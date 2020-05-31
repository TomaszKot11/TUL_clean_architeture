package main.java.com.tomaszkot.calculator;

import javax.swing.*;
import java.awt.*;
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

        configureBtnFonts();
        configureNumbersBtnListeners();
        configureFunctionalBtnListeners();

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

    private void configureNumbersBtnListeners() {
        btn0 = new JButton("0");
        btn0.setBounds(x[1], y[5], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn0.setFont(btnFont);
        btn0.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn0.addActionListener(event -> {
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
        window.add(btn0);


        btn3 = new JButton("3");
        btn3.setBounds(x[2], y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn3.setFont(btnFont);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.addActionListener(event -> {
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
        window.add(btn3);

        btn2 = new JButton("2");
        btn2.setBounds(x[1], y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn2.setFont(btnFont);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn2.addActionListener(event -> {
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
        window.add(btn2);

        btn4 = new JButton("4");
        btn4.setBounds(x[0], y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn4.setFont(btnFont);
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn4.addActionListener(event -> {
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
        window.add(btn4);

        btn7 = new JButton("7");
        btn7.setBounds(x[0], y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn7.setFont(btnFont);
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn7.addActionListener(event -> {
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
        window.add(btn7);

        btn1 = new JButton("1");
        btn1.setBounds(x[0], y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn1.setFont(btnFont);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.addActionListener(event -> {
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
        window.add(btn1);

        btn8 = new JButton("8");
        btn8.setBounds(x[1], y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn8.setFont(btnFont);
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn8.addActionListener(event -> {
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
        window.add(btn8);

        btn9 = new JButton("9");
        btn9.setBounds(x[2], y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn9.setFont(btnFont);
        btn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn9.addActionListener(event -> {
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
        window.add(btn9);

        btn5 = new JButton("5");
        btn5.setBounds(x[1], y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn5.setFont(btnFont);
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn5.addActionListener(event -> {
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
        window.add(btn5);

        btn6 = new JButton("6");
        btn6.setBounds(x[2], y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn6.setFont(btnFont);
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn6.addActionListener(event -> {
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
        window.add(btn6);
    }

    private void configureFunctionalBtnListeners() {
        btnDiv = new JButton("/");
        btnDiv.setBounds(x[0], y[1], 3 * BUTTON_WIDTH + 20, BUTTON_HEIGHT);
        btnDiv.setFont(btnFont);
        btnDiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDiv.addActionListener(event -> {
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
        window.add(btnDiv);

        btnMul = new JButton("*");
        btnMul.setBounds(x[3], y[1], BUTTON_WIDTH, 2 * BUTTON_HEIGHT + 10);
        btnMul.setFont(btnFont);
        btnMul.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMul.addActionListener(event -> {
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
        window.add(btnMul);

        btnSub = new JButton("-");
        btnSub.setBounds(x[3], y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnSub.setFont(btnFont);
        btnSub.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSub.addActionListener(event -> {
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
        window.add(btnSub);


        btnAdd = new JButton("+");
        btnAdd.setBounds(x[3], y[4], BUTTON_WIDTH, 2 * BUTTON_HEIGHT + 10);
        btnAdd.setFont(btnFont);
        btnAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAdd.addActionListener(event -> {
            ;
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
        window.add(btnAdd);

        btnPoint = new JButton(".");
        btnPoint.setBounds(x[0], y[5], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnPoint.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        btnPoint.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPoint.addActionListener(event -> {
            if (addWrite) {
                inText.setText(inText.getText() + ".");
            } else {
                inText.setText("0.");
                addWrite = true;
            }
            go = true;
        });
        window.add(btnPoint);


        btnEqual = new JButton("=");
        btnEqual.setBounds(x[2], y[5], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnEqual.setFont(btnFont);
        btnEqual.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnEqual.addActionListener(event -> {
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
        window.add(btnEqual);
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


}
