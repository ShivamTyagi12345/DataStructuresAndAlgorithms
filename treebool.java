// import java.util.Stack;

// import javax.management.relation.Role;

// import Parents.TreeNode;

// public class treebool {
//     public static void main(String[] args) {
//         TreeNode root= new TreeNode(2);
//         root.left=new TreeNode(0);
//         root.right=new TreeNode(3);
//         root.right.left=new TreeNode(1);
//     }

//     public  static boolean evaluateTree(TreeNode root) {
//         if (root == null)
//             return false;
//         return binary(root);

//     }

//     private static boolean binary(TreeNode root) {
       


//         if (root.left == null && root.right == null) {
//             return root.val == 0 ? false : true;
//         }

//         boolean left=binary(root.left);
//         boolean right=binary(root.right);
        


//         return root.val==2? left||right: left&&right;
//     }

// }
