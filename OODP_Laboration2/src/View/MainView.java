package View;

import javax.swing.*;

import controller.Controller;

import java.awt.*;

public class MainView extends JFrame {
    Controller controller;

    JPanel digitalClockPanel = new JPanel();
    JPanel analogClockPanel = new JPanel();
    JPanel selectMethodsPanel = new JPanel();

    DefaultListModel<String> myList = new DefaultListModel<>();
    JList<String> list = new JList<>(myList);
    JTextField inputField = new JTextField(15);

    AnalogClock analogClockDisplay;

    JLabel digitalClockLabel = new JLabel();
    JLabel displayAlarm = new JLabel();

    JButton stopButton = new JButton("Stop");
    JButton resumeButton = new JButton("Resume");
    JButton newTime = new JButton("Lägg till ny tid");
    JButton addAnAlarm = new JButton("Lägg till alarm");
    JButton removeAllAlarms = new JButton("Ta bort alla alarm");

    JTextArea allAlarms = new JTextArea(3, 30);
    JScrollPane scrollPane = new JScrollPane(allAlarms);

    JComboBox<Integer> selectDays;
    JComboBox<Integer> selectHour;
    JComboBox<Integer> selectMinute;
    JComboBox<Integer> selectSeconds;

    JTabbedPane tabbedPane = new JTabbedPane();

    
    public MainView(Controller controller) {
        this.controller = controller;

        analogClockDisplay = new AnalogClock(controller);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Klocka");
        setLayout(new BorderLayout(10, 5));

        add(tabbedPane, BorderLayout.CENTER);
        digitalClockPanel.setLayout(new BorderLayout());
        tabbedPane.add("Digital klocka", digitalClockPanel);
        tabbedPane.add("Analog klocka", analogClockPanel);
        tabbedPane.add("Ställ in tid", selectMethodsPanel);

        Color accent = new Color(117, 158, 235);
        Color textColor = new Color(230, 230, 230);

        digitalClockLabel.setFont(new Font("Oswald", Font.BOLD, 100));
        digitalClockLabel.setForeground(accent);
        digitalClockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        digitalClockPanel.add(digitalClockLabel);
        analogClockPanel.add(analogClockDisplay);

        analogClockPanel.setBackground(new Color(30, 30, 30));
        digitalClockPanel.setBackground(new Color(30, 30, 30));
        selectMethodsPanel.setBackground(new Color(30, 30, 30));

        selectMethodsPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel titleLabel = new JLabel("Aktiva alarm", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleLabel.setForeground(accent);
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 0;
        selectMethodsPanel.add(titleLabel, gbc);

        allAlarms.setEditable(false);
        allAlarms.setBackground(new Color(25, 25, 25));
        allAlarms.setForeground(textColor);
        allAlarms.setFont(new Font("Consolas", Font.PLAIN, 13));
        scrollPane.setPreferredSize(new Dimension(350, 100));
        gbc.gridy++;
        selectMethodsPanel.add(scrollPane, gbc);

        JPanel timeSelectPanel = new JPanel();
        timeSelectPanel.setBackground(new Color(40, 40, 40));

        String[] days = new String[7];
        String[] hour = new String[24];
        String[] minute = new String[60];
        String[] second = new String[60];

        for (int i = 0; i <= 6; i++) {
            days[i] = String.valueOf(i);

        }
        for (int i = 0; i <= 23; i++) {
            hour[i] = String.valueOf(i);

        }
        for (int i = 0; i <= 59; i++) {
            minute[i] = String.valueOf(i);

        }
        for (int i = 0; i <= 59; i++) {
            second[i] = String.valueOf(i);

        }

        selectDays = new JComboBox(days);
        selectHour = new JComboBox(hour);
        selectMinute = new JComboBox(minute);
        selectSeconds = new JComboBox(second);

        JComboBox<?>[] box = { selectDays, selectHour, selectMinute, selectSeconds };

        for (JComboBox<?> comboBoxMenu : box) {
            comboBoxMenu.setBackground(Color.DARK_GRAY);
            comboBoxMenu.setForeground(Color.WHITE);
            comboBoxMenu.setFont(new Font("Alan Sans", Font.BOLD, 15));

        }

        timeSelectPanel.add(new JLabel("Dag:")).setForeground(new Color(186, 186, 186));
        timeSelectPanel.add(selectDays);
        timeSelectPanel.add(new JLabel("Timme:")).setForeground(new Color(186, 186, 186));
        timeSelectPanel.add(selectHour);
        timeSelectPanel.add(new JLabel("Minut:")).setForeground(new Color(186, 186, 186));
        timeSelectPanel.add(selectMinute);
        timeSelectPanel.add(new JLabel("Sekund:")).setForeground(new Color(186, 186, 186));
        timeSelectPanel.add(selectSeconds);

        gbc.gridy++;
        selectMethodsPanel.add(timeSelectPanel, gbc);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(40, 40, 40));

        JButton[] buttons = { addAnAlarm, newTime, stopButton, resumeButton, removeAllAlarms }; // En array av knappar
        for (JButton b : buttons) { // Varje knapp i arrayen skickas in i forloopen och får samma design
            b.setFont(new Font("Segoe UI", Font.BOLD, 13));
            b.setBackground(accent);
            b.setForeground(new Color(215, 217, 217));
            b.setFocusPainted(false);
            b.setBorder(BorderFactory.createEmptyBorder(8, 14, 8, 14));
            b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            buttonPanel.add(b);
        }

        gbc.gridy++;
        selectMethodsPanel.add(buttonPanel, gbc);

        displayAlarm.setForeground(textColor);
        displayAlarm.setFont(new Font("Segoe UI", Font.ITALIC, 13));
        gbc.gridy++;
        selectMethodsPanel.add(displayAlarm, gbc);

        setSize(1200, 600);
        digitalClockLabel.setText(controller.toString());

        allAlarms.setEditable(false);

        Timer timer = new Timer(1000, e -> update_clock());
        timer.start();
        setVisible(true);

        addAnAlarm.addActionListener(e -> setAlarm());
        newTime.addActionListener(e -> {
            controller.setNewTime(Integer.parseInt(selectDays.getSelectedItem().toString()),
                    Integer.parseInt(selectHour.getSelectedItem().toString()),
                    Integer.parseInt(selectMinute.getSelectedItem().toString()),
                    Integer.parseInt(selectSeconds.getSelectedItem().toString()));
        });

        stopButton.addActionListener(e -> {
            timer.stop();
        });

        resumeButton.addActionListener(e -> {
            timer.start();
        });

        removeAllAlarms.addActionListener(e -> {
            controller.removeAlarms();
            allAlarms.setText("");
        });
    }

    public void update_clock() {
        controller.tickTheTack();
        digitalClockLabel.setText(controller.toString());
        analogClockDisplay.revalidate();
        analogClockDisplay.repaint();
    }

    public void setAlarm() {
        controller.setTheAlarm(Integer.parseInt(selectDays.getSelectedItem().toString()),
                Integer.parseInt(selectHour.getSelectedItem().toString()),
                Integer.parseInt(selectMinute.getSelectedItem().toString()),
                Integer.parseInt(selectSeconds.getSelectedItem().toString()));
        allAlarms.setText(controller.showAlarm());
    }
}
