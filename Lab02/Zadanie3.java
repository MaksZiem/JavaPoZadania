package Lab02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie3 extends JFrame{
    private JPanel panelMain;
    private JCheckBox javaPrice3500PlnCheckBox;
    private JCheckBox cPrice3000PlnCheckBox;
    private JCheckBox pythonPrice5000PlnCheckBox;
    private JCheckBox cPrice4000PlnCheckBox;
    private JButton okButton;

    public int wynik = 0;
    public String text = "";

    public Zadanie3() {
        super("cwiczenie 3");
        this.setSize(400,400);
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        javaPrice3500PlnCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik+=3500;
                text+="java #price 3500 \n";
            }
        });
        cPrice3000PlnCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik+=3000;
                text+="c# #price 3000 \n";
            }
        });
        cPrice4000PlnCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik+=4000;
                text+="c++ #price 4000 \n";
            }
        });
        pythonPrice5000PlnCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik+=5000;
                text+="python #price 5000 \n";
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, ""+text+"------ \nrazem: "+wynik);

            }
        });
    }

    public static void main(String[] args) {
        Zadanie3 frame = new Zadanie3();
        frame.setVisible(true);
    }
}
