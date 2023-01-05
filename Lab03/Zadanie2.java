package Lab03;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Zadanie2 extends JFrame{
    private JTable table1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField a5000TextField;
    private JButton IMDBPageButton;
    private JButton episodeRatingsButton;
    private JPanel panelMain;


    Zadanie2(){
        super("Table example");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 400);

        String[] columns = {"Title", "Year", "Rating", "Num votes"};
        String[][] data = {
                {"Top Gun: Marverick", "2022", "8.13", "50977"},
                {"Everything Everywhere All at once 2022", "2022", "7.53", "16746"},
                {"Batman", "2022", "7.41", "87181"},
        };

        TableModel tableModel = new DefaultTableModel(data, columns);
        table1.setModel(tableModel);
    }

    public static void main(String[] args) {
        Zadanie2 frame = new Zadanie2();
        frame.setVisible(true);
    }
}
