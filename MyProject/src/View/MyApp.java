package View;

import javax.swing.SwingUtilities;
import View.*;

public class MyApp {
    public static void main(String[] args) {
        // User_1 mf = new User_1();
        SwingUtilities.invokeLater(() -> new User_1());
        SwingUtilities.invokeLater(() -> new User_2());
    }
}
