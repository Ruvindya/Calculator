import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator {
    private JTextField txtDisplay;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnAdd;
    private JButton btnSub;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnMul;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnDev;
    private JButton btnDot;
    private JButton btnZero;
    private JButton btnClear;
    private JButton btnEqual;
    private JPanel main;
    private Double Num1,Num2,Ans;


    public Calculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"1 ");
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"2 ");
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"3 ");
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"4 ");
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"5 ");
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"6 ");
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"7 ");
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"8 ");
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"9 ");
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"0 ");
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+". ");
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(" ");
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"+ ");
            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"- ");
            }
        });
        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"* ");
            }
        });
        btnDev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tem=txtDisplay.getText();
                txtDisplay.setText(tem+"/ ");
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws NumberFormatException {

                String str = txtDisplay.getText();

                String[] splited = str.split(" ");

                for (int i = 0; i < 3; i++) {
                    System.out.println(splited[i]);
                }

                txtDisplay.setText(" ");
                Double num1= Double.parseDouble(splited[0]);
                Double num2= Double.parseDouble(splited[2]);

                Integer num1= Integer.parseInteger(splited[0]);
                Integer num2= Integer.parseInteger(splited[2]);

                String op=splited[1];
                String FinalAns;

                Double Val = null;

                if(op=="+" ){
                    Val=num1+num2;
                    System.out.println(Val+"  inside if");
                } else if (op=="-") {
                    Val=num1-num2;
                } else if (op=="*") {
                    Val=num1*num2;
                } else if (op=="/") {
                    Val=num1/num2;
                }else FinalAns="ERROR";

                System.out.println(Val+"  after if");

                txtDisplay.setText(Double.toString(Val));

//
//                try{
//                    if(op=="+" ){
//                        Val=num1+num2;
//                        System.out.println(Val+"  inside if");
//                    } else if (op=="-") {
//                        Val=num1-num2;
//                    } else if (op=="*") {
//                        Val=num1*num2;
//                    } else if (op=="/") {
//                        Val=num1/num2;
//                    }else FinalAns="ERROR";
//
//                    System.out.println(Val+"  after if");
//
//                    txtDisplay.setText(Double.toString(Val));
//                }catch(Exception ee){
//                    System.out.println("Error"+ee);
//                }
                
               



//                char[] chArr = new char[str.length()];

//                for (int i = 0; i < str.length(); i++) {
//                    chArr[i] = str.charAt(i);
//                }
//
//
//                for (char c : chArr) {
//
//                }


                //ArrayList op= new ArrayList<>(txtDisplay.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();



    }
}
