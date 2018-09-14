package ru.quazar.gui;

//import com.sun.prism.paint.Color;

import java.awt.Component;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class MyJPanel extends JPanel{


    public MyJPanel(String name, int width, int height) {
        setSize(width, height);
        setName(name);
        setBorder(BorderFactory.createEtchedBorder());
    }

    public MyJPanel(String name, int width, int height, Component comp) {
        this(name, width, height);
        add(comp);
    }

    public MyJPanel(String name, int width, int height, LayoutManager layout) {
        this(name, width, height);
        setLayout(layout);
    }

    public MyJPanel(String name, int width, int height, LayoutManager layout, Component comp) {
        this(name, width, height);
        setLayout(layout);
        add(comp);
    }

    public MyJPanel(Color colPanel) {
        setBackground(colPanel);
    }
}
