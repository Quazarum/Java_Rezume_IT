package ru.quazar.gui;

import javax.swing.*;
import java.awt.*;


class MyJButton extends JButton{

    private Color btnColor;
    private int btnWidth;
    private int btnHeight;

    public MyJButton(String title){
        setText(title);
    }

    public MyJButton(String title, int width, int height, Color colButton){
        this(title);
        this.btnWidth = width;
        this.btnHeight = height;
        this.btnColor = colButton;

        setPreferredSize(new Dimension(btnWidth, btnHeight));
        Font font = new Font("Courier", Font.PLAIN, 16);
        setHorizontalTextPosition(SwingConstants.CENTER);
        setBackground(colButton);
        setFont(font);

    }

}
