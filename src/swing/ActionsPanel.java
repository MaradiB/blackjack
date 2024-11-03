package swing;

import javax.swing.*;
import java.awt.*;

public class ActionsPanel {
    private JPanel mainBottomPanel;

    public ActionsPanel() {
        mainBottomPanel = new JPanel();
    }
    public JPanel getMainBottomPanel() {
        return mainBottomPanel;
    }
    public void setUp() {
        mainBottomPanel.setLayout(new GridLayout(1, 3));
        mainBottomPanel.setPreferredSize(new Dimension(801, 75));
        JPanel hitStandPanel = new JPanel();
        hitStandPanel.setBackground(Color.RED);
        JPanel betPanel = new JPanel();
        betPanel.setBackground(Color.GREEN);
        JPanel doubleSplitPanel = new JPanel();
        doubleSplitPanel.setBackground(Color.BLUE);
        mainBottomPanel.add(hitStandPanel);
        mainBottomPanel.add(betPanel);
        mainBottomPanel.add(doubleSplitPanel);
    }
}
