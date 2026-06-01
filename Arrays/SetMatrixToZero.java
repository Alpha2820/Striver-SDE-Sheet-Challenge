package Arrays;

import java.util.*;

/*
    Question -1 : Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
    You must do it in place.
*/

public class SetMatrixToZero {
    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        boolean rows[] = new boolean[row];
        boolean cols[] = new boolean[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rows[i] == true || cols[j] == true) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The original matrix is : ");
        display(arr);
        System.out.println("The matrix after setting the rows and columns to zero is : ");
        setZeroes(arr);
        display(arr);
        sc.close();
    }

}
