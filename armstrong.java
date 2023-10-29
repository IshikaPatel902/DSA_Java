package a2_first_java;

import java.util.Scanner;
//To find Armstrong Number between two given number. //153
public class armstrong {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num1,r,sum,og;
        System.out.println("Enter the number :");
        num1 = in.nextInt();
        sum=0;
        og=num1;
        while(num1 !=0) {
            r = num1 % 10;            //3    //5      //1
            num1 /= 10;               //15   //1      //0
            sum += r*r*r;             //27 + //125  + //1   = 153
        }
        System.out.println("Sum of the number is :"+sum);
        if ( og ==sum){
            System.out.println("it is an armstrong number");
        }else{
            System.out.println("it is not an armstrong number");
        }
    }
}
