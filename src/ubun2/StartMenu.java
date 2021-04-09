package ubun2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenu extends JFrame {
    JLabel snakeTitle = new JLabel("Snake");
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton play = new JButton("Play");
    JButton quit = new JButton("Quit");

    StartMenu(){
        frame.setTitle("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        panel.setBorder(BorderFactory.createEmptyBorder(100,250,250,250));

        panel.add(snakeTitle);
        panel.add(play);
        panel.add(quit);
        frame.add(panel, BorderLayout.CENTER);
        //frame.pack();

        play.addActionListener(new PlayListener());
        quit.addActionListener(new QuitListener());
        frame.setVisible(true);
    }

    private class PlayListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new GameFrame();
            frame.dispose();
        }
    }

    private class QuitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
