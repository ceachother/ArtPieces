package Leetcode;


import java.util.Stack;

/**
 * Created by cecillee on 14/5/2017.
 */
public class PathSum {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(13);
//        TreeNode treeNode = new TreeNode(1);
        System.out.println(hasPathSum(treeNode,22));
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return (root.val == sum);
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x)
    {
        val = x;
    }
}
