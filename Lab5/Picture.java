package Lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Picture {
    static class ShowImage extends JFrame {
        JTextField jta = new JTextField(30);
        JButton button = new JButton("Load image");
        JLabel lbl = new JLabel("");
        Font fnt = new Font("Times new roman", Font.BOLD, 20);
        ShowImage () {
            super("Show image");
            setLayout(new BorderLayout());
            setSize(600, 600);
            JPanel jp = new JPanel(new FlowLayout());
            jp.add(new JLabel("Path:"));
            jp.add(jta);
            jp.add(button);
            add(jp, BorderLayout.NORTH);
            add(lbl, BorderLayout.CENTER);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        ImageIcon icon = new ImageIcon(jta.getText());
                        lbl.setIcon(icon);
                        setSize(500, 500);
                    } catch (Exception e1) {
                        lbl.setText(e1.getMessage());
                    }
                }
            });

            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new ShowImage();
    }
}
