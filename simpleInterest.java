package a2_first_java;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class simpleInterest {
    public static void main(String[] args) {

        float p,t,r,si;
        p=13000; t= 13; r = 2;
        si= (p*t*r)/100;
        System.out.println("Simple interest is: "+si);
    }
}
