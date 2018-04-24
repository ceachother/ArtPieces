package datastructure.trees_and_graphs;

import java.util.Queue;
import java.util.PriorityQueue;

/**
 * 4.10
 * T1 and T2 are two very large binary trees, with T1 much bigger
 * than T2. Create an algorithm to determine if T2 is a subtree of
 * T1.
 * A tree T2 is a subtree of T1 if there exists a node n in T1 such
 * that the subtree of n is identical to T2. That is, if you cut off
 * the tree at node n, the two trees would be identical.
 */
public class CheckSubtree {
    public static void main(String[] args) {

    }

    private static boolean checkSubtree(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> queue = new PriorityQueue<>();
        queue.add(t1);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == t2) {
                return checkIdenticalTree(node, t2);
            }
            if (t1.left != null) {
                queue.add(t1.left);
            }

            if (t1.right != null) {
                queue.add(t1.right);
            }
        }
        return false;
    }

    private static boolean checkIdenticalTree(TreeNode node, TreeNode t2) {
        return node == t2 && checkIdenticalTree(node.left, node.left) && checkIdenticalTree(node.right, t2.right);
    }
}
