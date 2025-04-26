package com.github.ehsanx64.applications.calculator.controller;

import com.github.ehsanx64.applications.calculator.model.Calculator;
import com.github.ehsanx64.applications.calculator.view.CalculatorView;

public class CalculatorController {
    private Calculator model;
    private CalculatorView view;

    public CalculatorController(Calculator model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        boolean running = true;
        
        while (running) {
            view.displayMenu();
            int choice = view.getMenuChoice();
            
            switch (choice) {
                case 1: // Add
                    performOperation("add");
                    break;
                case 2: // Subtract
                    performOperation("subtract");
                    break;
                case 3: // Multiply
                    performOperation("multiply");
                    break;
                case 4: // Divide
                    performOperation("divide");
                    break;
                case 5: // Clear
                    model.clear();
                    view.displayMessage("Calculator cleared");
                    break;
                case 6: // Exit
                    running = false;
                    view.displayMessage("Goodbye!");
                    break;
                default:
                    view.displayError("Invalid choice");
            }
        }
    }

    private void performOperation(String operation) {
        double a = view.getNumber("Enter first number: ");
        double b = view.getNumber("Enter second number: ");
        
        try {
            double result = switch (operation) {
                case "add" -> model.add(a, b);
                case "subtract" -> model.subtract(a, b);
                case "multiply" -> model.multiply(a, b);
                case "divide" -> model.divide(a, b);
                default -> throw new IllegalArgumentException("Invalid operation");
            };
            view.displayResult(result);
        } catch (ArithmeticException e) {
            view.displayError(e.getMessage());
        }
    }
} 