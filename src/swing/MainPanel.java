package swing;

import javax.swing.*;
import java.awt.*;

public class MainPanel {
    private JPanel panel;
    private int height;
    private int width;
    public MainPanel(Image background, int width, int height) {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background, 0, 0, width, height, this);
            }
        };
        this.height = height;
        this.width = width;
        panel.setLayout(new BorderLayout());
        ActionsPanel actionsPanel = new ActionsPanel();
        actionsPanel.setUp();
        panel.add(actionsPanel.getMainBottomPanel(), BorderLayout.SOUTH);
        PlayingArea playingArea = new PlayingArea(100, width);
        playingArea.setUp();
        DataPanel dataPanel = new DataPanel();
        dataPanel.setUp();
        panel.add(dataPanel.getMainBottomPanel(), BorderLayout.NORTH);
        panel.add(playingArea.getPlayingArea(),BorderLayout.CENTER);
    }
    public JPanel getPanel() {
        return panel;
    }
}

