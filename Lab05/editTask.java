
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;

public class editTask extends JFrame {
    private JPanel mainPanel1;
    private JButton confirmButton;
    private JTextField textField;
    private JComboBox priorityBox;


    public editTask(String tit,  String prior) {
        super("Edit task");
        this.setContentPane(mainPanel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(400, 300, 400, 300);

        if (!tit.equals("")) {
            textField.setText(tit);

            if (prior.equals("High")) priorityBox.setSelectedIndex(1);
        }

        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String title = textField.getText();
                String priority = priorityBox.getSelectedItem().toString();


                Task tsk = new Task(title, priority);
                Swing.firstListData.add(tsk);
                Swing.toDo.addElement(tsk.getTitle());
                dispose();
            }
        });
    }

    public static void run(String tit, String prior) {
        editTask frame = new editTask(tit, prior);
        frame.setVisible(true);
    }
}
