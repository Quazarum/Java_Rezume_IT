package ru.quazar.gui;

import com.jtattoo.plaf.smart.SmartLookAndFeel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

import ru.quazar.listeners.RezumeButtonActionListener;

public class Rezume_IT {

    public static final String INPUT_TEXT_1 = "период работы                                    ";
    public static final String INPUT_TEXT_2 = "наименование места работы                        ";
    public static final String INPUT_TEXT_3 = "должность работника                              ";
    public static final String INPUT_TEXT_4 = "должностные обязанности                          ";

    private Color colStage01;
    private Color colStage02;
    private Color colDopInf;


    private MyJButton btnStage01;
    private MyJButton btnStage02;
    private MyJButton btnDopInf;

    private ImageIcon myPhoto;

    private MyJLabel labelPeriod;
    private MyJLabel labelName;
    private MyJLabel labelJob;
    private MyJLabel labelFunctions;
    private JLabel labelFstName;
    private JLabel labelLstName;

    private JLabel labelBoris;
    private JLabel labelVacans;
    private JLabel labelVcnName1;
    private JLabel labelVcnName2;
    private JLabel labelVcnName3;
    private JLabel labelVcnName4;


    private MyJTextArea jtxtPeriod;
    private MyJTextArea jtxtName;
    private MyJTextArea jtxtJob;
    private MyJTextArea jtxtFunctions;

    private MyJPanel panel1;
    private MyJPanel panel2;
    private MyJPanel panel3;
    private MyJPanel panel4;
    private MyJPanel panel5;
    private JPanel mainPanel;

    private MyJFrame frame;

    private ScrollPane ScrollMainPane;


    public static void main(String[] args) {

        try {
            // устанавливаем LookAndFeel
            UIManager.setLookAndFeel(new SmartLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            Logger.getLogger(Rezume_IT.class.getName()).log(Level.SEVERE, null, e);
            System.err.println("Can't use the specified look and feel on this platform.");
        } catch (Exception e) {
            System.err.println("Couldn't get specified look and feel, for some reason.");
        }

        JFrame.setDefaultLookAndFeelDecorated(true);

        Rezume_IT rezume_IT = new Rezume_IT();

        rezume_IT.createLabels();
        rezume_IT.createTextFields();
        rezume_IT.createButtons();
        rezume_IT.createPanels();
        rezume_IT.createFrame();

    }

    private void createLabels() {
        labelPeriod = new MyJLabel("Период: ", 550);
        labelName = new MyJLabel("Организация: ", 550);
        labelJob = new MyJLabel("Должность: ", 550);
        labelFunctions = new MyJLabel("Обязанности: ", 550);
        labelVacans = new MyJLabel("Соискание вакансии :", 25);
        labelVcnName1 = new MyJLabel("Системный администратор, ", 30);
        labelVcnName2 = new MyJLabel("Администратор БД, ", 25);
        labelVcnName3 = new MyJLabel("JAVA-программист, ", 25);
        labelVcnName4 = new MyJLabel("WEB-программист. ", 25);
        labelFstName = new MyJLabel("Могильченко ", 200);
        labelLstName = new MyJLabel("Борис Николаевич ", 200);
        myPhoto = new ImageIcon("images/Boris_rezume.jpg");
        labelBoris = new JLabel(myPhoto);

    }

    private void createTextFields() {

        jtxtPeriod = new MyJTextArea(INPUT_TEXT_1, 2, 50);
        jtxtName = new MyJTextArea(INPUT_TEXT_2, 2, 50);
        jtxtJob = new MyJTextArea(INPUT_TEXT_3, 2, 50);
        jtxtFunctions = new MyJTextArea(INPUT_TEXT_4, 10, 50);

    }

    private void createButtons() {

        colStage01 = new Color(255, 100, 255);
        colStage02 = new Color(255, 165, 0);
        colDopInf = new Color(100, 255, 100);

        btnStage01 = new MyJButton("          Стаж 1          ", 125, 25, colStage01);
        ColorAction colStage01Action=new ColorAction(colStage01);
        btnStage02 = new MyJButton("          Стаж 2          ", 125, 25, colStage02);
        ColorAction colStage02Action=new ColorAction(colStage02);
        btnDopInf = new MyJButton("Доп. информация", 125, 25, colDopInf);
        ColorAction colDopInfAction=new ColorAction(colDopInf);

        btnStage01.addActionListener(colStage01Action);
        btnStage02.addActionListener(colStage02Action);
        btnDopInf.addActionListener(colDopInfAction);

        btnStage01.setMnemonic(KeyEvent.VK_1);
        btnStage02.setMnemonic(KeyEvent.VK_2);
        btnDopInf.setMnemonic('L');

        addButtonListeners();
    }

    private void createPanels() {
        panel1 = new MyJPanel("panel1", 990, 50);
        panel1.setPreferredSize(new Dimension(990, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new MyJPanel("panel2", 150, 700);
        panel2.setPreferredSize(new Dimension(150, 700));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));

        panel3 = new MyJPanel("panel3", 600, 700);
        panel3.setPreferredSize(new Dimension(600, 700));
//        panel3.setLayout(new FlowLayout(panel3, FlowLayout.LEFT));

        panel4 = new MyJPanel("panel4", 260, 700);
        panel4.setPreferredSize(new Dimension(260, 700));
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.PAGE_AXIS));

