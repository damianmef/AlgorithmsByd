package Graphs;

import java.util.ArrayList;

public class StructS {
    private ArrayList<Integer> neighborsCollection;
    private int neighborsCounter;

    public StructS() {
        this.neighborsCollection = new ArrayList<Integer>();
        this.neighborsCounter = 0;
    }

    public ArrayList<Integer> getNeighborsCollection() {
        return neighborsCollection;
    }

    public void setNeighborsCollection(ArrayList<Integer> neighborsCollection) {
        this.neighborsCollection = neighborsCollection;
    }

    public int getNeighborsCounter() {
        return neighborsCounter;
    }

    public void setNeighborsCounter(int neighborsCounter) {
        this.neighborsCounter = neighborsCounter;
    }



    @Override
    public String toString() {
        return "StructS{" +
                "neighborsCollection=" + neighborsCollection +
                ", neighborsCounter=" + neighborsCounter +
                '}';
    }
}
