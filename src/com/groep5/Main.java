package com.groep5;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Hoofdscherm hoofdscherm = new Hoofdscherm();

        JFrame frame = new JFrame();
        frame.setTitle("TSP Simulator");
        frame.setSize(1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(hoofdscherm);
    }
}
