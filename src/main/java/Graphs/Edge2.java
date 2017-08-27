package Graphs;

public class Edge2 {
    private int firstVertex;
    private int secondVertex;
    private boolean edgeExist;

    public Edge2() {
        this.firstVertex = 0;
        this.secondVertex = 0;
        this.edgeExist = false;
    }

    public Edge2(int firstVertex, int secondVertex, boolean edgeExist) {
        this.firstVertex = firstVertex;
        this.secondVertex = secondVertex;
        this.edgeExist = edgeExist;
    }

    @Override
    public String toString() {
        return "Edge2{" +
                "firstVertex=" + firstVertex +
                ", secondVertex=" + secondVertex +
                ", edgeExist=" + edgeExist +
                '}';
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

    public boolean isEdgeExist() {
        return edgeExist;
    }

    public void setEdgeExist(boolean edgeExist) {
        this.edgeExist = edgeExist;
    }


}
