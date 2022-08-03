
import java.util.ArrayList;
import java.util.List;

import Parents.TreeNode;


public class BalancedBST {

    static List<Integer> list;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode( 2);
        root.right=new TreeNode( 3);
        root.right.left=new TreeNode( 4);
        inorder(root);
    }
    public  static void balanceBST(TreeNode root) {
     list=new ArrayList<>();
     inorder(root);
     System.out.println(list);
        
    }
    private static void inorder(TreeNode root) {
        if(root==null)return;
        inorder(root.left);
        // System.out.println( root.val);
        list.add(root.val);
        
        inorder(root.right);
        
    }
    
    
}
