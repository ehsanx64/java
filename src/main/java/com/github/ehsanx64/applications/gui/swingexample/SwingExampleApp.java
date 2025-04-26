package com.github.ehsanx64.applications.gui.swingexample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExampleApp extends JFrame implements ActionListener {
    private JTextField inputField;
    private JLabel resultLabel;
    private JButton clearButton;
    private JButton exitButton;

    public SwingExampleApp() {
        // Set up the main window
        setTitle("Swing Example Application");
        setSize(400, 300);
        setLayout(new GridBagLayout());
        
        // Create components
        JLabel titleLabel = new JLabel("Simple Swing Application", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        inputField = new JTextField(20);
        resultLabel = new JLabel("Enter text and click buttons", SwingConstants.CENTER);
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        
        // Add action listeners
        clearButton.addActionListener(this);
        exitButton.addActionListener(this);
        inputField.addActionListener(this);
        
        // Set up layout constraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Add components to the frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(titleLabel, gbc);
        
        gbc.gridy = 1;
        add(inputField, gbc);
        
        gbc.gridy = 2;
        add(resultLabel, gbc);
        
        gbc.gridwidth = 1;
        gbc.gridy = 3;
        gbc.gridx = 0;
        add(clearButton, gbc);
        
        gbc.gridx = 1;
        add(exitButton, gbc);
        
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Center the window on screen
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            inputField.setText("");
            resultLabel.setText("Text cleared");
        } else if (e.getSource() == exitButton) {
            dispose();
            System.exit(0);
        } else if (e.getSource() == inputField) {
            String text = inputField.getText();
            resultLabel.setText("You entered: " + text);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SwingExampleApp app = new SwingExampleApp();
            app.setVisible(true);
        });
    }
} 