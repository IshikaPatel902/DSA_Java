package a1_flow_of_program;

import java.util.Scanner;

//Input a year and find whether it is a leap year or not.
public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year :");
        int year= in.nextInt();

        if(year % 4 == 0){
            System.out.println("Year "+year+" is a Leap year.");
        }
        else{System.out.println("Year "+year+" is Not a Leap year.");}
    }
}
