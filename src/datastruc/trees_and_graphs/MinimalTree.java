package datastruc.trees_and_graphs;

/**
 * Given a sorted(increasing order) array with unique integer elements, write
 *  an algorithm to create a binary search tree with minimal height
 */
public class MinimalTree {

    public static void main(String[] args) {
        Integer[] intArr = new Integer[6];
        intArr[0] = 0;
        intArr[1] = 1;
        intArr[2] = 2;
        intArr[3] = 3;
        intArr[4] = 4;
        intArr[5] = 5;
        TreeNode root = minimalTree(intArr, 0, 5);
        System.out.println("  " + root.value);
        System.out.println(" " + root.left.value + "  " + root.right.value);
        System.out.println((root.left.left == null? "?":root.left.left.value) + " " + (root.left.right == null?"?":root.left.right.value) +
                (root.right.left == null ? "?":root.right.left.value) + " " + (root.right.right == null ? "?":root.right.right.value));

    }

    //binary search tree
    //It's impossible to build complete binary search tree, since it's vary hard to know how many left child on the
    //left branch.
    private static TreeNode minimalTree(Integer[] intArr, int begin, int end) {
        if (begin > end) {
            return null;
        }

        int mid = (begin + end)/2;
        int midVal = intArr[mid];
        TreeNode root = new TreeNode(midVal);
        root.left = minimalTree(intArr, begin, mid - 1);
        root.right = minimalTree(intArr, mid + 1, end);
        return root;
    }


}
