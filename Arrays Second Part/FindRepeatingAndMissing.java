import java.util.*;

/* 
    Question-11 : Given an array of integers nums containing 
    n + 1 integers where each integer is in the range [1, n] 
    inclusive. One number is repeated twice and one number is missing.
    Find the repeated and missing numbers.
*/
public class FindRepeatingAndMissing {
    public static int findRepeating(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int num = Math.abs(arr[i]);
            if (arr[num] < 0) {
                return num;
            }
            arr[num] = -arr[num];
        }
        return 0;
    }

    public static int findMissing(int arr[]) {
        long n = arr.length;
        long expectedSum = n * (n + 1) / 2;
        long actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += Math.abs(arr[i]);
        }
        return (int) (expectedSum - actualSum);
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
        int repeating = findRepeating(arr);
        int missing = repeating + findMissing(arr);
        System.out.println("Repeating number: " + repeating);
        System.out.println("Missing number: " + missing);
        sc.close();
    }

}
