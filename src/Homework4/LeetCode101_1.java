package Homework4;
import java.util.Deque;
import java.util.ArrayDeque;

/* Task 101. Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/description/
 */

 /*public */ class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LeetCode101_1 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        if(root.left == null && root.right == null)return true;
        if(root.left == null || root.right == null)return false;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root.left);
        stack.push(root.right);
        while(!stack.isEmpty()){
            TreeNode right = null;
            TreeNode left = null;
            if(!stack.isEmpty()){
                right = stack.pop();
            }
            if(!stack.isEmpty()){
                left = stack.pop();
            }
            if(left == null || right == null)return false;
            if(left.val != right.val)return false;
            if(left.left != null && right.right != null){
                stack.push(left.left);
                stack.push(right.right);
            }
            else if(!(left.left == null && right.right == null))return false;

            if(left.right != null && right.left != null){
                stack.push(left.right);
                stack.push(right.left);
            }
            else if(!(left.right == null && right.left == null))return false;

        }
        return true;
    }
}
