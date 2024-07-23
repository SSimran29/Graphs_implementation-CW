package graph;

import java.util.HashSet;

public class Graph {
    HashSet<GraphNode> graph;

    public Graph(){
        graph = new HashSet<>();
    }
    //connecting two nodes
    public void connect(GraphNode node1, GraphNode node2){
        node1.addNeighbor(node2);
        node2.addNeighbor(node1);

        graph.add(1);
        graph.add(2);
        // bfs and dfs
    }
}
