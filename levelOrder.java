import java.util.LinkedList;

import Parents.*;

public class levelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        level(root);

    }

    private static void level(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            System.out.println(queue.poll().val);
            if (root.left != null)
                queue.add(root.left);
            if (root.right != null)
                queue.add(root.right);

        }

    }

}
