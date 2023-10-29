package a2_first_java;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class operators {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number :");
        num1 = in.nextInt();
        System.out.println("Enter second number :");
        num2 = in.nextInt();

        System.out.println("\nSum of the number is "+(num1+num2));
        System.out.println("Substraction of the number is "+(num1-num2));
        System.out.println("Multiplication of the number is "+(num1*num2));
        System.out.println("Division of the number is "+(num1/num2));
    }
}
