package Forelasning_9;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    // Skapa huvudpanel
	JPanel panel = new JPanel(new BorderLayout());

	// Skapa objekt av våran nya panel
	JPanel circle = new CircleView();

	public MainFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// lägg till våran nya komponent i huvudpanelen
		panel.add(circle);

		// lägg till huvudpanelen i JFrame
		add(panel);

		setSize(400, 400);
		setVisible(true);
	}

}
