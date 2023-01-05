package Lab01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie5 extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton wyswietlButton;
    private JPanel panelMain;

    public Zadanie5() {
        super("zadanie 5");
        this.setContentPane(panelMain);
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        wyswietlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"nazywasz sie: "+textField1.getText()+" "+textField2.getText()+" i masz "+textField3.getText()+" lat");

            }
        });
    }

    public static void main(String[] args) {
        Zadanie5 frame = new Zadanie5();
        frame.setVisible(true);
    }
}
