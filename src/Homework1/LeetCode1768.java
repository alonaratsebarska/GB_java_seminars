package Homework1;
/* Task 1768. Merge Strings Alternately
 * https://leetcode.com/problems/merge-strings-alternately/description/
 * Example:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 */

public class LeetCode1768 {
    /*public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));

    }*/
    public static String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length(), i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < m && i < n) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        if (i == m && i != n) sb.append(word2.substring(i, n));
        else if (i == n && i != m) sb.append(word1.substring(i, m));
        return sb.toString();
    }
}
