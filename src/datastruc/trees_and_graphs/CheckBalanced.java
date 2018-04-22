package datastruc.trees_and_graphs;

/**
 * Implement a function to check if a binary tree is balanced.
 */
public class CheckBalanced {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(4);
        System.out.println(getMaxDepth(root, 0));
    }

    private static int getMaxDepth(TreeNode root, int level) {
        if (root == null) {
            return level-1;
        }
        int i = getMaxDepth(root.left, level + 1);
        int j = getMaxDepth(root.right, level + 1);
        if(i == -1 || j == -1) {
            return -1;
        }

        int diff = Math.abs(i-j);
        if (diff > 1) {
            return -1;
        }
        return Math.max(i, j);
    }
}
