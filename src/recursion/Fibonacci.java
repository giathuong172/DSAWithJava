package recursion;

public class Fibonacci {
    /*
    The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
     */
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
 //
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        long[][] baseMatrix = {{1, 1}, {1, 0}};
        long[][] resultMatrix = powerMatrix(baseMatrix, n - 1);
        return resultMatrix[0][0];
    }

    private static long[][] powerMatrix(long[][] matrix, int exponent) {
        if (exponent == 0) {
            return new long[][]{{1, 0}, {0, 1}}; // Ma trận đơn vị
        }
        long[][] half = powerMatrix(matrix, exponent / 2);
        long[][] result = multiply(half, half);
        if (exponent % 2 == 1) {
            result = multiply(result, matrix);
        }
        return result;
    }

    private static long[][] multiply(long[][] a, long[][] b) {
        long[][] result = new long[2][2];
        result[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        result[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        result[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        result[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
        return result;
    }
}


