package functions;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively
// among three numbers entered by the user.
public class maxmin {
    public static void main(String[] args) {
        int max= max(4,2,6);
        int min= min(4,2,6);
        System.out.println(max);
        System.out.println(min);
    }

    public static int max(int n1, int n2, int n3){
        int max;
        if(n1>n2 && n1>n3){
            max=n1;
        }else if(n2>n1 && n2>n3){
            max=n2;
        }else{
            max=n3;
        }
    return max;
    }

    public static int min(int n1, int n2, int n3){
        int min;
        if(n1<n2 && n1<n3){
            min=n1;
        }else if(n2<n1 && n2<n3){
            min=n2;
        }else{
            min=n3;
        }
        return min;
    }

}
