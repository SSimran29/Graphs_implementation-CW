package graph;

import java.util.HashSet;

public class GraphNode {
    char data;
    HashSet<GraphNode> neighbors;

    public GraphNode(char c){
        data = c;
        neighbors = new HashSet<>();
    }
    public void addNeighbor(GraphNode n){
        neighbors.add(n);
    }
    public void removeNeighbor(GraphNode n){
        neighbors.remove(n);
    }
    //has neighbor
    public boolean hasNeighbor(GraphNode n){
        return neighbors.contains(n);
    }
    //to string
    public String toString(){
        StringBuilder res = new StringBuilder("");
        res.append(data + " | ");
        for(GraphNode n : neighbors){
            res.append(n.data + " ");
        }
        return res.toString();
    }

}
