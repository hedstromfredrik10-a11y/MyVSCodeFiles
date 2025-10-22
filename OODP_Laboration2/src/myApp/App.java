package myApp;

import javax.swing.SwingUtilities;

import View.MainView;
import clock.WeekAlarmClock;
import controller.Controller;

public class App {
    public static void main(String[] args) {
        WeekAlarmClock clock = new WeekAlarmClock();

        Controller con = new Controller(clock);

        SwingUtilities.invokeLater(() -> new MainView(con));

    }
}
