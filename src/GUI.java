import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Dictionary;
import java.util.Hashtable;

public class GUI {

    String[] allWindows;
    String currentWindow;

    Dictionary<String, Font> fonts = new Hashtable<>();

    JFrame window;

    public GUI() {}

    public void initFonts() {
        try {
            Font IBM = Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/IBMPlexSerif-SemiBold.ttf")).deriveFont(30f);

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

            ge.registerFont(Font.createFont( Font.TRUETYPE_FONT, new File("./res/fonts/IBMPlexSerif-SemiBold.ttf")));

            fonts.put("IBM", IBM);

            System.out.println("Fonts loaded");
        }
        catch (Exception e) {
            System.out.println("Error while loading fonts ... "  + e);
        }
    }

    public void createLogin() {
        currentWindow = "login";

        window = new JFrame("Manage my drugs :)");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(Color.white);
        window.setSize(800, 480);
        window.setVisible(true);

        JPanel loginPanel = new JPanel();

        JTextArea usernameTextArea = new JTextArea();
        JTextArea passwordTextArea = new JTextArea();

        JButton loginBtn = new JButton();

        JButton createUser = new JButton();
    }
}
