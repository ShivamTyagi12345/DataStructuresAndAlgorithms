package day4.imp;

import parent_class.TreeNode;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return true;

        if (root.left == null || root.right == null || root.right.val != root.left.val)
            return false;

        return (isSymmetric(root.left) && isSymmetric(root.right));

    }

    public static void main(String[] args) {

        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(s.isSymmetric(root));
    }
}
