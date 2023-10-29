package a1_flow_of_program;
//Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;
public class HCF_LCM {
    public static void main(String[] args) {
        int num1, num2, temp,temp1,temp2, hcf,lcm;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1= input.nextInt();
        System.out.println("Enter number 2: ");
        num2= input.nextInt();


        temp1 = num1;
        temp2 = num2;

        while(temp2!=0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;

        }
        hcf = temp1;
        lcm = (num1 * num2) / hcf;

        System.out.println("The hcf is : "+hcf);
        System.out.println("The lcm is: "+lcm);
    }
}
