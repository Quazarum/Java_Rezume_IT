package ru.quazar.gui;

import javax.swing.*;
import java.awt.*;

public class MyJLabel extends JLabel {
//    private String resLabel = "";

    private static int lenLabel;

    public MyJLabel(String title, int len ) {
        lenLabel = title.length();
        Font font = new Font("Arial", Font.PLAIN, 18);
        setFont(font);
//       setForeground(Color.GRAY);
        setText(title);
        LabelName01(title, len);
    }


    public MyJLabel(String title, int len, String sym) {
        lenLabel = title.length();
        Font font = new Font("Arial", Font.PLAIN, 18);
        setFont(font);
//        setForeground(Color.GRAY);
        LabelName02(title, len, sym);
    }


    public static String LabelName01(String text, int len) {
        for(int i = 0; i < len - lenLabel; i++) {
            text = text + " ";
        }
        return text;
    }

    public static String LabelName02(String text, int len, String sym) {
        for(int i = 0; i < len - lenLabel;  i++){
            text = text + sym;
        }
        return text;
    }
}
