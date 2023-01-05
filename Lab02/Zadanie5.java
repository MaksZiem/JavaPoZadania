package Lab02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie5 extends JFrame{
    private JPanel panelMain;
    private JCheckBox bigMac40zlCheckBox;
    private JCheckBox wiesMac30zlCheckBox;
    private JCheckBox cola10zlCheckBox;
    private JCheckBox jalapenoBurger20zlCheckBox;
    private JCheckBox MCZestaw60zlCheckBox;
    private JButton zamowButton;

    public int wynik = 0;
    public String text = "";

    public Zadanie5() {
        super("zadanie 5");
        this.setSize(400,400);
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        zamowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (wynik<=100){
                    JOptionPane.showMessageDialog(null, ""+text+"------ \nrazem: "+wynik);
                }else {
                    JOptionPane.showMessageDialog(null, "nie masz tyle pieniedzy ("+wynik+")");

                }
            }
        });
        bigMac40zlCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik+=40;
                text+="bigmac - 40zl\n";
            }
        });
        wiesMac30zlCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik+=30;
                text+="wiesMac - 30zl\n";
            }
        });
        cola10zlCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik+=10;
                text+="Cola - 10zl\n";
            }
        });
        jalapenoBurger20zlCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik+=20;
                text+="Jalapeno - 20zl\n";
            }
        });
        MCZestaw60zlCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik+=60;
                text+="MCZestaw - 60zl\n";
            }
        });
    }

    public static void main(String[] args) {
        Zadanie5 frame = new Zadanie5();
        frame.setVisible(true);
    }
}
