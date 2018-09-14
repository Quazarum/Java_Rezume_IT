package ru.quazar.gui;

import javax.swing.*;
import java.awt.*;

public class MyJTextArea extends JTextArea {

    MyJTextArea(String text, int rows, int columns) {
        setRows(rows);
        setColumns(columns);
        Font font = new Font("Arial", Font.PLAIN, 14);
        setFont(font);
//        this(rows, columns);
        setText(text);
        setLineWrap(true);
        setWrapStyleWord(true);
        setEditable(false);
        setFocusable(false);
    }

    MyJTextArea(int rows, int columns) {
        setRows(rows);
        setColumns(columns);
        Font font = new Font("Courier", Font.PLAIN, 14);
        setFont(font);
//        setForeground(Color.GRAY);
        setEditable(false);
        setFocusable(false);
    }

}
