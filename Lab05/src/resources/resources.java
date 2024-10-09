package resources;

import javax.swing.*;
import java.awt.*;

public class resources {
    public static void main(String[] args) {
        // Create a JFrame to hold the image
        JFrame frame = new JFrame("Display Image Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Load the PNG image from the resources directory
        ImageIcon imageIcon = new ImageIcon(resources.class.getResource("/images/your-image.png"));

        // Create a JLabel and set the icon
        JLabel label = new JLabel(imageIcon);

        // Add the JLabel to the frame
        frame.add(label);

        // Set the frame visibility
        frame.setVisible(true);
    }
}