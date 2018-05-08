package com.groep5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdscherm extends JFrame implements ActionListener {

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


    public Hoofdscherm() {
        setTitle("TSP Simulator");
        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        startStopKnop = new JButton("Start/stop");
        c.fill = GridBagConstraints.HORIZONTAL;

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