        panel5 = new MyJPanel("panel5", 990, 50);
        panel5.setPreferredSize(new Dimension(990, 50));
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));


        panel1.add(labelVacans);
        panel1.add(labelVcnName1);
        panel1.add(labelVcnName2);
        panel1.add(labelVcnName3);
        panel1.add(labelVcnName4);

        panel2.add(btnStage01);
        panel2.add(btnStage02);
        panel2.add(btnDopInf);

        panel3.add(labelPeriod);
        panel3.add(jtxtPeriod);
        panel3.add(labelName);
        panel3.add(jtxtName);
        panel3.add(labelJob);
        panel3.add(jtxtJob);
        panel3.add(labelFunctions);
        panel3.add(jtxtFunctions);

        panel4.add(labelBoris);

        panel4.add(labelFstName);
        panel4.add(labelLstName);

        mainPanel = new JPanel();

        JScrollPane ScrollMainPane = new JScrollPane();
        ScrollMainPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollMainPane.setPreferredSize(new Dimension(500, 1000));

//        ScrollMainPane.add(panel1);
//        ScrollMainPane.add(panel2);
//        ScrollMainPane.add(panel3);
//        ScrollMainPane.add(panel4);
//        ScrollMainPane.add(panel5);
//        ScrollMainPane.setViewportView(mainPanel);
    }

    private void createFrame() {
        frame = new MyJFrame("Резюме", new BorderLayout(5, 5), 1000, 900);
        frame.setMinimumSize(new Dimension(1000, 900));

        frame.setResizable(false);

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.WEST);
        frame.getContentPane().add(panel3, BorderLayout.CENTER);
//        frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
        frame.getContentPane().add(panel4, BorderLayout.EAST);
//        frame.getContentPane().add(panel5, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

    }

    private void addButtonListeners() {
        RezumeButtonActionListener bl = new RezumeButtonActionListener(labelPeriod, jtxtPeriod, labelName, jtxtName, labelJob, jtxtJob, labelFunctions, jtxtFunctions);

        btnStage01.addActionListener(bl);
        btnStage02.addActionListener(bl);
        btnDopInf.addActionListener(bl);
    }

    private class ColorAction implements ActionListener {
        public ColorAction(Color colElem) {
            backgroundColor = colElem;
        }
        @Override
        public void actionPerformed(ActionEvent colEvent){

/*            if (!(colEvent.getSource() instanceof JButton)) {
                return;
            }

            JButton btn = (JButton) colEvent.getSource();
*/
            panel3.setBackground(backgroundColor);
            jtxtPeriod.setBackground(backgroundColor);
            jtxtName.setBackground(backgroundColor);
            jtxtJob.setBackground(backgroundColor);
            jtxtFunctions.setBackground(backgroundColor);
        }
        private Color backgroundColor;
    }

}
