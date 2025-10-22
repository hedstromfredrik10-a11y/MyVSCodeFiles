package MyApp;

import javax.swing.SwingUtilities;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainWindows());

        MainWindows main = new MainWindows();
        main.setUpGui();

    }
}
