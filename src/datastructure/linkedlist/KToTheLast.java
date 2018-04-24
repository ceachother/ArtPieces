package datastructure.linkedlist;

public class KToTheLast {
    private static Integer k = 2;
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        NodeInt i = new NodeInt();
        i.nodeInt = 0;
        System.out.println(returnKthToLast(node, i).value);
    }

    public static Node returnKthToLast(Node node, NodeInt i) {
        if( node == null)
        {
            i.nodeInt += 1;
            return null;
        } else {
            Node result = returnKthToLast(node.next, i);
            if (result != null) {
                return result;
            }
            if(i.nodeInt == k) {
                return node;
            } else {
                i.nodeInt += 1;
            }
        }
        return null;
    }

    private static void test(Node node) {
        node.value = 666;
    }


}

class NodeInt {
    int nodeInt = 0;
}
