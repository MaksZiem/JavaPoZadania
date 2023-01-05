package Lab05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;



public class Zadanie2 extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton addButton;
    private JButton clearButton;
    private JTable table1;
    private JButton deleteButton;
    private JPanel mainPanel;

    public String name, email, phone, addres;

    public Zadanie2() {
        super("Table");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 400);

        String[] columns = {"Name", "Email", "Phone", "Address"};
        String[][] data = {
                {"Bill Gates", "bill@gmail.com", "+222222222", "New York Usa"},
                {"Will", "will@yahoo.com", "+111111111", "France"},
        };



        TableModel tableModel = new DefaultTableModel(data, columns);
        table1.setModel(tableModel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = textField1.getText();
                email = textField2.getText();
                phone = textField3.getText();
                addres = textField4.getText();

                if (name.equals("") || email.equals("") || phone.equals("") || addres.equals("")) JOptionPane.showMessageDialog(null, "Wypelnij wszystkie pola!");
                else if (!email.contains("@")) JOptionPane.showMessageDialog(null, "Najprawdopodobniej wprowadziłeś zły email.");
                else if (!phone.startsWith("+")) JOptionPane.showMessageDialog(null, "Wprowadź także numer kierunkowy zaczynający się od \"+\".");
                else {
                    String[] newData = {name, email, phone, addres};
                    DefaultTableModel model = (DefaultTableModel)table1.getModel();
                    model.addRow(newData);

                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = table1.getSelectedRow();
                if(index>-1) {
                    DefaultTableModel model = (DefaultTableModel) table1.getModel();
                    model.removeRow(index);
                }
            }
        });
    }

    public static void main(String[] args) {
        Zadanie2 example = new Zadanie2();
        example.setVisible(true);
    }
}
