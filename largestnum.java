package a2_first_java;

import java.util.Scanner;
//Take 2 numbers as input and print the largest number.
public class largestnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number :");
        num1 = in.nextInt();
        System.out.println("Enter second number :");
        num2 = in.nextInt();

        if (num1>num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }
}
