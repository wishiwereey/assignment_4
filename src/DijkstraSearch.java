import java.util.*;

public class DijkstraSearch<T> {

    public Map<Vertex<T>, Double> dijkstra(Vertex<T> start) {

        Map<Vertex<T>, Double> distances = new HashMap<>();
        PriorityQueue<Vertex<T>> pq =
                new PriorityQueue<>(Comparator.comparingDouble(distances::get));

        distances.put(start, 0.0);
        pq.add(start);

        while (!pq.isEmpty()) {

            Vertex<T> current = pq.poll();

            for (Map.Entry<Vertex<T>, Double> entry :
                    current.getAdjacentVertices().entrySet()) {

                Vertex<T> neighbor = entry.getKey();
                double weight = entry.getValue();

                double newDistance =
                        distances.get(current) + weight;

                if (!distances.containsKey(neighbor)
                        || newDistance < distances.get(neighbor)) {

                    distances.put(neighbor, newDistance);
                    pq.add(neighbor);
                }
            }
        }

        return distances;
    }
}