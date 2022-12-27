package Homework1;
/* Task 27. Remove Element
 * https://leetcode.com/problems/remove-element/description/
 */
public class LeetCode27 {
    public static int removeElement(int[] A, int elem) {
        int l = A.length;
        for (int i=0; i<l; i++) {
            if (A[i] == elem) {
                A[i--] = A[l-- -1];
            }
        }
        return l;
    }
}
