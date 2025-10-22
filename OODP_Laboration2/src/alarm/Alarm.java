package alarm;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import time.TimeType;

public class Alarm implements AlarmType {
	JFrame frame = new JFrame();
	private boolean active;
	private TimeType time;

	public Alarm(TimeType time) {
		this.time = time;
		active = true;
	}

	@Override
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public boolean isActive() {
		return active;
	}

	@Override
	public TimeType getTime() {
		return time;
	}

	@Override
	public void doAlarm() {
		if (active) {
			System.out.println("Alarm!!!");
			JPanel alarmPanel = new JPanel();

			alarmPanel.add(new JLabel("Alarm!!!"));
			JDialog dialog = new JDialog((Frame) null, "Alarm", false);
			dialog.setSize(new Dimension(200, 100));
			dialog.add(alarmPanel);

			dialog.setVisible(true);

		} else {
			System.out.println("Alarm is not active");
		}
	}

	public String toString() {
		return time.toString();
	}
}
