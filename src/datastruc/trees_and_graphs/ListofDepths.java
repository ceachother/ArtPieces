package datastruc.trees_and_graphs;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListofDepths {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.left.left = new TreeNode(4);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.right.right = new TreeNode(4);
        treeNode.right.left.left = new TreeNode(4);
        List<List<TreeNode>> lists = new ArrayList<>();
        createList(treeNode,1, lists);
//        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
//        fromBook(treeNode,lists,0);
        System.out.println(lists.size());
    }


    private static void createList(TreeNode treeNode,
                                   int level,
                                   List<List<TreeNode>> lists) {
        if (treeNode == null) {
            return;
        }
        List<TreeNode> nodeList;
        //if list size if smaller than current level(starting from 1), then create a new one
        if(lists.size() < level) {
            nodeList = new ArrayList<>();
            lists.add(nodeList);
        } else {
            nodeList = lists.get(level-1);
        }
        createList(treeNode.left,level + 1, lists);
        nodeList.add(treeNode);
        createList(treeNode.right, level + 1, lists);

    }

    private static void fromBook(TreeNode root, ArrayList<LinkedList<TreeNode>> lists,
                                 int level) {
        if(root == null) {
            return;
        }

        LinkedList<TreeNode> list;
        //if list size is the current level(starting from 0), it means a new list haven't been
        // create before, so create a new one
        if(lists.size() == level) {
            list = new LinkedList<>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(root);
        fromBook(root.left, lists, level + 1);
        fromBook(root.right, lists, level + 1);
    }
}
