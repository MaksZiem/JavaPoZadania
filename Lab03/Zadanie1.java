package Lab03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame{
    private JPanel panelMain;
    private JComboBox comboBox1;
    private JButton showButton;
    private JLabel out;

    public Zadanie1() {
        super("zadanie 5");
        this.setContentPane(panelMain);
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out.setText(comboBox1.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null,comboBox1.getSelectedItem().toString());
            }
        });
    }

    public static void main(String[] args) {
        Zadanie1 frame = new Zadanie1();
        frame.setVisible(true);
    }
}
