import Method_Collection.Methods;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JButton Button1;
    private JPanel MainPanel;
    private JButton button2;
    private JButton button3;
    private JPanel Numpad;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton PlussOrMinus;
    private JButton button0;
    private JButton Period;
    private JTextArea Inputnumber;
    private JButton FLR;
    private JLabel Preview;
    private JButton CEIL;
    private JButton factorial;
    private JButton modulo;
    private JButton SQRT;
    private JButton CBRT;
    private JButton button12;
    private JButton Pi;
    private JButton Raise;
    private JButton addition;
    private JButton Substraction;
    private JButton Equals;
    private JButton NestedPi;
    private JButton NestedSigma;
    private JButton delete;
    private JButton AllClear;
    private JButton Multiply;
    private JButton Division;
    private JTextArea SigmaInputA;
    private JTextArea SigmaInputB;
    private JPanel SigmaPanel;
    private JTextArea SigmaInputEQ;
    private JButton raiseraise;
    private JLabel SigmaA;
    private JLabel SigmaB;
    private JLabel SigmaC;
    private JButton INTButton;
    private JButton DivideInt;
    private JButton log2XButton;
    private JButton logXButton;
    private JButton aFPlusBFButton;
    private JButton aFDivideBFButton1;
    private JButton pNRButton;
    private JButton nCrButton;


    public Calculator() {
        SigmaPanel.setVisible(false);
        Substraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + " - ");
                Inputnumber.setText("");
            }
        });
        DivideInt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + " // ");
                Inputnumber.setText("");
            }
        });
        INTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    int intF = (int) Double.parseDouble(Inputnumber.getText());
                    Preview.setText("Int(" + Inputnumber.getText() + ")");
                    Inputnumber.setText(String.valueOf(intF));
                }

            }
        });
        Equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (SigmaPanel.isVisible() == true){

                }else if (Preview.getText().indexOf("%") >= 0){//modulo
                    double output = Double.parseDouble(Preview.getText().substring(0,Preview.getText().indexOf(" "))) % Integer.parseInt(Inputnumber.getText());
                    Preview.setText(Preview.getText()+ " " + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf((int) output));
                }else if (Preview.getText().indexOf("//") >= 0){//divideInte
                    int DivideInteger = (int) (Double.parseDouble(Preview.getText().substring(0,Preview.getText().indexOf(" //")))/Double.parseDouble(Inputnumber.getText()));
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(DivideInteger));
                }else if (Preview.getText().indexOf(" - ") >= 0){//subtraction
                    double output = Double.parseDouble(Preview.getText().substring(0,Preview.getText().indexOf(" - "))) - Double.parseDouble(Inputnumber.getText());
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(output));
                }else if (Preview.getText().indexOf(" + ") >= 0){//addition
                    double output = Double.parseDouble(Preview.getText().substring(0,Preview.getText().indexOf(" + "))) + Double.parseDouble(Inputnumber.getText());
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(output));
                }else if (Preview.getText().indexOf(" / ") >= 0){//divide
                    double output = Double.parseDouble(Preview.getText().substring(0,Preview.getText().indexOf(" / "))) / Double.parseDouble(Inputnumber.getText());
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(output));
                }else if (Preview.getText().indexOf(" * ") >= 0){//multiply
                    double output = Double.parseDouble(Preview.getText().substring(0,Preview.getText().indexOf(" * "))) * Double.parseDouble(Inputnumber.getText());
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(output));
                }else if (Preview.getText().indexOf("!+") >= 0){//factorial and addition
                    double output = Methods.Factorial(Double.parseDouble(Preview.getText().substring(0,Preview.getText().indexOf("!")))) + Methods.Factorial(Double.parseDouble(Inputnumber.getText()));
                    Preview.setText(Preview.getText() + Inputnumber.getText() +"!");
                    Inputnumber.setText(String.valueOf(output));
                }else if (Preview.getText().indexOf("!/") >= 0){//factorial and divide
                    double output = Methods.Factorial(Double.parseDouble(Preview.getText().substring(0,Preview.getText().indexOf("!")))) / Methods.Factorial(Double.parseDouble(Inputnumber.getText()));
                    Preview.setText(Preview.getText() + Inputnumber.getText() +"!");
                    Inputnumber.setText(String.valueOf(output));
                }else if (Preview.getText().indexOf("^",Preview.getText().indexOf("^")+1) >= 0){//nested power
                    double output = Math.pow(Double.parseDouble(Preview.getText().substring(0,Preview.getText().indexOf("^"))),Double.parseDouble(Preview.getText()));
                    output = Math.pow(output,Double.parseDouble(Preview.getText()));
                    Preview.setText(Preview.getText() + Inputnumber.getText() );
                    Inputnumber.setText(String.valueOf(output));
                }else if (Preview.getText().indexOf("^") >= 0){//power or raise
                    double output = Math.pow(Double.parseDouble(Preview.getText().substring(0,Preview.getText().indexOf("^"))),Double.parseDouble(Preview.getText()));
                    Preview.setText(Preview.getText() + Inputnumber.getText() );
                    Inputnumber.setText(String.valueOf(output));
                }
            }
        });
        Raise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + "^" );
                Inputnumber.setText("");
            }
        });
        aFDivideBFButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + "!/" );
                Inputnumber.setText("");
            }
        });
        aFPlusBFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + "!+" );
                Inputnumber.setText("");
            }
        });
        logXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    double output =  Math.log10(Double.parseDouble(Inputnumber.getText()));
                    Preview.setText( "log("+ Inputnumber.getText() + ")");
                    Inputnumber.setText(String.valueOf(output));
                }

            }
        });
        log2XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    double output =  (Math.log(Double.parseDouble(Inputnumber.getText()))/Math.log(2));
                    Preview.setText( "log2("+ Inputnumber.getText() + ")");
                    Inputnumber.setText(String.valueOf(output));
                }
            }
        });
        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + " + ");
                Inputnumber.setText("");
            }
        });
        Multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + " * ");
                Inputnumber.setText("");
            }
        });
        Division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + " / ");
                Inputnumber.setText("");
            }
        });
        AllClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(" ");
                Inputnumber.setText("");
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = Inputnumber.getText();
                if (input.length() > 0) {
                    Inputnumber.setText(input.substring(0, input.length() - 1));
                }
            }
        });
        modulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    Double input = Double.parseDouble(Inputnumber.getText());
                    Inputnumber.setText("");
                    Preview.setText(String.valueOf(input) + " %");
                }
            }
        });
        CEIL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    Double input = Double.parseDouble(Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(Math.ceil(input)));
                    Preview.setText(String.valueOf(input) + "");
                    Preview.setText("CEIL(" + String.valueOf(input) + ")");
                }

            }
        });

        FLR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    Double input = Double.parseDouble(Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(Math.floor(input)));
                    Preview.setText("FLR(" + input + ")");
                }

            }
        });
        SQRT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    Double input = Double.parseDouble(Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(Math.sqrt(input)));
                }


            }
        });
        CBRT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    Double input = Double.parseDouble(Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(Math.cbrt(input)));
                }


            }
        });
        PlussOrMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText());
                if (Inputnumber.getText().indexOf("-") >= 0) {
                    //System.out.println("if condition work\t\t"+ Inputnumber.getText().indexOf("-") );
                    Inputnumber.setText(Inputnumber.getText().substring(1));
                } else {
                    //System.out.println("else work \t\t\t"+ Inputnumber.getText().indexOf("-") );
                    Inputnumber.setText("-" + Inputnumber.getText());
                }
            }
        });
        Period.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().indexOf(".") < 0) {
                    Inputnumber.setText(Inputnumber.getText() + ".");
                }
            }
        });
        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    double output = Methods.Factorial(Double.parseDouble(Inputnumber.getText()));
                    Preview.setText( Inputnumber.getText() + "!");
                    Inputnumber.setText(String.valueOf(output));
                }

            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "0");
            }
        });
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "9");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
