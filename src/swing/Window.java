package swing;

import javax.swing.*;
import java.awt.*;

public class Window {
    private JFrame frame;
    private Image background;
    private int width;
    private int height;
    public Window(String title, String backgroundPath, int width, int height) {
        this.width = width;
        this.height = height;

        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        String[] menuPoints = {"New Game","Save game", "New player", "Exit"};
        frame.setJMenuBar(new Menu(menuPoints).getMenuBar());
        background = new ImageIcon(backgroundPath).getImage();
        frame.add(new MainPanel(background, width, height).getPanel());
        frame.setVisible(true);

    }
}
