// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;

// import Parents.TreeNode;

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  * int val;
//  * TreeNode left;
//  * TreeNode right;
//  * TreeNode() {}
//  * TreeNode(int val) { this.val = val; }
//  * TreeNode(int val, TreeNode left, TreeNode right) {
//  * this.val = val;
//  * this.left = left;
//  * this.right = right;
//  * }
//  * }
//  */

// class BSTIterator {
//     public static void main(String[] args) {
//         TreeNode root= new TreeNode(7);
//         root.left=new TreeNode(3);
//         root.right=new TreeNode(15);
//         root.right.left=new TreeNode(9);
//         root.right.right=new TreeNode(20);
//         System.out.println();

        
//     }
//     // TreeNode root;

//     static Queue<Integer> queue = new LinkedList<>();

//     public BSTIterator(TreeNode root) {
//         root = new TreeNode();
//         inorder(root);
       

//     }

//     private  static void inorder(TreeNode root) {
//         if (root == null)
//             return;
//         inorder(root.left);
//         queue.add(root.val);
//         inorder(root.right);

//     }

//     public static int next() {

//         return (queue.size() > 0) ? queue.poll() : -1;

//     }

//     public static boolean hasNext() {
//         return (queue.size()>0);


//     }
// }

// /**
//  * Your BSTIterator object will be instantiated and called as such:
//  * BSTIterator obj = new BSTIterator(root);
//  * int param_1 = obj.next();
//  * boolean param_2 = obj.hasNext();
//  */