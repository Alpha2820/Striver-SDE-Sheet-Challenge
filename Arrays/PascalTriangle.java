package Arrays;

import java.util.*;
/*
    Question -2 : Given an integer numRows, return the first numRows of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
*/

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        triangle.add(arr);
        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j <= i - 1; j++) {
                temp.add((triangle.get(i - 2).get(j - 1) + triangle.get(i - 2).get(j)));
            }
            temp.add(1);
            triangle.add(temp);
        }
        return triangle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's triangle:");
        int numRows = sc.nextInt();
        List<List<Integer>> pascalTriangle = generate(numRows);
        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
        sc.close();
    }

}
