package Modul5;

import javax.swing.*;
import java.awt.*;

public class Latihan3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Label dan Tombol");
                frame.setSize(400,300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setLayout(new FlowLayout());
                JLabel label = new JLabel("Text Awal");
                JButton button = new JButton("Klik Saya");

                button.addActionListener(e -> {
                    label.setText("Tombol berhasil diklik!");
                });
                frame.add(label);
                frame.add(button);

                frame.setVisible(true);
            }
        }) ;
    }
}
