import java.util.*;

/*
    Question-10 : Given an array of integers nums containing 
    n + 1 integers where each integer is in the range [1, n] 
    inclusive. There is only one repeated number in nums, 
    return this repeated number.
   
*/
public class FindDuplicateNumber {
    public static int duplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int num = Math.abs(arr[i]);
            if (arr[num] < 0) {
                return num;
            }
            arr[num] = -arr[num];
        }
        return 0;
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
        int ans = duplicate(arr);
        System.out.println("The duplicate number is : " + ans);
        sc.close();

    }

}
