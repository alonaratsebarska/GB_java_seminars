package SeminarsWork;
/* Task 67. Add Binary
 * https://leetcode.com/problems/add-binary/
 * Given two binary strings a and b, return their sum as a binary string.
 * Example:
 * Input: a = "1010", b = "1011"
 * Output: "10101" */

public class Sem1LeetCode67 {
    public static void main(String[] args) {
        String a = "1";
        String b = "11";
        System.out.println(addBinary(a, b));

    }

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int j = b.length() - 1;
        int carry = 0;
        String res = "";
        for(int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                ++carry;
            }
            if (j >= 0 && b.charAt(j) == '1')  {
                ++carry;
            }
            res = (carry % 2) + res;
            carry /= 2;
            --j;
        }
        if (carry == 1) {
            res = 1 + res;
        }
        return res;
     }
}
