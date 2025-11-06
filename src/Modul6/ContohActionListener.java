package Modul6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContohActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh ActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Halo, klik tombol di bawah!");
        JButton button = new JButton("KLik Saya!");

        ActionListener Listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("tombol telah di klik!");
            }
        };

        button.addActionListener(Listener);
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}
