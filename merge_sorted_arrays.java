package leetcode;

import java.util.Arrays;

public class merge_sorted_arrays{
    public static void main(String[] args)
    {
        // first array
        int[] nums1 = {1, 2, 3, 0, 0, 0};

        // second array
        int[] nums2 = {2, 5, 6};

        //identify the length
        int len1=0;
        int len2=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i] != 0){
                len1++;
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i] != 0){
                len2++;
            }
        }
        System.out.println("length of array 1 is :" +len1);
        System.out.println("length of array 1 is :" +len2);

        int[] c = new int[len1+len2];
        System.out.println(c.length);
        for(int i=0;i<len1;i++){
            c[i]=nums1[i];
        }
        for(int i=0;i<len2;i++){
            c[i+len1]=nums2[i];
        }
        System.out.println(Arrays.toString(c));

        //sorting
        for(int i=0;i<c.length-1;i++){
            if(c[i]>c[i+1]){
                int temp = c[i];
                c[i]=c[i+1];
                c[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
