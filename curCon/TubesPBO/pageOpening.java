package TubesPBO;

import javax.swing.*;
import java.awt.*;

class pageOpening extends JPanel {
    public pageOpening() {
        setLayout(null);
        setSize(450,255);
        setBackground(Color.lightGray);
        
        JLabel l1 = new JLabel("Welcome to Currency Converter");
        JLabel l2 = new JLabel("In this program you can convert money based");
        JLabel l3 = new JLabel("by Rupiah, USD, Baht & Rupee");
        JLabel l4 = new JLabel("enjoy :)");
        add (l1);
        l1.setBounds(125,85,200,15);
        add (l2);
        l2.setBounds(90,115,400,15);
        add (l3);
        l3.setBounds(130,130,400,15);
        add (l4);
        l4.setBounds(375,200,50,15);
    }
}
