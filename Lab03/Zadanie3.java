package Lab03;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Zadanie3 extends JFrame{
    private JList list1;
    private JList list2;
    private JButton showButton;
    private JPanel panelMain;
    private JLabel labelOut;

    private static List<String> lista1 = new ArrayList<String>();
    private static List<String> lista2 = new ArrayList<String>();

    public String a, b;

    public Zadanie3() {
        super("Contact Form");
        this.setContentPane(panelMain);
        this.setBounds(200, 200, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        lista1.add("c++");
        lista1.add("c#");
        lista1.add("java");
        lista1.add("java script");

        lista2.add("visual studio");
        lista2.add("visual studio code");
        lista2.add("intellij idea");
        lista2.add("PyCharm");

        DefaultListModel model = new DefaultListModel();
        model.addAll(lista1);
        list1.setModel(model);

        DefaultListModel model2 = new DefaultListModel();
        model2.addAll(lista2);
        list2.setModel(model2);

        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                a = list1.getSelectedValue().toString();
            }
        });
        list2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                b = list2.getSelectedValue().toString();
            }
        });
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelOut.setText("Programming language: "+a+", editor selected: "+" "+b);
            }
        });
    }

    public static void main(String[] args) {
        Zadanie3 example = new Zadanie3();
        example.setVisible(true);
    }
}
