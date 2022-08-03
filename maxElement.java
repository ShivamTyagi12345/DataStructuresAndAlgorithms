import Parents.TreeNode;

public class maxElement {

    public static int goodNodes(TreeNode root) {
        return helper(root, root.val);
    }

    public static int helper(TreeNode node, int max) {
        if (node == null)
            return 0;

        int goodNodes = 0;
        if (node.val >= max) {
            goodNodes++;
            max = node.val;
        }
        int l = helper(node.left, max);
        int r = helper(node.right, max);

        return goodNodes + l + r;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        System.out.println(goodNodes(root));
    }

}
