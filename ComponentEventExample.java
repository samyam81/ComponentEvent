import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ComponentEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Component Event Example");
        JTextArea textArea = new JTextArea();

        textArea.setBounds(60, 120, 350, 50);
        textArea.setForeground(new Color(255,105,180));

        frame.setSize(500, 500);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(textArea);
        frame.setVisible(true);

        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Perform custom logic when the frame is resized
                textArea.setText("Frame Resized: " + frame.getSize());
            }
        });
    }
}


