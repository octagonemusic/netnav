package com.octagone.services.Utilities;

import java.util.HashMap;
import java.util.ArrayList;

public class ConvertArraytoHashmap {
    // convert 2d array to a hashmap
    public static HashMap<Integer, ArrayList<Pair>> convert(int[][] edges) {
        HashMap<Integer, ArrayList<Pair>> map = new HashMap<Integer, ArrayList<Pair>>();
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            if (!map.containsKey(u)) {
                map.put(u, new ArrayList<Pair>());
            }
            if (!map.containsKey(v)) {
                map.put(v, new ArrayList<Pair>());
            }
            map.get(u).add(new Pair(v, w));
            map.get(v).add(new Pair(u, w));
        }

        // // print the hashmap
        // for (Integer key : map.keySet()) {
        // // print key and values of array list as well
        // System.out.print(key + " : ");
        // for (Pair p : map.get(key)) {
        // System.out.print("(" + p.getVertex() + ", " + p.getWeight() + ")");
        // }
        // System.out.println();
        // }

        return map;
    }
}
