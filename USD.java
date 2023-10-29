package a2_first_java;

import java.util.Scanner;

public class USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount in rupees :");
        float rupees = in.nextFloat();

        float USD= (float) (rupees * 0.012);
        System.out.println("USD of "+rupees+" rs. is :"+USD);

    }
}
