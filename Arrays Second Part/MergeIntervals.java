import java.util.*;

/* 
    Question-8 : Given an array of intervals where intervals[i] = [starti, endi], 
    merge all overlapping intervals, and return an array of the non-overlapping 
    intervals that cover all the intervals in the input.
*/

public class MergeIntervals {
    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + arr[i][0] + ", " + arr[i][1] + "]");
        }
    }

    public static int[][] merge(int arr[][]) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        result.add(arr[0]);
        for (int interval[] : arr) {
            int start = interval[0];
            int end = interval[1];
            int lastEnd = result.get(result.size() - 1)[1];
            if (start <= end) {
                result.get(result.size() - 1)[1] = Math.max(lastEnd, end);
            } else {
                result.add(new int[] { start, end });
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of intervals");
        int size = sc.nextInt();
        int arr[][] = new int[size][2];
        System.out.println("Enter the intervals");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The original intervals are : ");
        display(arr);

        int merged[][] = merge(arr);
        System.out.println("The merged intervals are : ");
        display(merged);
        sc.close();
    }

}
