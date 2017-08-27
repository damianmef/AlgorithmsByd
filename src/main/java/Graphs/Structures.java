package Graphs;

public class Structures {
    public static Edge[] generateEdgeArray(int vertexNumber) {

        /* wyliczamy maksymalną liczbę krawędzi */
        int maxEdges = vertexNumber*(vertexNumber-1)/2;
        Edge[] edgesArray = new Edge[maxEdges];

        int index = 0;
        /* przechodzimy przez "prawy trójkąt" tablicy A */
        for (int i = 0; i < vertexNumber -1;i++) {
            for (int j = i + 1; j < vertexNumber;j++) {

                /* dla każdej krawędzi A tworzymy nowy element
                typu Edge i wstawiamy go w wynikową tablicę
                 */
                Edge newEdge = new Edge(i,j);
                edgesArray[index] = newEdge;
                index++;
            }
        }
        return edgesArray;
    }

    public static Edge2[] generateEdge2Array(int vertexNumber) {
        /* wygeneruj strukturę typu Edge[] */
        Edge[] tempEdgeArray = generateEdgeArray(vertexNumber);
        Edge2[] edges2Array = new Edge2[tempEdgeArray.length];

        /* przepisuj z struktury Edge o Edge2 krawędzie */
        for(int i = 0; i < tempEdgeArray.length; i++) {
            Edge2 item = new Edge2(tempEdgeArray[i].getFirstVertex(), tempEdgeArray[i].getSecondVertex(), false);
            edges2Array[i] = item;
        }
        return edges2Array;
    }

}
