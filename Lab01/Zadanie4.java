package Lab01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie4 extends JFrame{
    private JTextField textField1;
    private JLabel out;
    private JButton przeliczButton;
    private JPanel panelMain;

    public double wynik = 0;

    public Zadanie4() {
        super("zadanie 4");
        this.setContentPane(panelMain);
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        przeliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik = Integer.parseInt(textField1.getText())*9/5+32;
                out.setText(String.valueOf(wynik));
            }
        });
    }

    public static void main(String[] args) {
        Zadanie4 frame = new Zadanie4();
        frame.setVisible(true);
    }
}
