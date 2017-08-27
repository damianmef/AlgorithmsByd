package Graphs;

public class GraphGnf {

    /*
    Losujemy wszystkie krawędzie z struktury Edge[] z jednakowym
    prawdopodobieństem, jeśli krawędź możemy dodać do grafu
    (jego stopień nie jest maksymalny) to dodajemy, w przeciwnym
    wypadku odrzucamy ją
     */

    public static Edge2[] generateGraphGnf(int vertexNumber, int maxVertexDegree) {

        Edge2[] edge2Array = Structures.generateEdge2Array(vertexNumber);
        int[] neighborCounterArray = new int[vertexNumber];
        int maxIndex = edge2Array.length - 1;
        for (int i = 0; i < edge2Array.length; i++) {
            int randomIndex = (int) (Math.random() * maxIndex);

            Edge2 tempEdge2 = edge2Array[randomIndex];
            edge2Array[randomIndex] = edge2Array[maxIndex];
            edge2Array[maxIndex] = tempEdge2;


            if (neighborCounterArray[edge2Array[maxIndex].getFirstVertex()] < maxVertexDegree
                    && neighborCounterArray[edge2Array[maxIndex].getSecondVertex()] < maxVertexDegree) {

                edge2Array[maxIndex].setEdgeExist(true);
                neighborCounterArray[edge2Array[maxIndex].getFirstVertex()]++;
                neighborCounterArray[edge2Array[maxIndex].getSecondVertex()]++;

            }

            maxIndex--;
        }


        return edge2Array;
    }
}
