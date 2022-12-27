package SeminarsWork;

/* Task 1281. Subtract the Product and Sum of Digits of an Integer
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * Example :
 * Input: n = 4421
 * Output: 21
 * Explanation:
 * Product of digits = 4 * 4 * 2 * 1 = 32
 * Sum of digits = 4 + 4 + 2 + 1 = 11
 * Result = 32 - 11 = 21 */

public class Sem1LeetCode1281 {
    public static void main(String[] args) {
        int num = 4421;
        System.out.println(subtractProductAndSum(num));

    }
    public static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            prod *= digit;
            sum += digit;

            n /= 10;
        }
        return prod - sum;
    }
}
