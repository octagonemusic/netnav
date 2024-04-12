package com.octagone.services;

import com.octagone.services.Utilities.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class DjikstraShortestPath {
    // find the shortest path using djikstra's algorithm
    public static int djikstra(HashMap<Integer, ArrayList<Pair>> map, int start, int end) {
        // create a priority queue
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        // create a hashmap to store the distance of each vertex from the start vertex
        Map<Integer, Integer> dist = new HashMap<Integer, Integer>();
        for (Integer vertexId : map.keySet()) {
            dist.put(vertexId, Integer.MAX_VALUE);
        }
        dist.put(start, 0);

        // add the start node to the priority queue
        pq.insert(new Pair(start, 0));

        // while the priority queue is not empty
        while (!pq.isEmpty()) {
            Pair p = pq.extractMin();
            int u = p.getVertex();
            // int w = p.getWeight();

            // for each neighbor of u
            for (Pair neighbor : map.get(u)) {
                int v = neighbor.getVertex();
                int weight = neighbor.getWeight();

                // if the distance to v is greater than the distance to u + weight of edge u-v
                if (dist.get(v) > dist.get(u) + weight) {
                    // update the distance to v
                    dist.put(v, dist.get(u) + weight);
                    // add v to the priority queue
                    pq.insert(new Pair(v, dist.get(v)));
                }
            }
        }

        return dist.get(end);
    }
}
