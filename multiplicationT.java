package a1_flow_of_program;

import java.util.Scanner;

//Take a number as input and print the multiplication table for it.
public class multiplicationT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Get Multiplication table of number :");
        int num= in.nextInt();

        for(int i=1;i<=10;i++){
            int ans=num * i;
            System.out.println(+num+" X "+i+" = "+ans);
        }

    }
}
