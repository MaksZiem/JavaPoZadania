package Lab04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie2 extends JFrame{
    private JEditorPane editor;
    private JComboBox comboBox1;
    private JButton iButton;
    private JButton bButton;
    private JButton zButton;
    private JButton pButton;
    private JPanel panelMain;

    private boolean bold=false, italic=false;


    public Zadanie2() {
        super("Edytor tesktu");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panelMain);
        this.setSize(600,600);

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = comboBox1.getSelectedItem().toString();

                if (color.equals("czarny")) editor.setForeground(Color.BLACK);
                else if (color.equals("czerwony")) editor.setForeground(Color.RED);
                else if (color.equals("zielony")) editor.setForeground(Color.GREEN);
                else if (color.equals("fioletowy")) editor.setForeground(Color.MAGENTA);
                else if (color.equals("niebieski")) editor.setForeground(Color.BLUE);
                else if (color.equals("zolty")) editor.setForeground(Color.YELLOW);
                else if (color.equals("szary")) editor.setForeground(Color.GRAY);
            }
        });

        iButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()));
                    italic = true;
                } else if (!italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()));
                    italic = true;
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN + Font.BOLD, editor.getFont().getSize()));
                    italic = false;
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()));
                    italic = false;
                }
            }
        });
        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()));
                    bold = true;
                } else if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.BOLD, editor.getFont().getSize()));
                    bold = true;
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()));
                    bold = false;
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()));
                    bold = false;
                }
            }
        });
        zButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()+1));
                } else if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()+1));
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()+1));
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.BOLD, editor.getFont().getSize()+1));
                }
            }
        });
        pButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()-1));
                } else if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()-1));
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()-1));
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.BOLD, editor.getFont().getSize()-1));
                }
            }
        });


    }

    public static void main(String[] args) {
        Zadanie2 frame = new Zadanie2();
        frame.setVisible(true);
    }
}
