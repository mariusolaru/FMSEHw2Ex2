package com.faculty;

import java.util.Arrays;
import java.util.LinkedList;
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

        List<Edge> edges1 = new LinkedList<>(Arrays.asList(edge1, edge2, edge3, edge4, edge5, edge6, edge7, edge8));
        Graph graph1 = new Graph(edges1);

        System.out.println("G1:");
        Graph.printGraphAdjacencyList(graph1, VERTEX_ROOT_NUMBER);

        Edge edge9 = new Edge(0, 1);
        Edge edge10 = new Edge(1, 2);
        Edge edge11 = new Edge(2, 3);
        Edge edge12 = new Edge(3, 5);
        Edge edge13 = new Edge(3, 1);

        List<Edge> edges2 = new LinkedList<>(Arrays.asList(edge9, edge10, edge11, edge12, edge13));
        Graph graph2 = new Graph(edges2);

        System.out.println("G2:");
        Graph.printGraphAdjacencyList(graph2, VERTEX_ROOT_NUMBER);
        System.out.println("-------------");


        Graph g3 = Graph.differenceOfTwoGraphs(graph1, graph2);

        System.out.println();
        System.out.println("G1\\G2");
        Graph.printGraphAdjacencyList(g3, VERTEX_ROOT_NUMBER);

    }
}
