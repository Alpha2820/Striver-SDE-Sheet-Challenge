import java.util.*;

/*
  Question 19 : Longest Consecutive Sequence in an Array.
  Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
*/

public class LongestConsecutiveSequenceInAnArray {
    public static int longestConsecutive(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int longestStreak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = longestConsecutive(arr);
        System.out.println("The length of the longest consecutive sequence is : " + ans);
        sc.close();

    }

}
