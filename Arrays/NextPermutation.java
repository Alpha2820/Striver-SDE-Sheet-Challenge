package Arrays;

import java.util.*;
/*
   Question - 3: A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
   For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
   The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
   For example, the next permutation of arr = [1,2,3] is [1,3,2].
   Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
   While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
   Given an array of integers nums, find the next permutation of nums.

   The replacement must be in place and use only constant extra memory.
*/

public class NextPermutation {
    public static void reverse(int nums[], int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void findNextRight(int index, int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
    }

    public static void nextPermutation(int arr[]) {
        int index = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(arr, 0, arr.length - 1);
        }
        if (index >= 0) {
            findNextRight(index, arr);
            reverse(arr, index + 1, arr.length - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array is : " + Arrays.toString(arr));
        nextPermutation(arr);
        System.out.println("The next permutation of the array is : " + Arrays.toString(arr));
        sc.close();
    }

}
