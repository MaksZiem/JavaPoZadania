package lab4.zadania;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Zadanie1 extends JFrame {


    private JList list1;
    private JList list2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panelMain;

    private static List<String> lewo = new ArrayList<String>();
    private static List<String> prawo = new ArrayList<String>();

    private static List<String> temp = new ArrayList<String>();

//    DefaultListModel model = new DefaultListModel();
//    DefaultListModel model2 = new DefaultListModel();

    public String a, b;


    public static void main(String[] args) {
        Zadanie1 exampke = new Zadanie1();
        exampke.setVisible(true);
    }

    public Zadanie1(){
        super("listy");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setContentPane(panelMain);

        lewo.add("lewo 1");
        lewo.add("lewo 2");
        lewo.add("lewo 3");
        prawo.add("prawo 1");
        prawo.add("prawo 2");
        prawo.add("prawo 3");

        createLists();



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = list1.getSelectedIndex();
                if (index != -1) {
                    prawo.add(lewo.get(index));
                    lewo.remove(index);
                    createLists();
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (String elem : lewo) {
                    prawo.add(elem);
                }
                lewo.clear();
                createLists();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index2 = list2.getSelectedIndex();
                if (index2 != -1) {
                    lewo.add(prawo.get(index2));
                    prawo.remove(index2);
                    createLists();
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (String elem : prawo) {
                    lewo.add(elem);
                }
                prawo.clear();
                createLists();
            }
        });
    }

    public void createLists() {

        final DefaultListModel firstModel = new DefaultListModel();
        for (String e : lewo) {
            firstModel.addElement(e);
        }
        list1.setModel(firstModel);


        final DefaultListModel secondModel = new DefaultListModel();
        for (String e : prawo) {
            secondModel.addElement(e);
        }
        list2.setModel(secondModel);
    }

}
