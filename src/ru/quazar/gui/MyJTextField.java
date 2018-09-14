package ru.quazar.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class MyJTextField extends JTextField {

//    public MyJTextField(String text, int columns) {
//        this(columns);
//        setText(text);
//    }

//    private MyJTextField(int columns) {
//        setColumns(columns);
//        Font font = new Font("Courier", Font.PLAIN, 14);
//        setFont(font);
//        setForeground(Color.GRAY);
//    }

    public MyJTextField(String text, int columns) {
        setColumns(columns);
        Font font = new Font("Arial", Font.PLAIN, 14);
        setFont(font);
//        setForeground(Color.GRAY);
        setText(text);
    }

}
