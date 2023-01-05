package Lab02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame{
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macRadioButton;
    private JButton okButton;
    private JLabel out;
    private JPanel panelMain;

    public String temp;


    public ImageIcon iconLinux = new ImageIcon(getClass().getResource("linux.png"));
    public ImageIcon iconWindows = new ImageIcon(getClass().getResource("windows.png"));
    public ImageIcon iconApple = new ImageIcon(getClass().getResource("apple.jpeg"));


    public Zadanie1() {
        super("cwiczenie 2");
        this.setSize(400,400);
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp = "linux";
                out.setIcon(iconLinux);
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp = "linux";
                out.setIcon(iconWindows);
            }
        });
        macRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp = "linux";
                out.setIcon(iconApple);
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "wybrales: "+temp);
            }
        });
    }

    public static void main(String[] args) {
        Zadanie1 frame = new Zadanie1();
        frame.setVisible(true);
    }
}
