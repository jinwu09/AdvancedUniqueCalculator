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
    private JButton sigmaXPlusYButton;
    private JButton PiXPlusYButton;
    private JButton Raise;
    private JButton addition;
    private JButton Substraction;
    private JButton Equals;
    private JButton NestedPiXPlusYButton;
    private JButton NestedSigmaXPlusYButton;
    private JButton delete;
    private JButton AllClear;
    private JButton Multiply;
    private JButton Division;
    private JPanel SigmaPanel;
    private JButton raiseraise;
    private JButton INTButton;
    private JButton DivideInt;
    private JButton log2XButton;
    private JButton logXButton;
    private JButton aFPlusBFButton;
    private JButton aFDivideBFButton1;
    private JButton PermButton;
    private JButton CombinationButton;
    private JButton SigmaXYButton;
    private JButton PiXYButton;
    private JButton NestedSigmaXYButton;
    private JButton NestedPiXYButton;
    private JButton SigmaXRaiseYButton;
    private JButton PiXRaiseYButton;
    private JButton NestedSigmaXRaiseYButton;
    private JButton NestedPiXRaiseYButton;
    private JButton SigmaYRaiseXButton;
    private JButton probabilityButton;
    private JButton probabilityDiceButton;

    public Calculator() {
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
                if (Preview.getText().indexOf("%") >= 0) {// modulo
                    double output = Double.parseDouble(Preview.getText().substring(0, Preview.getText().indexOf(" "))) % Integer.parseInt(Inputnumber.getText());
                    Preview.setText(Preview.getText() + " " + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf((int) output));
                } else if (Preview.getText().indexOf("//") >= 0) {// divideInte
                    int DivideInteger = (int) (Double.parseDouble(Preview.getText().substring(0, Preview.getText().indexOf(" //"))) / Double.parseDouble(Inputnumber.getText()));
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(DivideInteger));
                } else if (Preview.getText().indexOf(" - ") >= 0) {// subtraction
                    double output = Double.parseDouble(Preview.getText().substring(0, Preview.getText().indexOf(" - "))) - Double.parseDouble(Inputnumber.getText());
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(output));
                } else if (Preview.getText().indexOf(" + ") >= 0) {// addition
                    double output = Double.parseDouble(Preview.getText().substring(0, Preview.getText().indexOf(" + "))) + Double.parseDouble(Inputnumber.getText());
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(output));
                } else if (Preview.getText().indexOf(" / ") >= 0) {// divide
                    double output = Double.parseDouble(Preview.getText().substring(0, Preview.getText().indexOf(" / "))) / Double.parseDouble(Inputnumber.getText());
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(output));
                } else if (Preview.getText().indexOf(" * ") >= 0) {// multiply
                    double output = Double.parseDouble(Preview.getText().substring(0, Preview.getText().indexOf(" * "))) * Double.parseDouble(Inputnumber.getText());
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(output));
                } else if (Preview.getText().indexOf("!+") >= 0) {// factorial and addition
                    double output = Methods.Factorial(Double.parseDouble(Preview.getText().substring(0, Preview.getText().indexOf("!")))) + Methods.Factorial(Double.parseDouble(Inputnumber.getText()));
                    Preview.setText(Preview.getText() + Inputnumber.getText() + "!");
                    Inputnumber.setText(String.valueOf(output));
                } else if (Preview.getText().indexOf("!/") >= 0) {// factorial and divide
                    double output = Methods.Factorial(Double.parseDouble(Preview.getText().substring(0, Preview.getText().indexOf("!")))) / Methods.Factorial(Double.parseDouble(Inputnumber.getText()));
                    Preview.setText(Preview.getText() + Inputnumber.getText() + "!");
                    Inputnumber.setText(String.valueOf(output));
                } else if (Preview.getText().indexOf("^", Preview.getText().indexOf("^") + 1) >= 0) {// nested power
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains("x") ==true || StrPreview.contains("y") ==true || StrPreview.contains("z") ==true ) {
                        if (Preview.getText().indexOf("x") >= 0) {
                            Preview.setText(Preview.getText().replace("x", Inputnumber.getText()));
                        } else if (Preview.getText().indexOf("y") >= 0) {
                            Preview.setText(Preview.getText().replace("y", Inputnumber.getText()));
                        } else if (Preview.getText().indexOf("z") >= 0) {
                            Preview.setText(Preview.getText().replace("z", Inputnumber.getText()));
                        }
                    }
                    Inputnumber.setText("");
                    StrPreview = Preview.getText();
                    if (StrPreview.contains("x") ==false && StrPreview.contains("y") ==false && StrPreview.contains("z") ==false ) {
                        String test = Preview.getText();
                        double secondnum = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("^") + 1, Preview.getText().indexOf("^", Preview.getText().indexOf("^") + 1)));
                        Double Thirdnum = Double.parseDouble(test.substring(test.indexOf("^", test.indexOf("^") + 1) + 1));
                        double output = Math.pow(secondnum,Thirdnum );
                        output = Math.pow(Double.parseDouble(Preview.getText().substring(0, Preview.getText().indexOf("^"))), output);
                        Preview.setText(Preview.getText().replace("z", Inputnumber.getText()));
                        Inputnumber.setText(String.valueOf((int) output));
                    }
                } else if (Preview.getText().contains(" ∑x+y") == true) {// ∑x+y
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" y ") ==true ) {
                        if (Preview.getText().contains(" a ") == true) {
                            Preview.setText(Preview.getText().replace(" a ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" b ") == true) {
                            Preview.setText(Preview.getText().replace(" b ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" y ") == true) {
                            Preview.setText(Preview.getText().replace(" y ", Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" y ") ==false ) {
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=") + 2, Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=") + 2, Preview.getText().indexOf(",y")));
                        double y = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("y=") + 2, Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.SigmaXPlusY(a, b, y)));
                    }
                }else if (Preview.getText().contains(" ∑xy") == true) {// ∑xy
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" y ") ==true ) {
                        if (Preview.getText().contains(" a ") == true) {
                            Preview.setText(Preview.getText().replace(" a ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" b ") == true) {
                            Preview.setText(Preview.getText().replace(" b ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" y ") == true) {
                            Preview.setText(Preview.getText().replace(" y ", Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" y ") ==false ) {
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=") + 2, Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=") + 2, Preview.getText().indexOf(",y")));
                        double y = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("y=") + 2, Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.SigmaXY(a, b, y)));
                    }
                }else if (Preview.getText().contains(" ∑x^y") == true) {// ∑x^y
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" y ") ==true ) {
                        if (Preview.getText().contains(" a ") == true) {
                            Preview.setText(Preview.getText().replace(" a ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" b ") == true) {
                            Preview.setText(Preview.getText().replace(" b ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" y ") == true) {
                            Preview.setText(Preview.getText().replace(" y ", Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" y ") ==false ) {
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=") + 2, Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=") + 2, Preview.getText().indexOf(",y")));
                        double y = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("y=") + 2, Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.SigmaXRaiseY(a, b, y)));
                    }
                }else if (Preview.getText().contains(" ∑y^x") == true) {// ∑y^x
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" y ") ==true ) {
                        if (Preview.getText().contains(" a ") == true) {
                            Preview.setText(Preview.getText().replace(" a ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" b ") == true) {
                            Preview.setText(Preview.getText().replace(" b ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" y ") == true) {
                            Preview.setText(Preview.getText().replace(" y ", Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" y ") ==false ) {
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=") + 2, Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=") + 2, Preview.getText().indexOf(",y")));
                        double y = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("y=") + 2, Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.SigmaYRaiseX(a, b, y)));
                    }
                }else if (Preview.getText().contains(" Πx+y") == true) {// Πy+x
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" y ") ==true ) {
                        if (Preview.getText().contains(" a ") == true) {
                            Preview.setText(Preview.getText().replace(" a ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" b ") == true) {
                            Preview.setText(Preview.getText().replace(" b ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" y ") == true) {
                            Preview.setText(Preview.getText().replace(" y ", Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" y ") ==false ) {
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=") + 2, Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=") + 2, Preview.getText().indexOf(",y")));
                        double y = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("y=") + 2, Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.PiXPlusY(a, b, y)));
                    }
                }else if (Preview.getText().contains(" Πxy") == true) {// Πyx
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" y ") ==true ) {
                        if (Preview.getText().contains(" a ") == true) {
                            Preview.setText(Preview.getText().replace(" a ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" b ") == true) {
                            Preview.setText(Preview.getText().replace(" b ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" y ") == true) {
                            Preview.setText(Preview.getText().replace(" y ", Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" y ") ==false ){
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=")+2,Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=")+2,Preview.getText().indexOf(",y")));
                        double y = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("y=")+2,Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.PiXY(a,b,y)));
                    }
                }else if (Preview.getText().contains(" Πx^y") == true) {// Πy^x
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" y ") ==true ) {
                        if (Preview.getText().contains(" a ") == true) {
                            Preview.setText(Preview.getText().replace(" a ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" b ") == true) {
                            Preview.setText(Preview.getText().replace(" b ", Inputnumber.getText()));
                        } else if (Preview.getText().contains(" y ") == true) {
                            Preview.setText(Preview.getText().replace(" y ", Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" y ") ==false ){
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=")+2,Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=")+2,Preview.getText().indexOf(",y")));
                        double y = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("y=")+2,Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.PiXRaiseY(a,b,y)));
                    }
                }else if (Preview.getText().contains(" ∑∑x+y") == true) {// ∑∑y+x
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" c ") ==true || StrPreview.contains(" d ") ==true ) {
                        if (Preview.getText().contains(" a ") == true){
                            Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" b ") == true){
                            Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" c ") == true){
                            Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" d ") == true){
                            Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" c ") ==false && StrPreview.contains(" d ") ==false ){
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=")+2,Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=")+2,Preview.getText().indexOf(",c")));
                        double c = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("c=")+2,Preview.getText().indexOf(",d")));
                        double d = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("d=")+2,Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.NestedSigmaXPlusY(a,b,c,d)));
                    }
                }else if (Preview.getText().contains(" ∑∑xy") == true) {// ∑∑y+x
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" c ") ==true || StrPreview.contains(" d ") ==true ) {
                        if (Preview.getText().contains(" a ") == true){
                            Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" b ") == true){
                            Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" c ") == true){
                            Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" d ") == true){
                            Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" c ") ==false && StrPreview.contains(" d ") ==false ){
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=")+2,Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=")+2,Preview.getText().indexOf(",c")));
                        double c = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("c=")+2,Preview.getText().indexOf(",d")));
                        double d = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("d=")+2,Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.NestedSigmaXY(a,b,c,d)));
                    }
                }else if (Preview.getText().contains(" ∑∑x^y") == true) {// ∑∑y+x
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" c ") ==true || StrPreview.contains(" d ") ==true ) {
                        if (Preview.getText().contains(" a ") == true){
                            Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" b ") == true){
                            Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" c ") == true){
                            Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" d ") == true){
                            Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" c ") ==false && StrPreview.contains(" d ") ==false ){
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=")+2,Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=")+2,Preview.getText().indexOf(",c")));
                        double c = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("c=")+2,Preview.getText().indexOf(",d")));
                        double d = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("d=")+2,Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.NestedSigmaXRaiseY(a,b,c,d)));
                    }
                }else if (Preview.getText().contains(" ΠΠx+y") == true) {// ΠΠx+y
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" c ") ==true || StrPreview.contains(" d ") ==true ) {
                        if (Preview.getText().contains(" a ") == true){
                            Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" b ") == true){
                            Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" c ") == true){
                            Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" d ") == true){
                            Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" c ") ==false && StrPreview.contains(" d ") ==false ){
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=")+2,Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=")+2,Preview.getText().indexOf(",c")));
                        double c = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("c=")+2,Preview.getText().indexOf(",d")));
                        double d = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("d=")+2,Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.NestedPiXPlusY(a,b,c,d)));
                    }
                }else if (Preview.getText().contains(" ΠΠxy") == true) {// ΠΠxy
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" c ") ==true || StrPreview.contains(" d ") ==true ) {
                        if (Preview.getText().contains(" a ") == true){
                            Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" b ") == true){
                            Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" c ") == true){
                            Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" d ") == true){
                            Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" c ") ==false && StrPreview.contains(" d ") ==false ){
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=")+2,Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=")+2,Preview.getText().indexOf(",c")));
                        double c = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("c=")+2,Preview.getText().indexOf(",d")));
                        double d = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("d=")+2,Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.NestedPiXY(a,b,c,d)));
                    }
                }else if (Preview.getText().contains(" ΠΠx^y") == true) {// ΠΠx^y
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" c ") ==true || StrPreview.contains(" d ") ==true ) {
                        if (Preview.getText().contains(" a ") == true){
                            Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" b ") == true){
                            Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" c ") == true){
                            Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" d ") == true){
                            Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" c ") ==false && StrPreview.contains(" d ") ==false ){
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("a=")+2,Preview.getText().indexOf(",b")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("b=")+2,Preview.getText().indexOf(",c")));
                        double c = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("c=")+2,Preview.getText().indexOf(",d")));
                        double d = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("d=")+2,Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.NestedPiXRaiseY(a,b,c,d)));
                    }
                }else if (Preview.getText().contains(" P(") == true) {// Perm
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains("n") ==true || StrPreview.contains("r") ==true ) {
                        if (Preview.getText().contains("n") == true){
                            Preview.setText(Preview.getText().replace("n",Inputnumber.getText()));
                        }else if (Preview.getText().contains("r") == true){
                            Preview.setText(Preview.getText().replace("r",Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains("n") ==false && StrPreview.contains("r") ==false ){
                        System.out.println(Preview.getText().substring(Preview.getText().indexOf("(")+1,Preview.getText().indexOf(",")));
                        System.out.println(Preview.getText().substring(Preview.getText().indexOf(",")+1,Preview.getText().indexOf(")")));
                        double n = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("(")+1,Preview.getText().indexOf(",")));
                        double r = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf(",")+1,Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.Perm(n,r)));
                    }
                }else if (Preview.getText().contains("C") == true) {// Perm
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains("n") ==true || StrPreview.contains("r") ==true ) {
                        if (Preview.getText().contains("n") == true){
                            Preview.setText(Preview.getText().replace("n",Inputnumber.getText()));
                        }else if (Preview.getText().contains("r") == true){
                            Preview.setText(Preview.getText().replace("r",Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains("n") ==false && StrPreview.contains("r") ==false ){
                        double n = Double.parseDouble(Preview.getText().substring(1,Preview.getText().indexOf("C")));
                        double r = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("C")+1));
                        Inputnumber.setText(String.valueOf(Methods.Combination(n,r)));
                    }
                }else if (Preview.getText().contains(" Proba") == true) {// ΠΠx^y
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true || StrPreview.contains(" c ") ==true  ) {
                        if (Preview.getText().contains(" a ") == true){
                            Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" b ") == true){
                            Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" c ") == true){
                            Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" c ") ==false ){
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("(")+1,Preview.getText().indexOf(",")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf(",")+1,Preview.getText().indexOf(",",Preview.getText().indexOf(",")+1)));
                        double c = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf(",",Preview.getText().indexOf(",")+1)+1,Preview.getText().indexOf(")")));
                        Inputnumber.setText(String.valueOf(Methods.Probabilitycard(a,b,c)));
                    }
                }else if (Preview.getText().contains(" ProbDice") == true) {// ΠΠx^y
                    String StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==true || StrPreview.contains(" b ") ==true ) {
                        if (Preview.getText().contains(" a ") == true){
                            Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                        }else if (Preview.getText().contains(" b ") == true){
                            Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                        }
                        Inputnumber.setText("");
                    }
                    StrPreview = Preview.getText();
                    if (StrPreview.contains(" a ") ==false && StrPreview.contains(" b ") ==false && StrPreview.contains(" c ") ==false ){
                        double a = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf("(")+1,Preview.getText().indexOf(",")));
                        double b = Double.parseDouble(Preview.getText().substring(Preview.getText().indexOf(",")+1,Preview.getText().indexOf(")")));
                        double output = Methods.Dice(a,b);
                        Inputnumber.setText(String.valueOf(output) + " or " + String.format("%.3f", output));
                    }
                }else if (Preview.getText().indexOf("^") >= 0) {// power or raise
                    double output = Math.pow(Double.parseDouble(Preview.getText().substring(0, Preview.getText().indexOf("^"))), Double.parseDouble(Inputnumber.getText()));
                    Preview.setText(Preview.getText() + Inputnumber.getText());
                    Inputnumber.setText(String.valueOf(output));
                }
            }
        });
        probabilityDiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ProbDice")==false){
                    Preview.setText(" ProbDice( a , b )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        probabilityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" Proba")==false){
                    Preview.setText(" Proba( a , b , c )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" c ") == true){
                        Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        CombinationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" nCr")==false){
                    Preview.setText(" nCr");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains("n") == true){
                        Preview.setText(Preview.getText().replace("n",Inputnumber.getText()));
                    }else if (Preview.getText().contains("r") == true){
                        Preview.setText(Preview.getText().replace("r",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        PermButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" P(n,r)")==false){
                    Preview.setText(" P(n,r)");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains("n") == true){
                        Preview.setText(Preview.getText().replace("n",Inputnumber.getText()));
                    }else if (Preview.getText().contains("r") == true){
                        Preview.setText(Preview.getText().replace("r",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        NestedPiXRaiseYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ΠΠx^y")==false){
                    Preview.setText(" ΠΠx^y (a= a ,b= b ,c= c ,d= d )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" c ") == true){
                        Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" d ") == true){
                        Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        NestedPiXYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ΠΠxy")==false){
                    Preview.setText(" ΠΠxy (a= a ,b= b ,c= c ,d= d )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" c ") == true){
                        Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" d ") == true){
                        Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        NestedPiXPlusYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ΠΠx+y")==false){
                    Preview.setText(" ΠΠx+y (a= a ,b= b ,c= c ,d= d )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" c ") == true){
                        Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" d ") == true){
                        Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        NestedSigmaXRaiseYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ∑∑x^y")==false){
                    Preview.setText(" ∑∑x^y (a= a ,b= b ,c= c ,d= d )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" c ") == true){
                        Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" d ") == true){
                        Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        NestedSigmaXYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ∑∑xy")==false){
                    Preview.setText(" ∑∑xy (a= a ,b= b ,c= c ,d= d )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" c ") == true){
                        Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" d ") == true){
                        Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        NestedSigmaXPlusYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ∑∑x+y")==false){
                    Preview.setText(" ∑∑x+y (a= a ,b= b ,c= c ,d= d )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" c ") == true){
                        Preview.setText(Preview.getText().replace(" c ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" d ") == true){
                        Preview.setText(Preview.getText().replace(" d ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        PiXRaiseYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" Πx^y")==false){
                    Preview.setText(" Πx^y (a= a ,b= b ,y= y )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" y ") == true){
                        Preview.setText(Preview.getText().replace(" y ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        PiXYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" Πxy")==false){
                    Preview.setText(" Πxy (a= a ,b= b ,y= y )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" y ") == true){
                        Preview.setText(Preview.getText().replace(" y ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        PiXPlusYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" Πx+y")==false){
                    Preview.setText(" Πx+y (a= a ,b= b ,y= y )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" y ") == true){
                        Preview.setText(Preview.getText().replace(" y ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        SigmaYRaiseXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ∑y^x")==false){
                    Preview.setText(" ∑y^x (a= a ,b= b ,y= y )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" y ") == true){
                        Preview.setText(Preview.getText().replace(" y ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        SigmaXRaiseYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ∑x^y")==false){
                    Preview.setText(" ∑x^y (a= a ,b= b ,y= y )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" y ") == true){
                        Preview.setText(Preview.getText().replace(" y ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        SigmaXYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ∑xy")==false){
                    Preview.setText(" ∑xy (a= a ,b= b ,y= y )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" y ") == true){
                        Preview.setText(Preview.getText().replace(" y ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        sigmaXPlusYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().contains(" ∑x+y")==false){
                    Preview.setText(" ∑x+y (a= a ,b= b ,y= y )");
                }if (Inputnumber.getText().length() >0){
                    if (Preview.getText().contains(" a ") == true){
                        Preview.setText(Preview.getText().replace(" a ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" b ") == true){
                        Preview.setText(Preview.getText().replace(" b ",Inputnumber.getText()));
                    }else if (Preview.getText().contains(" y ") == true){
                        Preview.setText(Preview.getText().replace(" y ",Inputnumber.getText()));
                    }
                }
                Inputnumber.setText("");
            }
        });
        Raise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + "^");
                Inputnumber.setText("");
            }
        });
        raiseraise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Preview.getText().indexOf("^") < 0 && Preview.getText().indexOf("^", Preview.getText().indexOf("^") + 1) < 0) {
                    Preview.setText("x^y^z");
                }
                if (Preview.getText().indexOf("x") >= 0) {
                    Preview.setText(Preview.getText().replace("x", Inputnumber.getText()));
                } else if (Preview.getText().indexOf("y") >= 0) {
                    Preview.setText(Preview.getText().replace("y", Inputnumber.getText()));
                } else if (Preview.getText().indexOf("z") >= 0) {
                    Preview.setText(Preview.getText().replace("z", Inputnumber.getText()));
                }
                Inputnumber.setText("");
            }
        });
        aFDivideBFButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + "!/");
                Inputnumber.setText("");
            }
        });
        aFPlusBFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Preview.setText(Inputnumber.getText() + "!+");
                Inputnumber.setText("");
            }
        });
        logXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    double output = Math.log10(Double.parseDouble(Inputnumber.getText()));
                    Preview.setText("log(" + Inputnumber.getText() + ")");
                    Inputnumber.setText(String.valueOf(output));
                }

            }
        });
        log2XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Inputnumber.getText().length() > 0) {
                    double output = (Math.log(Double.parseDouble(Inputnumber.getText())) / Math.log(2));
                    Preview.setText("log2(" + Inputnumber.getText() + ")");
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
                    // System.out.println("if condition work\t\t"+
                    // Inputnumber.getText().indexOf("-") );
                    Inputnumber.setText(Inputnumber.getText().substring(1));
                } else {
                    // System.out.println("else work \t\t\t"+ Inputnumber.getText().indexOf("-") );
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
                    Preview.setText(Inputnumber.getText() + "!");
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
