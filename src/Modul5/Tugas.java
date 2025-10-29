package Modul5;

import javax.swing.*;
import java.awt.*;

public class Tugas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Contoh BorderLayout");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setLayout(new BorderLayout());

                JLabel label = new JLabel("Label ada di atas (NORTH)", SwingConstants.CENTER);

                JButton btnNorth = new JButton("NORTH");
                JButton btnSouth = new JButton("SOUTH");
                JButton btnWest = new JButton("WEST");
                JButton btnEast = new JButton("EAST");
                JButton btnCenter = new JButton("CENTER");

                btnSouth.addActionListener(e -> label.setText("Tombol di SOUTH diklik!"));
                btnNorth.addActionListener(e -> label.setText("Tombol di NORTH diklik!"));
                btnWest.addActionListener(e -> label.setText("Tombol di WEST diklik!"));
                btnEast.addActionListener(e -> label.setText("Tombol di EAST diklik!"));
                btnCenter.addActionListener(e -> label.setText("Tombol di CENTER diklik!"));

                frame.add(label, BorderLayout.NORTH);
                frame.add(btnSouth, BorderLayout.SOUTH);
                frame.add(btnWest, BorderLayout.WEST);
                frame.add(btnEast, BorderLayout.EAST);
                frame.add(btnCenter, BorderLayout.CENTER);

                frame.setVisible(true);
            }
        });
    }
}

