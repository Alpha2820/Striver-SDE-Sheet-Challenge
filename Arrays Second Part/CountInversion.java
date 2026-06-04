import java.util.*;

/* 
    Question-12 : Count Inversions in an array.
    Inversion Count for an array indicates – how far the array is from being sorted.
    For any i and j such that i < j and arr[i] > arr[j], there is an inversion between the elements at position i and j.
*/
public class CountInversion {
    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    public static int merge(int[] arr, int low, int mid, int high) {
        int[] left = Arrays.copyOfRange(arr, low, mid + 1);
        int[] right = Arrays.copyOfRange(arr, mid + 1, high + 1);
        int i = 0, j = 0, k = low;
        int count = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                count += (mid + 1) - (low + i);
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = mergeSort(arr, 0, arr.length - 1);
        System.out.println("Number of inversions: " + count);
        sc.close();
    }

}
