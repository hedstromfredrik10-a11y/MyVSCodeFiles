package f9MVC.view;

import java.awt.BorderLayout;
// import javax.swing.JButton;
import javax.swing.JFrame;
// import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import f9MVC.controller.Controller;

public class PersonMedDjurGUI extends JFrame {

	private Controller controller;
	private JPanel huvudPanel = new JPanel(new BorderLayout());
	private JTextField firstDjur;

	public PersonMedDjurGUI(Controller controller) {
		this.controller = controller;

		firstDjur = new JTextField(controller.getFirstDjur());
		huvudPanel.add(firstDjur, BorderLayout.CENTER);
		add(huvudPanel);

		setSize(400, 400);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
