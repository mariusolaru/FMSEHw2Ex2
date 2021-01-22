package com.faculty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    public List<List<Node>> adjacencyList = new LinkedList<>();

    public List<List<Node>> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<List<Node>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public Graph(List<Edge> edges)
    {
        for (int i = 0; i < edges.size(); i++)
            adjacencyList.add(i, new ArrayList<>());

        for (Edge e : edges)
        {
            adjacencyList.get(e.getSource()).add(new Node(e.getDestination()));
        }
    }

    public static void printGraphAdjacencyList(Graph graph, int vertexRootNumber) {
        while (vertexRootNumber < graph.getAdjacencyList().size()) {
            for (Node edge : graph.getAdjacencyList().get(vertexRootNumber)) {
                System.out.print(vertexRootNumber + " -> " + edge.getValue() + "\t");
            }
            System.out.println();
            vertexRootNumber++;
        }
    }

    public static Graph differenceOfTwoGraphs(Graph g1, Graph g2) {
        for(List<Node> nodes1 : g1.getAdjacencyList()) {
            for(List<Node> nodes2 : g2.getAdjacencyList()) {
                nodes1.removeAll(nodes2);
            }
        }
        return g1;
    }

}
