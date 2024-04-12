package com.octagone.services;

import java.util.HashMap;
import java.util.ArrayList;
import com.octagone.services.Utilities.ConvertArraytoHashmap;
import com.octagone.services.Utilities.Pair;

public class BestRouteFinder {
    // find the best route given a 2d array using djikstra's shortest path algorithm
    public static int findBestRoute(int[][] edges, int start, int end) {
        // convert 2d array to a hashmap
        HashMap<Integer, ArrayList<Pair>> map = ConvertArraytoHashmap.convert(edges);
        // find the best route
        int bestRoute = DjikstraShortestPath.djikstra(map, start, end);
        return bestRoute;
    }

}
