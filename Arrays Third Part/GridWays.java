import java.util.*;

/*
    Question-15 : Grid Ways.
    Given a grid of size m x n, find the number of ways to reach from the top-left corner to the bottom-right corner. 
    You can only move either down or right at any point in time.
*/
public class GridWays {
    public static int countWays(int m, int n) {

        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }

        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();
        int ways = countWays(m, n);
        System.out.println("Number of ways to reach from top-left to bottom-right: " + ways);
        sc.close();
    }

}
