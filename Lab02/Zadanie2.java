package Lab02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie2 extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JLabel out;
    private JPanel panelMain;

    Zadanie2(){
        super("JPasswordFieldExample");
        this.setSize(400,400);
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out.setText("username: "+textField1.getText()+" password: "+ String.valueOf(passwordField1.getPassword()));
            }
        });
    }

    public static void main(String[] args) {
        Zadanie2 frame = new Zadanie2();
        frame.setVisible(true);
    }
}
