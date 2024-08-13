package app;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        getOutput("Add vertices and edges to the graph:\n" + graph);
        getOutput("Does vertex 4 exist? \n" + graph.hasVertex(4));
        getOutput("Edge between 1 and 2? \n" + graph.hasEdge(1, 2));

        graph.removeVertex(3);
        getOutput("Removing vertex 3: \n" + graph);

        graph.removeEdge(1, 2);
        getOutput("Removing edge between 1 and 2: \n" + graph);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
