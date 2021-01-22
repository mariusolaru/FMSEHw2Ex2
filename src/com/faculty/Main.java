package com.faculty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Integer VERTEX_ROOT_NUMBER = 0;

    public static void main(String[] args) {
        Edge edge1 = new Edge(0, 1);
        Edge edge2 = new Edge(1, 2);
        Edge edge3 = new Edge(1, 3);
        Edge edge4 = new Edge(2, 4);
        Edge edge5 = new Edge(2, 5);
        Edge edge6 = new Edge(3, 5);
        Edge edge7 = new Edge(4, 1);
        Edge edge8 = new Edge(5, 6);

        List<Edge> edges = new ArrayList<>(Arrays.asList(edge1, edge2, edge3, edge4, edge5, edge6, edge7, edge8));
        Graph graph = new Graph(edges);

        graph.printGraphAdjacencyList(graph, VERTEX_ROOT_NUMBER);
    }
}
