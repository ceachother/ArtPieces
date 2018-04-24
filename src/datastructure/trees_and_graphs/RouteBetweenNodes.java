package datastructure.trees_and_graphs;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * Given a directed graph, design an algorithm to find out whether there is a
 * route between two nodes
 */
public class RouteBetweenNodes {
    static Graph graph = new Graph();

    public static void main(String[] args) {
    }
    //BFS
    private static boolean routeBetweenNodes(Node node1, Node node2) {
        Queue<Node> queue = new PriorityQueue();
        Set<Node> nodeSet = new HashSet<>();
        queue.addAll(node1.children);
        nodeSet.addAll(node1.children);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.name.equals(node2.name)) {
                return true;
            }
            for(Node child: node.children){
                if (!nodeSet.contains(child)) {
                    queue.add(child);
                }
            }
        }

        return false;
    }
}
