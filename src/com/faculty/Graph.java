package com.faculty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    private List<List<Node>> adjacencyList = new LinkedList<>();

    public Graph(List<Edge> edges)
    {
        for (int i = 0; i < edges.size(); i++)
            adjacencyList.add(i, new ArrayList<>());

        for (Edge e : edges)
        {
            adjacencyList.get(e.getSource()).add(new Node(e.getDestination()));
        }
    }

    public void printGraphAdjacencyList(Graph graph, int vertexRootNumber)  {
        while (vertexRootNumber < graph.adjacencyList.size()) {
            for (Node edge : graph.adjacencyList.get(vertexRootNumber)) {
                System.out.print(vertexRootNumber + " -> " + edge.getValue() + "\t");
            }
            System.out.println();
            vertexRootNumber++;
        }
    }

}
