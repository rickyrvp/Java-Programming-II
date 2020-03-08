package clicker.ui;

import clicker.applicationlogic.Calculator;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import static java.awt.BorderLayout.NORTH;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());

        JLabel value = new JLabel("0");
        JButton clickButton = new JButton("Click!");
        clickButton.addActionListener(new ClickListener(this.calculator, value));

        container.add(value, BorderLayout.NORTH);
        container.add(clickButton, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
