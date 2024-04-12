package com.octagone.services.Utilities;

import com.octagone.services.BestRouteFinder;

public class Test {
    public static void main(String args[]) {
        // test 2d array to hashmap conversion
        int[][] edges = { { 1, 2, 2 }, { 2, 3, 1 }, { 3, 4, 2 }, { 2, 5, 5 }, { 4, 5, 1 }, { 4, 7, 20 }, { 5, 7, 10 } };
        // HashMap<Integer, ArrayList<Pair>> map = ConvertArraytoHashmap.convert(edges);
        // map.forEach((k, v) -> {
        // System.out.print(k + " : ");
        // v.forEach(p -> {
        // System.out.print("(" + p.getVertex() + ", " + p.getWeight() + ")");
        // });
        // System.out.println();
        // });
        // find shortest path

        int start = 1;
        int end = 7;

        int bestRoute = BestRouteFinder.findBestRoute(edges, start, end);

        System.out.println("Best route from " + start + " to " + end + " is: " + bestRoute);

    }
}
