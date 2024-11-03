package swing;

import java.awt.*;
import javax.swing.*;
public class PlayingArea {
    private JPanel playingArea;
    private int height;
    private int width;

    public PlayingArea(int height, int width) {
        this.height = height;
        this.width = width;
        playingArea = new JPanel();
        playingArea.setLayout(new GridLayout(1,3));
        playingArea.setPreferredSize(new Dimension(width, height));
        playingArea.setBackground(Color.GREEN);
    }
    public JPanel getPlayingArea() {
        return playingArea;
    }
    public void setUp(){
        JPanel playerOnePanel = new JPanel();
        playerOnePanel.setBackground(Color.pink);
        JPanel playerTwoPanel = new JPanel();
        playerTwoPanel.setBackground(Color.BLUE);
        JPanel playerThreePanel = new JPanel();
        playerThreePanel.setBackground(Color.YELLOW);
        playingArea.add(playerOnePanel);
        playingArea.add(playerTwoPanel);
        playingArea.add(playerThreePanel);
    }
}
