import java.util.*;

/*
  Question 17 : Two Sum.
  Given an array of integers, return indices of the two numbers such 
  that they add up to a specific target.
*/
public class TwoSum {
    public static int[] add(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = target - arr[i];
            if (map.containsKey(value)) {
                return new int[] { map.get(value), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int ans[] = add(arr, target);
        System.out.println("The indices of the two numbers are : " + ans[0] + " and " + ans[1]);
        sc.close();
    }

}
