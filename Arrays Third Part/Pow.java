import java.util.*;

/* 
    Question-14 : Pow(x, n).
    Implement pow(x, n), which 
    calculates x raised to the power n (i.e., x^n
*/

public class Pow {
    public static double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        double res = 1.0;
        long power = Math.abs((long) n);
        while (power > 0) {
            if ((power & 1) == 1) {
                res *= x;
            }
            x *= x;
            power >>= 1;
        }
        return n < 0 ? 1 / res : res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base (x)");
        double x = sc.nextDouble();
        System.out.println("Enter the exponent (n)");
        int n = sc.nextInt();
        double result = myPow(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
        sc.close();
    }

}
