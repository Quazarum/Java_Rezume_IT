package ru.quazar.gui;

import java.awt.*;
import javax.swing.*;

class MyJFrame extends JFrame {

    public MyJFrame(String title, LayoutManager layout, int width, int height) {

        Font font = new Font("Arial", Font.PLAIN, 18);
        setFont(font);
        setTitle(title);
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(layout);
        setIconImage(new ImageIcon("icon.png").getImage());
    }

    public MyJFrame(LayoutManager layout, int width, int height) {
        setTitle("Резюме");
        Font font = new Font("Arial", Font.PLAIN, 18);
        setFont(font);
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(layout);
        setIconImage(new ImageIcon("icon.png").getImage());
    }
}
