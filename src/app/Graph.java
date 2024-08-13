package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    public Map<Integer, List<Integer>> graph;

    public Graph() {
        this.graph = new HashMap<>();
    }

    public void addVertex(int vertex) {

        if (!graph.containsKey(vertex)) {
            graph.put(vertex, new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        this.addVertex(source);
        this.addVertex(destination);

        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }


    public void removeVertex(int vertex) {
        if (graph.containsKey(vertex)) {
            for (int adjacent : graph.get(vertex)) {
                graph.get(adjacent).remove((Integer) vertex);
            }
            graph.remove(vertex);
        }
    }

    public void removeEdge(int source, int destination) {
        if (graph.containsKey(source) && graph.containsKey(destination)) {
            graph.get(source).remove((Integer) destination);
            graph.get(destination).remove((Integer) source);
        }
    }

    public boolean hasVertex(int vertex) {
        return graph.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        return graph.containsKey(source) && graph.get(source).contains(destination);
    }

    @Override
    public String toString() {
        return graph.toString();
    }
}

