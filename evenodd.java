package a2_first_java;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class evenodd {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = in.nextInt();

        if(num%2 == 0){
            System.out.println("It is an Even number");
        }
        else {
            System.out.println("It is an Odd number");
        }
    }
}
