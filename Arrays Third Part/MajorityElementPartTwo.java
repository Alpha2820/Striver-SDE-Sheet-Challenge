import java.util.*;

/*
    Question-14 : Majority Element II.
    Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. 
*/
public class MajorityElementPartTwo {
    public static List<Integer> majorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        int threshold = arr.length / 3;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> result = majorityElement(arr);
        System.out.println("Majority elements are: " + result);
        sc.close();
    }
}
