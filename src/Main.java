import java.util.Map;

public class Main {

    public static void main(String[] args) {

        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> a = new Vertex<>("A");
        Vertex<String> b = new Vertex<>("B");
        Vertex<String> c = new Vertex<>("C");
        Vertex<String> d = new Vertex<>("D");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);

        graph.addEdge(a, b, 1);
        graph.addEdge(a, c, 4);
        graph.addEdge(b, c, 2);
        graph.addEdge(b, d, 5);
        graph.addEdge(c, d, 1);

        System.out.println("BFS:");
        BreadthFirstSearch<String> bfs =
                new BreadthFirstSearch<>();

        bfs.bfs(a);

        System.out.println("\nDijkstra:");

        DijkstraSearch<String> dijkstra =
                new DijkstraSearch<>();

        Map<Vertex<String>, Double> distances =
                dijkstra.dijkstra(a);

        for (Map.Entry<Vertex<String>, Double> entry :
                distances.entrySet()) {

            System.out.println(
                    "Distance from A to "
                            + entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }
    }
}