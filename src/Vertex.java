import java.util.HashMap;
import java.util.Map;

public class Vertex<T> {

    private T data;

    // соседняя вершина + вес ребра
    private Map<Vertex<T>, Double> adjacentVertices = new HashMap<>();

    public Vertex(T data) {
        this.data = data;
    }

    public void addAdjacentVertex(Vertex<T> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public T getData() {
        return data;
    }

    public Map<Vertex<T>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}