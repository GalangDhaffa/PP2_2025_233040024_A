package Modul6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContohMouseListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh MouseListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(200,200));

        MouseAdapter adapter = new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                panel.setBackground(Color.CYAN);
            }
            public void mouseReleased(MouseEvent e) {
                panel.setBackground(Color.LIGHT_GRAY);
            }
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse di klik di: x=" + e.getX() + ", y=" + e.getY());
            }
        };
        panel.addMouseListener(adapter);

        frame.add(panel);
        frame.setVisible(true);
    }
}
