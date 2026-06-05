import java.util.*;

/*
    Question-13 : Majority Element.
    Given an array of size n, find the majority element.
    The majority element is the element that appears more 
    than ⌊ n/2 ⌋ times. You may assume that the majority 
    element always exists in the array.
*/

public class MajorityElementPartFirst {
    public static int findMajorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int majorityElement = findMajorityElement(nums);
        System.out.println("The majority element is: " + majorityElement);
        sc.close();
    }

}
