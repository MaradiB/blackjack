package swing;

import javax.swing.*;

public class Menu {
    private JMenuBar menuBar;
    private JMenu menu;
    public Menu(String[] menuPoints) {
        menuBar = new JMenuBar();
        menuBar.add(Box.createHorizontalGlue());
        menu = new JMenu("Menu");
        for (String point : menuPoints) {
            menu.add(new JMenuItem(point));
        }
        menuBar.add(menu);
    }
    public JMenuBar getMenuBar() {
        return menuBar;
    }
}
