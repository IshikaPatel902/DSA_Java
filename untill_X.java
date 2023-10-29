package a1_flow_of_program;

import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class untill_X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter numbers (enter 'x' to exit):");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("x")) {
                break; // Exit the loop if 'x' is entered
            }

            try {
                double number = Double.parseDouble(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to exit.");
            }
        }

        System.out.println("Sum of all entered numbers: " + sum);
        scanner.close();
    }
}









