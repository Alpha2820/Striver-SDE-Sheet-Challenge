package Arrays;

import java.util.*;
/*
    Question-4 : Given an integer array nums, find the subarray with the largest sum, 
    and return its sum.
*/

public class KadaneAlgorithm {
    public static int maxSubArray(int arr[]) {
        int maxAns = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxAns) {
                maxAns = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxAns;
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
        System.out.println("The maximum sum of the subarray is : " + maxSubArray(arr));
        sc.close();
    }

}
