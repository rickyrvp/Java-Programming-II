
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private JTextField outputField;
    private JTextField inputField;
    private JButton plus;
    private JButton minus;
    private JButton z;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));
        this.outputField = new JTextField("0");
        this.outputField.setEnabled(false);
        this.inputField = new JTextField();
        this.plus = new JButton("+");
        this.minus = new JButton("-");
        this.z = new JButton("Z");
        this.z.setEnabled(false);

        ButtonListener listener = new ButtonListener(plus, minus, z, inputField, outputField);
        this.plus.addActionListener(listener);
        this.minus.addActionListener(listener);
        this.z.addActionListener(listener);

        container.add(this.outputField);
        container.add(this.inputField);

        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(new GridLayout(1, 3));
        lowerPanel.add(this.plus);
        lowerPanel.add(this.minus);
        lowerPanel.add(this.z);
        container.add(lowerPanel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
