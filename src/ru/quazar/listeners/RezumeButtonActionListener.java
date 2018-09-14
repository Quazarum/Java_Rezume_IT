package ru.quazar.listeners;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ru.quazar.gui.MyJLabel;
import ru.quazar.gui.MyJTextArea;
import ru.quazar.objects.ListWork;

public class RezumeButtonActionListener implements ActionListener {

    private MyJLabel labelPeriod;
    private MyJTextArea jtxtPeriod;
    private MyJLabel labelName;
    private MyJTextArea jtxtName;
    private MyJLabel labelJob;
    private MyJTextArea jtxtJob;
    private MyJLabel labelFunctions;
    private MyJTextArea jtxtFunctions;

    public RezumeButtonActionListener(MyJLabel labelPeriod, MyJTextArea jtxtPeriod, MyJLabel labelName, MyJTextArea jtxtName, MyJLabel labelJob, MyJTextArea jtxtJob, MyJLabel labelFunctions, MyJTextArea jtxtFunctions) {

        this.labelPeriod = labelPeriod;
        this.jtxtPeriod = jtxtPeriod;
        this.labelName = labelName;
        this.jtxtName = jtxtName;
        this.labelJob = labelJob;
        this.jtxtJob = jtxtJob;
        this.labelFunctions = labelFunctions;
        this.jtxtFunctions = jtxtFunctions;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(e.getSource() instanceof JButton)) {
            return;
        }

        JButton btn = (JButton) e.getSource();

        if (btn.getActionCommand().trim().equals("Стаж 1")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK01.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK01.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK01.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK01.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Стаж 2")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK02.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK02.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK02.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK02.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Доп. информация")) {
            labelPeriod.setText("Дополнительная информация:");
            jtxtPeriod.setText(ListWork.DOP01.getPeriod());
            labelName.setText("Текущее обучение:");
            jtxtName.setText(ListWork.DOP01.getName());
            labelJob.setText("Проживание, регистрация:");
            jtxtJob.setText(ListWork.DOP01.getJob());
            labelFunctions.setText("Контакты:");
            jtxtFunctions.setText(ListWork.DOP01.getFunctions());
        }
    }

}
