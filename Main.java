package graph;

public class Main {
    public static void main(String[] args) {
        GraphNode a = new GraphNode("A");
        GraphNode b = new GraphNode("B");
        GraphNode c = new GraphNode("C");
        GraphNode d = new GraphNode("D");
        GraphNode e = new GraphNode("E");
        GraphNode f = new GraphNode("F");
        GraphNode g = new GraphNode("G");

        Graph graph = new Graph();
        graph.connect(a,b);
        graph.connect(a,c);
        graph.connect(a,d);
        graph.connect(b,e);
        graph.connect(b,f);
        graph.connect(c,g);
        graph.connect(d,g);
        graph.connect(e,g);
        graph.connect(f,g);

    }
}  
