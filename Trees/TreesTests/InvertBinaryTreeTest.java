package Trees.TreesTests;

import Trees.TreeNode;
import Trees.TreesProblems.InvertBinaryTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvertBinaryTreeTest {
    @Test
    public void testInvertTree() {
        // Create an instance of InvertBinaryTree
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Invert the binary tree
        invertBinaryTree.invertTree(root);

        // Check if the inversion was successful
        assertEquals(root.val, 1);
        assertEquals(root.left.val, 3);
        assertEquals(root.right.val, 2);
        assertEquals(root.right.left.val, 5);
        assertEquals(root.right.right.val, 4);
    }
}
