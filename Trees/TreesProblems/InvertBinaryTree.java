package Trees.TreesProblems;

import Trees.TreeNode;

public class InvertBinaryTree {
    public void invertTree(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode originalLeft = root.left;
        root.left = root.right;
        root.right = originalLeft;

        invertTree(root.left);
        invertTree(root.right);

    }
}
