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
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton NestedPi;
    private JButton NestedSigma;
    private JButton button20;

    public Calculator() {
        SQRT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double input = Double.parseDouble(Inputnumber.getText());
                Inputnumber.setText(String.valueOf(Math.sqrt(input)));
            }
        });
        CBRT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double input = Double.parseDouble(Inputnumber.getText());
                Inputnumber.setText(String.valueOf(Math.cbrt(input)));
            }
        });
        PlussOrMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText());
                if (Inputnumber.getText().indexOf("-") >=0) {
                    System.out.println("if condition work\t\t"+ Inputnumber.getText().indexOf("-") );
                    Inputnumber.setText( Inputnumber.getText().substring(1));
                } else {
                    System.out.println("else work \t\t\t"+ Inputnumber.getText().indexOf("-") );
                    Inputnumber.setText("-" + Inputnumber.getText());
                }
            }
        });
        Period.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().indexOf(".") <0){
                    Inputnumber.setText(Inputnumber.getText() + ".");
                }
            }
        });
        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inputnumber.setText(Inputnumber.getText() + "0");
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
