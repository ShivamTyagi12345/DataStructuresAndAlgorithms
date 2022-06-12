//lowest common ancestor of binary tree
package day4;

import java.util.*;

import parent_class.TreeNode;

/**
 * lowest
 */
public class lowest {

    // function to lowest common ancestor of binary tree
    HashMap<TreeNode, TreeNode> map = new HashMap<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // travel(root,null,p.val,q.val);
        // if(map.get(p).val==map.get(q).val){
        // return map.get(p);
        // }
        // else if(p.left==q || p.right==q ){
        // return p;
        // }
        // else if(q.left==p || q.right==p ){
        // return q;
        // }
        // return null;
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;

    }

    public void travel(TreeNode root, TreeNode parent, int p, int q) {
        if (root == null)
            return;
        if (root.val == p || root.val == q) {
            map.put(root, parent);
        }
        travel(root.left, root, p, q);
        travel(root.right, root, p, q);

    }
}
