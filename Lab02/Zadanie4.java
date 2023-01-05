package Lab02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie4 extends JFrame {

    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton okButton;
    private JPanel panelMain;

    public String a,b;

    public Zadanie4() {
        super("zadanie 4");
        this.setSize(400,400);
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = new String(passwordField1.getPassword());
                b = new String(passwordField2.getPassword());

                if (a.equals(b)) {
                    if (a.equals("codejava")) JOptionPane.showMessageDialog(null, "Congratulation! You entered correct password.");
                    else JOptionPane.showMessageDialog(null, "Wrong password!");
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords are not matched!");
                }
            }
        });

    }

    public static void main(String[] args) {
        Zadanie4 frame = new Zadanie4();
        frame.setVisible(true);
    }
}
