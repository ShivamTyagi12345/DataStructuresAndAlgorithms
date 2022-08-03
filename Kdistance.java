// import java.util.ArrayList;
// import java.util.List;

// import Parents.TreeNode;

// public class Kdistance {
//     public static void main(String[] args) {
        
//         TreeNode rootNode =new TreeNode(40);
//         TreeNode node20=new TreeNode(20);
//         TreeNode node10=new TreeNode(10);
//         TreeNode node30=new TreeNode(30);
//         TreeNode node60=new TreeNode(60);
//         TreeNode node50=new TreeNode(50);
//         TreeNode node70=new TreeNode(70);
 
//         rootNode.left=node20;
//         rootNode.right=node60;
 
//         node20.left=node10;
//         node20.right=node30;
 
//         node60.left=node50;
//         node60.right=node70;
//         int k = 2;
//         TreeNode target = new TreeNode(100);

//         System.out.println(depth(rootNode,target,0));

//         // System.out.println(distanceK(root, target, k));
//     }
//     // public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
//     //     List<Integer> ans = new ArrayList<>();

//     private static int depth(TreeNode root, TreeNode target,int count) {
//      if(root == null) return 0;
//      if(root.val==target.val)return count;
//      int result=depth(root.left, target,count+1);
//      if(result!=0)return result;
//       result=depth(root.right, target,count+1);
//      return result;
//     }
        

//     // }




// }
