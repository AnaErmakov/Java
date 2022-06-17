package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CalcWindow extends JFrame {
    int one = 0; //первое число
    int two = 0; //второе число
    public String calcOp = "";
    JButton jbPl = new JButton("+");
    JButton jbSst = new JButton("-");
    JButton jbMpl = new JButton("*");
    JButton jbDv = new JButton("/");
    JButton jbRes = new JButton("=");
    public CalcWindow(){

        setTitle("Calculator App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 250);
        Font font = new Font("Arrial", Font.BOLD, 18);

        JTextField tf = new JTextField("0", JTextField.RIGHT);
        tf.setFont(font);
        tf.setEnabled(false);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        add(tf, BorderLayout.NORTH);

        ActionListener mylistNum = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = ((JButton)e.getSource()).getText();
                if (str.equals("C")) {
                    tf.setText("0");
                }
                else {
                    tf.setText(tf.getText() + str);
                }
            }
        };
        ActionListener mylistC = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                one = 0;
                two = 0;
                calcOp = "";
                tf.setText("0");
            }
        };
        ActionListener mylistCalc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
  /*           if (calcOp.equals("")) one = Integer.parseInt((tf.getText()));
               else {
                    two = Integer.parseInt(tf.getText());
                    one = one + two;
                    tf.setText(one + "");


                }
 */
                one = Integer.parseInt((tf.getText()));
                calcOp = ((JButton)e.getSource()).getText();
                tf.setText("0");
                jbRes.setEnabled(true);
            }
        };
        ActionListener listRes = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                two = Integer.parseInt((tf.getText()));
                switch (calcOp.charAt(0)){
                    case 43: one += two; break;   // +
                    case 45: one -= two; break;   // -
                    case 42: one *= two; break;   // *
                    case 47: one /= two; break;   // /
                }
                calcOp = "";
                tf.setText(one + "");
            }
        };

        //Создаем панель цифровых кнопок и С
        JPanel panelNum = new JPanel();
        panelNum.setLayout(new GridLayout(4,3));
        JButton jbC = new JButton("C");
        jbC.setFont(font);
        jbC.addActionListener(mylistC);
        panelNum.add(jbC,0);
        for (int i = 0; i < 9; i++){
            JButton jbN = new JButton(String.valueOf(i + 1));
            jbN.addActionListener(mylistNum);
            panelNum.add(jbN);
        }
        JButton jb0 = new JButton("0");
        panelNum.add(jb0);
        add(panelNum, BorderLayout.CENTER);
        jb0.addActionListener(mylistNum);

        //Создаем панель кнопок с математическими операциями
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));
        jbPl.addActionListener(mylistCalc);
        panel.add(jbPl);
        jbSst.addActionListener(mylistCalc);
        panel.add(jbSst);
        jbMpl.addActionListener(mylistCalc);
        panel.add(jbMpl);
        jbDv.addActionListener(mylistCalc);
        panel.add(jbDv);
        add(panel,BorderLayout.EAST);

        //кнопка =
        jbRes.addActionListener(listRes);
        jbRes.setFont(font);
        jbRes.setEnabled(false);
        add(jbRes, BorderLayout.SOUTH);

        setVisible(true);
    }
}
