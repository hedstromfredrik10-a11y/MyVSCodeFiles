package MyApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindows extends JFrame {

    public MainWindows() {
        
    }

    public void setUpGui() {
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JButton button1 = new JButton("Undo");
        JButton button2 = new JButton("Uppdatera text");
        JLabel label = new JLabel("My label");
        JTextField textField = new JTextField(10);

        setLayout(new BorderLayout(10, 5));
        setSize(640, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Min App");
        setVisible(true);
        setLocationRelativeTo(null);
        add(panel2);
        panel2.setBackground(Color.DARK_GRAY);

        add(panel, BorderLayout.NORTH);
        panel.setSize(200, 200);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.BLUE);

        panel.add(button1);
        button1.setToolTipText("Cool text 1");

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (label.getText().equals("My label")) {
                    System.out.println("Texten är redan original");
                } else {
                    label.setText("My label");

                }
            }
        });

        panel.add(button2);
        button2.setToolTipText("Cool text 2");

        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (label.getText().equals("Texten har blivit uppdaterad")) {
                    System.out.println("Texten är redan uppdaterad");
                } else {
                    label.setText("Texten har blivit uppdaterad");

                }
            }
        });

        panel.add(label);
        label.setForeground(Color.BLACK);

        panel.add(textField);
        textField.setToolTipText("Skriv in en text");

        textField.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(textField.getText());
                textField.removeAll();
            }
            
        });

    }
}
