package View;

import javax.swing.SwingUtilities;
import View.*;

public class MyApp {
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}
