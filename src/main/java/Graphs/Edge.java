package Graphs;

public class Edge {
    private int firstVertex;
    private int secondVertex;

    public Edge() {
        this.firstVertex = 0;
        this.secondVertex = 0;
    }

    public Edge(int firstVertex, int secondVertex) {
        this.firstVertex = firstVertex;
        this.secondVertex = secondVertex;
    }

    public int getFirstVertex() {
        return firstVertex;
    }

    public void setFirstVertex(int firstVertex) {
        this.firstVertex = firstVertex;
    }

    public int getSecondVertex() {
        return secondVertex;
    }

    public void setSecondVertex(int secondVertex) {
        this.secondVertex = secondVertex;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "firstVertex=" + firstVertex +
                ", secondVertex=" + secondVertex +
                '}';
    }
}
