import java.util.ArrayList;
import java.util.List;

import Parents.TreeNode;

/*
 * @lc app=leetcode id=114 lang=java
 *
 * [114] Flatten Binary Tree to Linked List
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        flatten(root);
    }

    public static void flatten(TreeNode root) {
        // 1
        // 2 5
        // 3 4 6

        // 1 2 3 4 5 6

        // If you notice carefully in the flattened tree, each node's right child points
        // to the next node of a pre-order traversal.\
        List<Integer> list = new ArrayList<>();
        helper(root, list);

        root = flat(root, list, 0);

    }

    private static TreeNode flat(TreeNode res, List<Integer> list, int i) {
        if (i == list.size())
            return res;
        res = new TreeNode(list.get(i));
        res.left = null;

        res.right = flat(res.right, list, i + 1);
        return res;

    }

    private static void helper(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);

    }
}
// @lc code=end
