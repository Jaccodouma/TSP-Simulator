package com.groep5;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdscherm extends JPanel implements ActionListener {

    private JPanel hoofdPanel;

    private JButton startStopKnop;

    private JLabel opl1Label;
    private JPanel opl1Panel;
    private JTextField opl1TextField;

    private JLabel opl2Label;
    private JPanel opl2Panel;
    private JTextField opl2TextField;

    private JLabel opl3Label;
    private JPanel opl3Panel;
    private JTextField opl3TextField;

    private JLabel opl4Label;
    private JPanel opl4Panel;
    private JTextField opl4TextField;

    private Dimension labelDimension;
    private Dimension panelDimension;
    private Dimension textFieldDimension;

    private Border blackline;

    public Hoofdscherm() {
        blackline = BorderFactory.createLineBorder(Color.black);

        labelDimension = new Dimension(250, 50);
        panelDimension = new Dimension(250,250);
        textFieldDimension = new Dimension(250,100);

        hoofdPanel = new JPanel();

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        startStopKnop = new JButton("Start/Stop");
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 2;
        add(startStopKnop, c);

        // OPLOSSING 1
        c.gridx = 0;
        c.gridwidth = 1;

        opl1Label = new JLabel("Oplossing 1", SwingConstants.CENTER);
        c.gridy = 1;
        opl1Label.setPreferredSize(labelDimension);
        opl1Label.setMinimumSize(labelDimension);
        opl1Label.setBorder(blackline);
        add(opl1Label,c);

        opl1Panel = new JPanel();
        c.gridy = 2;
        opl1Panel.setPreferredSize(panelDimension);
        opl1Panel.setMinimumSize(panelDimension);
        opl1Panel.setBorder(blackline);
        add(opl1Panel, c);

        opl1TextField = new JTextField();
        c.gridy = 3;
        opl1TextField.setPreferredSize(textFieldDimension);
        opl1TextField.setMinimumSize(textFieldDimension);
        add(opl1TextField, c);

        // OPLOSSING 2
        c.gridx = 1;

        opl2Label = new JLabel("Oplossing 2", SwingConstants.CENTER);
        c.gridy = 1;
        opl2Label.setPreferredSize(labelDimension);
        opl2Label.setMinimumSize(labelDimension);
        opl2Label.setBorder(blackline);
        add(opl2Label, c);

        opl2Panel = new JPanel();
        c.gridy = 2;
        opl2Panel.setPreferredSize(panelDimension);
        opl2Panel.setMinimumSize(panelDimension);
        opl2Panel.setBorder(blackline);
        add(opl2Panel, c);

        opl2TextField = new JTextField();
        c.gridy = 3;
        opl2TextField.setPreferredSize(textFieldDimension);
        opl2TextField.setMinimumSize(textFieldDimension);
        add(opl2TextField, c);

        // OPLOSSING 3
        c.gridx = 2;

        opl3Label = new JLabel("Oplossing 3", SwingConstants.CENTER);
        c.gridy = 1;
        opl3Label.setPreferredSize(labelDimension);
        opl3Label.setMinimumSize(labelDimension);
        opl3Label.setBorder(blackline);
        add(opl3Label, c);

        opl3Panel = new JPanel();
        c.gridy = 2;
        opl3Panel.setPreferredSize(panelDimension);
        opl3Panel.setMinimumSize(panelDimension);
        opl3Panel.setBorder(blackline);
        add(opl3Panel, c);

        opl3TextField = new JTextField();
        c.gridy = 3;
        opl3TextField.setPreferredSize(textFieldDimension);
        opl3TextField.setMinimumSize(textFieldDimension);
        add(opl3TextField, c);

        // OPLOSSING 4
        c.gridx = 3;

        opl4Label = new JLabel("Oplossing 4", SwingConstants.CENTER);
        c.gridy = 1;
        opl4Label.setPreferredSize(labelDimension);
        opl4Label.setMinimumSize(labelDimension);
        opl4Label.setBorder(blackline);
        add(opl4Label, c);

        opl4Panel = new JPanel();
        c.gridy = 2;
        opl4Panel.setPreferredSize(panelDimension);
        opl4Panel.setMinimumSize(panelDimension);
        opl4Panel.setBorder(blackline);
        add(opl4Panel, c);

        opl4TextField =  new JTextField();
        c.gridy = 3;
        opl4TextField.setPreferredSize(textFieldDimension);
        opl4TextField.setMinimumSize(textFieldDimension);
        add(opl4TextField, c);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
