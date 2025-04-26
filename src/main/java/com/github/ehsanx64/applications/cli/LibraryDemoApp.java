package com.github.ehsanx64.applications.cli;

import com.github.ehsanx64.libraries.api.DataProcessor;
import com.github.ehsanx64.libraries.api.SimpleDataProcessor;
import com.github.ehsanx64.libraries.utils.StringUtils;
import com.github.ehsanx64.libraries.utils.MathOperations;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LibraryDemoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataProcessor processor = new SimpleDataProcessor();
        
        System.out.println("Library Demo Application");
        System.out.println("1. String Operations");
        System.out.println("2. Math Operations");
        System.out.println("3. Data Processing");
        System.out.println("4. Exit");
        
        while (true) {
            try {
                System.out.print("\nEnter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter a string: ");
                        String input = scanner.nextLine();
                        System.out.println("Reversed: " + StringUtils.reverse(input));
                        System.out.println("Is palindrome: " + StringUtils.isPalindrome(input));
                        System.out.println("Capitalized: " + StringUtils.capitalize(input));
                        break;
                        
                    case 2:
                        System.out.print("Enter a number: ");
                        int number = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.println("Factorial: " + MathOperations.factorial(number));
                        System.out.println("Is prime: " + MathOperations.isPrime(number));
                        System.out.println("Fibonacci: " + MathOperations.fibonacci(number));
                        break;
                        
                    case 3:
                        System.out.print("Enter data to process: ");
                        String data = scanner.nextLine();
                        if (processor.validate(data)) {
                            System.out.println("Processed: " + processor.process(data));
                            System.out.println("Transformed: " + processor.transform(data));
                        } else {
                            System.out.println("Invalid input");
                        }
                        break;
                        
                    case 4:
                        System.out.println("Goodbye!");
                        scanner.close();
                        return;
                        
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
} 