package com.octagone.services.Utilities;

public class Pair implements Comparable<Pair> {
    // pair for storing the vertex and its weight;
    private int vertex;
    private int weight;

    public Pair(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    public int getVertex() {
        return vertex;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Pair arg0) {
        // return greater weight
        return this.weight - arg0.weight;
    }
}
