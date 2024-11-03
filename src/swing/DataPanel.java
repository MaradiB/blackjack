package swing;

import javax.swing.*;
import java.awt.*;

public class DataPanel {
    private JPanel dataPanel;

    public DataPanel() {
        dataPanel = new JPanel();
    }
    public JPanel getMainBottomPanel() {
        return dataPanel;
    }
    public void setUp() {
        dataPanel.setLayout(new GridLayout(1, 3));
        dataPanel.setPreferredSize(new Dimension(800, 100));
        JPanel statistics = new JPanel();
        JLabel stat = new JLabel("Statistics:");
        statistics.add(stat);

        statistics.setBackground(Color.RED);
        JPanel betAmount = new JPanel();
        JLabel bet = new JLabel("Current bet:xxxxFt");
        betAmount.add(bet);
        betAmount.setBackground(Color.GREEN);
        JPanel idk = new JPanel();
        idk.setBackground(Color.BLUE);
        dataPanel.add(statistics);
        dataPanel.add(betAmount);
        dataPanel.add(idk);
    }
}
