package com.company.lab.hw5;
import javax.swing.*;

public class MyWindow extends JFrame{
    public MyWindow(){
        setLocation(650, 200);
        setSize(1000, 500);
        Icon imgIcon = new ImageIcon(this.getClass().getResource("giff.gif"));
        JLabel label = new JLabel(imgIcon);
        label.setBounds(668, 43, 46, 14); // You can use your own values
        this.getContentPane().add(label);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
