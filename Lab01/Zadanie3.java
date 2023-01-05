package Lab01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie3 extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JLabel out;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JPanel panelMain;

    public int wynik = 0;

    public Zadanie3() {
        super("zadanie 3");
        this.setContentPane(panelMain);
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);



        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik = Integer.parseInt(textField1.getText())+Integer.parseInt(textField2.getText());
                out.setText(String.valueOf(wynik));
            }
        });
        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik = Integer.parseInt(textField1.getText())-Integer.parseInt(textField2.getText());
                out.setText(String.valueOf(wynik));
            }
        });
    }

    public static void main(String[] args) {
        Zadanie3 frame = new Zadanie3();
        frame.setVisible(true);
    }
}
