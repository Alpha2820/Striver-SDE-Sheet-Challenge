import java.util.*;

/* 
    Question-7 : You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
    You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/

public class RotateMatrixBy90Degree {
    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverse(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of the Array");
        int rows = sc.nextInt();
        System.out.println("Enter the columns of the Array");
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The original array is : ");
        display(arr);
        System.out.println("The transposed array is : ");
        transpose(arr);
        display(arr);
        System.out.println("The rotated array is : ");
        reverse(arr);
        display(arr);
        sc.close();
    }

}
