package Lab01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame {

    private JPanel panelMain;
    private JButton infoButton;
    private JButton closeButton;

    public Zadanie1() {
        super("zadanie 1");
        this.setContentPane(panelMain);
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello");
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Zadanie1 frame = new Zadanie1();
        frame.setVisible(true);
    }
}
