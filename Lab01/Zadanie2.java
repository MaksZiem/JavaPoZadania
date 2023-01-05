package Lab01;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie2 extends JFrame{
    private JPanel panelMain;
    private JButton displayDateButton;
    private JLabel out;
    private JButton closeButton;

    public Zadanie2() {
        super("zadanie 2");
        this.setContentPane(panelMain);
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        displayDateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
//                System.out.println(dtf.format(now));
                out.setText(dtf.format(now));
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
        Zadanie2 frame = new Zadanie2();
        frame.setVisible(true);
    }
}
