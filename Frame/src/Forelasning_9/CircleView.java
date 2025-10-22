package Forelasning_9;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;

public class CircleView extends JPanel {

	private double angle;
	
	public CircleView() {
		setBackground(Color.black);
		angle = Math.PI/3;
		Timer timer = new Timer(1000, e -> {updateAngle(); repaint();});
		timer.start();
	}
	
	private void updateAngle() {
		angle += 1; 
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// Anropa JPanels paintComponent-metod först: 
		// Vi behöver JPanels painComponent OCH våran egen paintComponent, 
		// vi vill inte skriva över (överskugga) JPanels metod helt, utan bara utöka den	
		super.paintComponent(g);
	
		// Utöka nu painComponent med egen grafik:
		g.setColor(Color.white);
		
		// Ta fram storlek på aktuell grafisk komponent (JPanel i detta fall)
		int width = getWidth();
		int height = getHeight();
		
		// Ta fram center-koord
		int xCenter = width/2;
		int yCenter = height/2;
		
		// Rita horisontell linje
		g.drawLine(0, yCenter, width, yCenter);
		
		// Rita vertikal linje
		g.drawLine(xCenter, 0, xCenter, height);
		
		// Rita cirkel:
		g.drawOval(0, 0, width, height);
		
		// Rita röd linje i cirkeln med given vinkel "angle"
		double radius = height/2;
		double xEnd = xCenter+radius*Math.cos(angle);
		double yEnd = yCenter -radius*Math.sin(angle);
		g.setColor(Color.red);
		g.drawLine(xCenter, yCenter, (int)xEnd, (int)yEnd);
	}

}
