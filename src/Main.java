/**
 * Main.java
 * Entry point for the JavaProject application
 * Demonstrates geometric calculations and student marks management
 */

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    calculateCircleArea();
                    break;
                case 2:
                    calculateRectangleArea();
                    break;
                case 3:
                    calculateSphereArea();
                    break;
                case 4:
                    calculateStudentMarks();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using JavaProject! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
            }
        }
        scanner.close();
    }

    /**
     * Displays the main menu
     */
    private static void displayMenu() {
        System.out.println("\n========== JavaProject Menu ==========");
        System.out.println("1. Calculate Circle Area");
        System.out.println("2. Calculate Rectangle Area");
        System.out.println("3. Calculate Sphere Properties");
        System.out.println("4. Calculate Student Marks");
        System.out.println("5. Exit");
        System.out.println("=====================================");
    }

    /**
     * Gets user's menu choice
     * @return the user's choice
     */
    private static int getUserChoice() {
        System.out.print("Enter your choice (1-5): ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /**
     * Calculates and displays circle area
     */
    private static void calculateCircleArea() {
        try {
            System.out.print("Enter the radius of the circle: ");
            double radius = Double.parseDouble(scanner.nextLine());
            double area = GeometricCalculator.calculateCircleArea(radius);
            System.out.println("Area of Circle with radius " + radius + " = " + String.format("%.2f", area) + " square units");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Calculates and displays rectangle area
     */
    private static void calculateRectangleArea() {
        try {
            System.out.print("Enter the length of the rectangle: ");
            double length = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the width of the rectangle: ");
            double width = Double.parseDouble(scanner.nextLine());
            double area = GeometricCalculator.calculateRectangleArea(length, width);
            System.out.println("Area of Rectangle = " + String.format("%.2f", area) + " square units");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Calculates and displays sphere properties
     */
    private static void calculateSphereArea() {
        try {
            System.out.print("Enter the radius of the sphere: ");
            double radius = Double.parseDouble(scanner.nextLine());
            double surfaceArea = GeometricCalculator.calculateSphereSurfaceArea(radius);
            double volume = GeometricCalculator.calculateSphereVolume(radius);
            System.out.println("Surface Area of Sphere = " + String.format("%.2f", surfaceArea) + " square units");
            System.out.println("Volume of Sphere = " + String.format("%.2f", volume) + " cubic units");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Calculates and displays student marks
     */
    private static void calculateStudentMarks() {
        try {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter number of subjects (1-5): ");
            int numberOfSubjects = Integer.parseInt(scanner.nextLine());

            StudentMarksCalculator student = new StudentMarksCalculator(studentName, numberOfSubjects);

            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + " (0-100): ");
                double marks = Double.parseDouble(scanner.nextLine());
                student.setMark(i, marks);
            }

            System.out.println("\n========== Student Result ==========");
            System.out.println(student.getStudentInfo());
            System.out.println("====================================\n");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
