import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import groovy.util.Eval;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.regex.Pattern;


public class App {
    public static void main(String[] args) {
        ArrayList<Object> equation = new ArrayList<>();
        char[] oper = {'+','\u0078','\u00F7','-'};

        GridLayout gl = new GridLayout(4,4);
        JFrame frame = new JFrame();
        JTextField inputOutputField = new JTextField("Enter a number");

        // Information about JFrame-frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
        frame.setLayout(gl);

        frame.setTitle("Calculator");
        frame.setName("Calculator");



        frame.setVisible(true);


        // Information about JTextField inputOutputField
        inputOutputField.setSize(300,50);
        inputOutputField.setPreferredSize(new Dimension(300,50));
        inputOutputField.setMinimumSize(new Dimension(300,50));
        inputOutputField.setMaximumSize(new Dimension(300,50));


        inputOutputField.setBounds(0,0,300,50);

        // Information About Buttons
        JPanel btns = new JPanel();
        btns.setBounds(0,60,300,350);

        JButton btnNine = new JButton("9");

        btnNine.setBounds(3,60,65,45);
        btns.add(btnNine);

        JButton btnEight = new JButton("8");
        btnEight.setBounds(75,60,65,45);
        btns.add(btnEight);

        JButton btnSeven = new JButton("7");
        btnSeven.setBounds(145,60,65,45);
        btns.add(btnSeven);

        JButton btnAdd = new JButton("+");
        btnAdd.setBounds(213,60,65,45);
        btns.add(btnAdd);

        JButton btnSix = new JButton("6");
        btnSix.setBounds(3,110,65,45);
        btns.add(btnSix);

        JButton btnFive = new JButton("5");
        btnFive.setBounds(75,110,65,45);
        btns.add(btnFive);

        JButton btnFour = new JButton("4");
        btnFour.setBounds(145,110,65,45);
        btns.add(btnFour);

        JButton btnSub = new JButton("-");
        btnSub.setBounds(213,110,65,45);
        btns.add(btnSub);

        JButton btnThree = new JButton("3");
        btnThree.setBounds(3,160,65,45);
        btns.add(btnThree);

        JButton btnTwo = new JButton("2");
        btnTwo.setBounds(75,160,65,45);
        btns.add(btnTwo);

        JButton btnOne = new JButton("1");
        btnOne.setBounds(145,160,65,45);
        btns.add(btnOne);

        JButton btnMul = new JButton("\u0078");
        btnMul.setBounds(213,160,65,45);
        btns.add(btnMul);

        JButton btnZero = new JButton("0");
        btnZero.setBounds(3,210,65,45);
        btns.add(btnZero);

        JButton btnDecimal = new JButton(".");
        btnDecimal.setBounds(75,210,65,45);
        btns.add(btnDecimal);

        JButton btnDiv = new JButton("\u00F7");
        btnDiv.setBounds(145,210,65,45);
        btns.add(btnDiv);

        JButton btnEqu = new JButton("=");
        btnEqu.setBounds(213,210,65,45);
        btns.add(btnEqu);

        frame.add(btns);
        frame.add(inputOutputField);

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number") || contains(oper, inputOutputField.getText())) {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + "9");
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number") || contains(oper, inputOutputField.getText()))  {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + "8");
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number") || contains(oper, inputOutputField.getText())) {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + "7");
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number") || contains(oper, inputOutputField.getText())) {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + "6");
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number") || contains(oper, inputOutputField.getText())) {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + "5");
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number") || contains(oper, inputOutputField.getText())) {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + "4");
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number") || contains(oper, inputOutputField.getText())) {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + "3");
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number") || contains(oper, inputOutputField.getText())) {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + "2");
            }
        });

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number")|| contains(oper, inputOutputField.getText())) {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + "1");
            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number")|| contains(oper, inputOutputField.getText())) {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + "0");
            }
        });

        btnDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (inputOutputField.getText().equals("Enter a number") || contains(oper, inputOutputField.getText())) {
                    inputOutputField.setText("");
                }
                inputOutputField.setText(inputOutputField.getText() + ".");
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!inputOutputField.getText().equals("Enter a number")) {
                    equation.add(inputOutputField.getText());
                    equation.add("+");
                    inputOutputField.setText("+");
                }

            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!inputOutputField.getText().equals("Enter a number")) {
                    equation.add(inputOutputField.getText());
                    equation.add("-");
                    inputOutputField.setText("-");
                }

            }
        });

        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!inputOutputField.getText().equals("Enter a number")) {
                    equation.add(inputOutputField.getText());
                    equation.add("*");
                    inputOutputField.setText(btnMul.getText());
                }

            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!inputOutputField.getText().equals("Enter a number")) {
                    equation.add(inputOutputField.getText());
                    equation.add("/");
                    inputOutputField.setText(btnDiv.getText());
                }

            }
        });

        btnEqu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!inputOutputField.getText().equals("Enter a number")){
                    equation.add(inputOutputField.getText());
                }


                if(equation.size() == 0){
                    inputOutputField.setText("0");
                }else if(equation.size() <= 2){
                    inputOutputField.setText(equation.get(0).toString());
                }else{
                    Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
                    StringBuilder toSolve = new StringBuilder();
                    for(Object obj: equation){
                        if(pattern.matcher(obj.toString()).matches()){
                            if(Double.parseDouble(obj.toString()) == Integer.parseInt(obj.toString())){
                                toSolve.append(obj.toString() + ".00");
                            }
                        }else{
                            toSolve.append(obj.toString());
                        }

                    }
                    String equ = toSolve.toString();
                    ScriptEngineManager mgr = new ScriptEngineManager();
                    ScriptEngine engine = mgr.getEngineByName("Groovy");

                    BigDecimal value = (BigDecimal) Eval.me(equ);


                    inputOutputField.setText(String.valueOf(value));

                }
            }
        });





        //  frame.getContentPane().setBackground(Color.DARK_GRAY);

    }

    private static boolean contains(char[] chars, String string){
        for(char c: chars){
            for(char s: string.toCharArray()){
                if(c == s){
                    return true;
                }
            }
        }
        return false;
    }
}
