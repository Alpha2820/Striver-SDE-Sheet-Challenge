import java.util.*;

/* 
    Question-13 : Search in a 2D Matrix.
    Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
    Integers in each row are sorted from left to right.
    The first integer of each row is greater than the last integer of the previous row.
*/

public class SearchInA2DMatrix {
    public static boolean searchMatrix(int arr[][], int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        int low = 0;
        int high = (rows * cols) - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = arr[mid / cols][mid % cols];
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target element to search");
        int target = sc.nextInt();
        boolean found = searchMatrix(matrix, target);
        if (found) {
            System.out.println("Element found in the matrix");
        } else {
            System.out.println("Element not found in the matrix");
        }
        sc.close();
    }

}
