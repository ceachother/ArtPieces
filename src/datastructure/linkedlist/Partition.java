package datastructure.linkedlist;
/**
 *
 * 2.4 Partition
 *     Write code to partition a linked list around a value x, such that all nodes less
 *     than x come before all nodes greater than or equal to x, if x is contained within
 *     the list, the values of x only need to be after the elements less that x(see below).
 *     The partition element x can appear anywhere in the "right partition"; It does not
 *     need to appear between the left and right partitions.
 *     EXAMPLE
 *     Input:   3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1[partition = 5]
 *     Output:  3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 *
 */
public class Partition {
    public static void main(String[] args) {
        Node node = new Node(5);
        node.next = new Node(4);
        node.next.next = new Node(2);
        node.next.next.next = new Node(1);
        node.next.next.next.next = new Node(3);
        System.out.println("" + node.value + node.next.value
                + node.next.next.value + node.next.next.next.value + node.next.next.next.next.value);
//        Node result = partition(node, 3);
        Node result = partition2(node, 3);
        System.out.println("" + result.value + result.next.value
                + result.next.next.value + result.next.next.next.value + result.next.next.next.next.value);
    }
    static Node partition(Node node, int x) {
        Node head = node;
        Node tail = node;

        while (node != null) {
            Node next = node.next;
            if (node.value < x) {
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }

    static Node partition2(Node node, int x) {
        Node head = node;
        Node tail = node;
        while(node != null)
        {
            Node next = node.next();

            if (node.value >= x) {
                tail.next = node;
                tail = tail.next;
            } else {
                head = node;
                head.next = head;
            }
            node = next;
        }
        return head;
    }
}
