import java.util.*;

/*
    Question-9 : You are given two integer arrays nums1 and nums2, sorted in 
    non-decreasing order, and two integers m and n, representing the number of 
    elements in nums1 and nums2 respectively.
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    The final sorted array should not be returned by the function, but instead
    be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
    where the first m elements denote the elements that should be merged, and the last n 
    elements are set to 0 and should be ignored. nums2 has a length of n.
*/

public class MergeSortedArray {
    public static void merge(int arr1[], int m, int arr2[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first Array");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of the second Array");
        int size2 = sc.nextInt();
        int arr1[] = new int[size1 + size2];
        int arr2[] = new int[size2];
        System.out.println("Enter the elements of the first Array");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second Array");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("The original first array is : " + Arrays.toString(arr1));
        System.out.println("The original second array is : " + Arrays.toString(arr2));
        merge(arr1, size1, arr2, size2);
        System.out.println("The merged array is : " + Arrays.toString(arr1));
        sc.close();
    }

}
