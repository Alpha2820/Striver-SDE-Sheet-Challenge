package Arrays;

import java.util.*;
/*
    Question-5 : Given an array nums containing n objects colored red, white or blue, 
    sort them in-place so that objects of the same color are adjacent, with the colors 
    in the order red, white and blue. in 0's represent red, 1's represent white and 2's represent blue.
*/

public class SortColors {
    public static void sort(int arr[]) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
            arr[i] = 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array is : " + Arrays.toString(arr));
        sort(arr);
        System.out.println("The sorted array is : " + Arrays.toString(arr));
        sc.close();
    }

}
