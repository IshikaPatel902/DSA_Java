package a1_flow_of_program;

import java.sql.SQLOutput;
import java.util.Scanner;

//Take two numbers and print the sum of both.
public class sumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1= in.nextInt();
        System.out.println("Enter number 1:");
        int num2= in.nextInt();

        int sum= num1 + num2;
        System.out.println("Sum of "+num1+" and "+num2+" is :"+sum);

    }
}
