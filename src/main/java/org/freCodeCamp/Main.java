package org.freCodeCamp;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello palindrome");

        JFrame jframe = new JFrame("Palindrome Checker");
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
            Checker ofWords = new Checker(input);
            

        jframe.setBounds(100,100,140,40);

        JButton btn = new JButton("Submit");
        btn.setBounds(100,100,130,30);

        JLabel label = new JLabel();
        label.setText("Enter word:");
        label.setBounds(10,10,100,100);

        JLabel label1 = new JLabel();
        label1.setBounds(10,10, 200,100);


        JTextField textField = new JTextField();
        textField.setBounds(110,50,130,30);

        jframe.add(btn);
        jframe.add(label1);
        jframe.add(label);
        jframe.add(textField);


        jframe.setSize(300,300);
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}