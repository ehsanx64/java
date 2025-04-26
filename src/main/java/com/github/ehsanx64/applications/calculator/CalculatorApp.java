package com.github.ehsanx64.applications.calculator;

import com.github.ehsanx64.applications.calculator.controller.CalculatorController;
import com.github.ehsanx64.applications.calculator.model.Calculator;
import com.github.ehsanx64.applications.calculator.view.CalculatorView;

public class CalculatorApp {
    public static void main(String[] args) {
        // Create model, view, and controller
        Calculator model = new Calculator();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);
        
        // Start the calculator
        controller.start();
    }
} 