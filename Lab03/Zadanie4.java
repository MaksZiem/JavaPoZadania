package Lab03;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Zadanie4 extends JFrame{
    private JList list1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton saveNewButton;
    private JButton saveExistingButton;
    private JPanel panelMain;
    private JLabel YearsOut;

    private static List<Object> listData = new ArrayList<Object>();
    final private static Object[] jk = {"Jan Kowalski", "jk132441@stud.ur.edu.pl", "534 439 523", "ul. Ochotnicza 4", LocalDate.of(2001, 4, 14)};
    final private static Object[] mn = {"Marian Nowak", "jnowak@ur.edu.pl", "549 871 221", "ul. Strażacka 58", LocalDate.of(1991, 12, 13)};
    final private static Object[] jn = {"Janina Urban", "jn122267@stud.ur.edu.pl", "501 312 495", "ul. Krzywa 102", LocalDate.of(1999, 1, 27)};
    final private static Object[] en = {"Ewelina Nowak-Maciąg", "ewelcia@gmail.com", "487 675 291", "ul. Matysowska 102", LocalDate.of(1989, 6, 19)};
    private static List<String> names = new ArrayList<String>();


    Zadanie4(){
        super("Contact Form");
        this.setContentPane(panelMain);
        this.setBounds(200, 200, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        listData.addAll(List.of(jk));
        listData.addAll(List.of(mn));
        listData.addAll(List.of(jn));
        listData.addAll(List.of(en));

        names.add(String.valueOf(jk[0]));
        names.add(String.valueOf(mn[0]));
        names.add(String.valueOf(jn[0]));
        names.add(String.valueOf(en[0]));

        createList();


        saveNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Object> newContact = new ArrayList<Object>();
                newContact.add(textField1.getText());
                newContact.add(textField2.getText());
                newContact.add(textField3.getText());
                newContact.add(textField4.getText());
                newContact.add(LocalDate.parse(String.valueOf(textField5.getText())));

                listData.addAll(newContact);
                names.add(String.valueOf(newContact.get(0)));

                int birth = LocalDate.parse(newContact.get(4).toString()).getYear();
                int now = LocalDate.now().getYear();

                int years = now - birth;

                YearsOut.setText(years + " years");
                createList();
            }
        });
        saveExistingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = list1.getSelectedIndex();

                listData.set(index*5, textField1.getText());
                listData.set(index*5 + 1, textField2.getText());
                listData.set(index*5 + 2, textField3.getText());
                listData.set(index*5 + 3, textField4.getText());
                listData.set(index*5 + 4, LocalDate.parse(String.valueOf(textField5.getText())));

                names.set(index, textField1.getText());

                int birth = LocalDate.parse(listData.get(index*5+4).toString()).getYear();
                int now = LocalDate.now().getYear();

                int years = now - birth;
                YearsOut.setText(years + " years");

                createList();
                saveExistingButton.setEnabled(false);
            }
        });
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = list1.getSelectedIndex();

                textField1.setText(listData.get(index*5).toString());
                textField2.setText(listData.get(index*5 + 1).toString());
                textField3.setText(listData.get(index*5 + 2).toString());
                textField4.setText(listData.get(index*5 + 3).toString());
                textField5.setText(listData.get(index*5 + 4).toString());

                int birth = LocalDate.parse(listData.get(index*5+4).toString()).getYear();
                int now = LocalDate.now().getYear();

                int years = now - birth;
                YearsOut.setText(years + " years");

                saveExistingButton.setEnabled(true);
            }
        });
    }

    public void createList() throws IndexOutOfBoundsException {
        try {
            DefaultListModel model = new DefaultListModel();
            model.addAll(names);
            list1.setModel(model);
        } catch(IndexOutOfBoundsException e) {}
    }

    public static void main(String[] args) {
        Zadanie4 frame = new Zadanie4();
        frame.setVisible(true);
    }
}
