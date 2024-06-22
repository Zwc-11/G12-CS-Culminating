package CS.Version1_L;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Homepage implements ActionListener {
    JFrame frame = new JFrame("CJ Physics Tutorial - Homepage");
    JLabel label = new JLabel();

    JButton myButton = new JButton("Resources");
    JButton myButton2 = new JButton("Practice");
    JButton myButton3 = new JButton("Quiz");

    Color buttonColor = Main.color2;
    Color hoverColor = Main.color3;

    Homepage() {
        label.setText("Welcome to CJ Physics Tutorial");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(Color.white);
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 60));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        myButton.setBounds(300, 750, 300, 60);
        myButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
        myButton.setFocusable(false);
        myButton.setBackground(buttonColor);
        myButton.addActionListener((ActionListener) this);
        myButton.addMouseListener(mouseHover());

        myButton2.setBounds(Main.screenWidth / 2 - 150, 750, 300, 60);
        myButton2.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
        myButton2.setFocusable(false);
        myButton2.setBackground(buttonColor);
        myButton2.addActionListener((ActionListener) this);
        myButton2.addMouseListener(mouseHover());

        myButton3.setBounds(Main.screenWidth - 600, 750, 300, 60);
        myButton3.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
        myButton3.setFocusable(false);
        myButton3.setBackground(buttonColor);
        myButton3.addActionListener((ActionListener) this);
        myButton3.addMouseListener(mouseHover());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.getContentPane().setBackground(Main.color4);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(myButton);
        frame.add(myButton2);
        frame.add(myButton3);
        frame.add(label);
    }

    private MouseListener mouseHover() {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(hoverColor);
            }

            public void mouseExited(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(buttonColor);
            }
        };
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            frame.dispose();
            new Resources();
        } else if (e.getSource() == myButton2) {
            frame.dispose();
            new Practice();
        } else if (e.getSource() == myButton3) {
            frame.dispose();
            new Quiz();
        }
    }
}
