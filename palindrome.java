package a2_first_java;

import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j;
        System.out.println("Enter a string value");
        String str = in.next();
        char[] c = new char[0];
        for (i = 0; i <= str.length(); i++) {
            for (j = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) != str.charAt(j)) {
                    System.out.println("It is not a palindrome");
                    System.exit(0);
                } else {
                    c = new char[str.length()];
                    c[i] = str.charAt(j);
                }
            }
        }
        if (str.toCharArray() == c) {
            System.out.println("It is palindrome");
        }


    }
}
