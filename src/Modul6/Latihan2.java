package Modul6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // ← ini penting!

public class Latihan2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Konverter Suhu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel labelC = new JLabel("Celcius:");
        JTextField inputC = new JTextField(10);
        JButton btnKonversi = new JButton("Konversi");
        JLabel labelF = new JLabel("Fahrenheit:");
        JLabel hasilF = new JLabel("");

        frame.add(labelC);
        frame.add(inputC);
        frame.add(btnKonversi);
        frame.add(labelF);
        frame.add(hasilF);

        // Event Handling untuk tombol konversi
        btnKonversi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celcius = Double.parseDouble(inputC.getText());
                    double fahrenheit = (celcius * 9 / 5) + 32;
                    hasilF.setText(String.format("%.2f °F", fahrenheit));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Input tidak valid! Masukkan angka.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}

