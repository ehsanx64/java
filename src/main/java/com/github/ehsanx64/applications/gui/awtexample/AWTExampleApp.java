package com.github.ehsanx64.applications.gui.awtexample;

import java.awt.*;
import java.awt.event.*;

public class AWTExampleApp extends Frame implements ActionListener {
    private TextField inputField;
    private Label resultLabel;
    private Button clearButton;
    private Button exitButton;

    public AWTExampleApp() {
        // Set up the main window
        setTitle("AWT Example Application");
        setSize(400, 300);
        setLayout(new GridBagLayout());
        
        // Create components
        Label titleLabel = new Label("Simple AWT Application", Label.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        inputField = new TextField(20);
        resultLabel = new Label("Enter text and click buttons", Label.CENTER);
        clearButton = new Button("Clear");
        exitButton = new Button("Exit");
        
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
        
        // Add window listener for closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
        
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
        AWTExampleApp app = new AWTExampleApp();
        app.setVisible(true);
    }
} 