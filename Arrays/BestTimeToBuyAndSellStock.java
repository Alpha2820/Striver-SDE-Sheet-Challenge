package Arrays;

import java.util.*;
/*
    Question-6 : You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int arr[]) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < arr.length) {
            if (arr[left] < arr[right]) {
                int profit = arr[right] - arr[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
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
        System.out.println("The maximum profit is : " + maxProfit(arr));
        sc.close();
    }

}
